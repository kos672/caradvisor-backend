package root.caradvisor.model;

public enum Gender {
    MALE("m"), FEMALE("f");

    private String genderSign;

    Gender(String genderSign) {
        this.genderSign = genderSign;
    }

    public String getGenderSign() {
        return genderSign;
    }

    public void setGenderSign(String genderSign) {
        this.genderSign = genderSign;
    }
}
