package kea.gruppe5.project.models;

public class User {
    String name;
    String personnelNumber;
    String email;
    String address;
    String postalCode;
    String city;
    String phoneNumber;
    int id;
    String password;
    String country;

    public User(String name,
                String personnelNumber,
                String email,
                String password,
                String postalCode,
                String city,
                String phoneNumber,
                String address,
                String country) {
        this.name = name;
        this.personnelNumber = personnelNumber;
        this.email = email;
        this.password = password;
        this.postalCode = postalCode;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.country = country;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getPersonnelNumber() {

        return personnelNumber;
    }

    public void setPersonnelNumber(String personnelNumber) {

        this.personnelNumber = personnelNumber;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getPassword() {
        return password; }

    public void setPassword(String password) {
        this.password = password; }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getPostalCode() {

        return postalCode;
    }

    public void setPostalCode(String postalCode) {

        this.postalCode = postalCode;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
