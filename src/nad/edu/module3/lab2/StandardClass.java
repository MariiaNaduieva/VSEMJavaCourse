package nad.edu.module3.lab2;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class StandardClass
 * @since 04.04.2021 - 18.00
 **/

public class StandardClass implements ITrainTrip{
    private String nameOfCompany;
    private int numberOfSeats;
    private int kilometrage;
    private boolean isChildren;

    public StandardClass() {
    }

    public StandardClass(String nameOfCompany, int numberOfSeats, int kilometrage, boolean isChildren) {
        this.nameOfCompany = nameOfCompany;
        this.numberOfSeats = numberOfSeats;
        this.kilometrage = kilometrage;
        this.isChildren = isChildren;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public boolean isChildren() {
        return isChildren;
    }

    public void setChildren(boolean isChildren) {
        this.isChildren = isChildren;
    }

    @Override
    public String toString() {
        return "StandardClass {" + '\n'+
                "nameOfCompany = '" + nameOfCompany + '\'' + '\n'+
                "numberOfSeats = " + numberOfSeats + '\n'+
                "kilometrage = " + kilometrage + '\n'+
                "isChildren = " + isChildren + '\n'+
                '}' + '\n';
    }

    @Override
    public double getTicketPrice() {

        int pricePerKilometre = 0;
        if (this.getNameOfCompany() == "Укрзалізниця") {
            pricePerKilometre = 15;
        } else if (this.getNameOfCompany() == "Globaltrans") {
            pricePerKilometre = 10;
        } else if (this.getNameOfCompany() == "Railways") {
            pricePerKilometre = 10;
        } else if (this.getNameOfCompany() == "Voyageur") {
            pricePerKilometre = 5;
        }

        int priceForChildren = 0;
        if (this.isChildren == true) {
            pricePerKilometre = pricePerKilometre / 2;
        } else if (this.isChildren == false) {
            priceForChildren = 0;
        }

        return this.getKilometrage() * pricePerKilometre;
    }

    @Override
    public double getTripPrice() {

        return getTicketPrice();
    }
}
