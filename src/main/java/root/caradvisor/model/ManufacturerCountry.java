package root.caradvisor.model;

public enum ManufacturerCountry {
    JAPAN("JAPONIA", "JP"), USA("STANY ZJEDNOCZONE", "USA"), KOREA("KOREA", "KR"), GERMANY("NIEMCY", "DE"),
    FRANCE("FRANCJA", "FR"), CZECH_REPUBLIC("CZECHY", "CZ");

    private String countryName;
    private String countryCode;

    ManufacturerCountry(String countryName, String countryAbbreviation) {
        this.countryName = countryName;
        this.countryCode = countryAbbreviation;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
