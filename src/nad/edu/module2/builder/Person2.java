package nad.edu.module2.builder;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class Person
 * @since 21.03.2021 - 17.29
 **/

public class Person2 {
    private String firstName;
    private String lastName;
    private String patronymicName;
    private LocalDate dateOfBirth;
    private String gender;
    private String citizenship;
    private String nationality;
    private String country; // country of current residence
    private String town; // town of current residence
    private String street; //residence street
    private String houseNumber;
    private int flatNumber;
    private String passportId;
    private String maritalStatus;

    public Person2() {
    }

    public Person2(String firstName, String lastName, String patronymicName, LocalDate dateOfBirth,
                   String gender, String citizenship, String nationality, String country, String town,
                   String street, String houseNumber, int flatNumber, String passportId, String maritalStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.citizenship = citizenship;
        this.nationality = nationality;
        this.country = country;
        this.town = town;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.passportId = passportId;
        this.maritalStatus = maritalStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return
                "firstName ='" + firstName + '\'' + '\n' +
                "lastName ='" + lastName + '\'' + '\n' +
                "patronymicName ='" + patronymicName + '\'' + '\n' +
                "dateOfBirth =" + dateOfBirth + '\n' +
                "gender ='" + gender + '\'' + '\n' +
                "citizenship ='" + citizenship + '\'' + '\n' +
                "nationality ='" + nationality + '\'' + '\n' +
                "country ='" + country + '\'' + '\n' +
                "town ='" + town + '\'' + '\n' +
                "street ='" + street + '\'' + '\n' +
                "houseNumber ='" + houseNumber + '\'' + '\n' +
                "flatNumber =" + flatNumber + '\n' +
                "passportId ='" + passportId + '\'' + '\n' +
                "maritalStatus ='" + maritalStatus + '\'' + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person = (Person2) o;
        return getFlatNumber() == person.getFlatNumber() &&
                getFirstName().equals(person.getFirstName()) &&
                getLastName().equals(person.getLastName()) &&
                getPatronymicName().equals(person.getPatronymicName()) &&
                getDateOfBirth().equals(person.getDateOfBirth()) &&
                getGender().equals(person.getGender()) &&
                getCitizenship().equals(person.getCitizenship()) &&
                getNationality().equals(person.getNationality()) &&
                getCountry().equals(person.getCountry()) &&
                getTown().equals(person.getTown()) &&
                getStreet().equals(person.getStreet()) &&
                getHouseNumber().equals(person.getHouseNumber()) &&
                getPassportId().equals(person.getPassportId()) &&
                getMaritalStatus().equals(person.getMaritalStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPatronymicName(), getDateOfBirth(),
                getGender(), getCitizenship(), getNationality(), getCountry(), getTown(), getStreet(),
                getHouseNumber(), getFlatNumber(), getPassportId(), getMaritalStatus());
    }
}
