package root.caradvisor.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@CrossOrigin
@RestController
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping(value = "authentication")
    public ResponseEntity<Boolean> doesUserExist(@RequestBody UserDto dto) {
        return authService.doesUserExist(dto.getUsername(), dto.getPassword()) ? new ResponseEntity<>(true,
                HttpStatus.OK) : new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "authentication")
    public ResponseEntity<Void> register(@RequestParam(required = false, name = "username") String username) throws
            IOException {
        authService.register(username);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
