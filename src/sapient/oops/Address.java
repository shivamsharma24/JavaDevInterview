package sapient.oops;

public class Address {
    private String city;
    private int pinCode;

    //getters and setters method of city and pinCode
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    //constructor
    public Address(String city,int pinCode){
        this.city=city;
        this.pinCode=pinCode;
    }
}
