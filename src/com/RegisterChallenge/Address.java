package src.com.RegisterChallenge;

public class Address {

    private String number;
    private String city;
    private String street;
    final String constNumber = "NÃO INFORMADO";

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (!number.isBlank()){
            this.number = number;
        } else {
            this.number = constNumber;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
