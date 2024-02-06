public class Address {
    private String district;
    private String street;
    private int streetNumber;
    public Address(String district, String street, int streetNumber) {
        this.district = district;
        this.street = street;
        this.streetNumber = streetNumber;
    }
    public String getDistrict(){
        return district;
    }
    public String getStreet() {
        return street;
    }
    public int getStreetNumber() {
        return streetNumber;
    }
    public void setDistrict(String str) {
        district = str;
    }
    public void setStreet(String str) {
        street = str;
    }
    public void setStreetNumber(int n) {
        streetNumber = n;
    }
    @Override
    public String toString() {
        return (streetNumber + " " + street + ", " + district);
    }
}
