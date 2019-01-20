package root.caradvisor.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Service
public class AuthService {

    private AuthRepository repository;
    private PasswordGenerator passwordGenerator;

    @Autowired
    public AuthService(AuthRepository repository, PasswordGenerator passwordGenerator) {
        this.repository = repository;
        this.passwordGenerator = passwordGenerator;
    }

    public boolean doesUserExist(String username, String password) {
        return repository.findByUsernameAndPassword(username, password) != null;
    }

    public void register(String username) throws IOException {
        User u = User.builder().id(null).username(username).password(passwordGenerator.generateRandomString()).build();
        BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.home") + "/Desktop" +
                "/dane_logowania.txt"));
        writer.write(username + " :: " + u.getPassword());
        writer.close();
        repository.save(u);
    }

}
