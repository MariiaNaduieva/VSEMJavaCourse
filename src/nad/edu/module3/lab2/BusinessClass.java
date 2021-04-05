package nad.edu.module3.lab2;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class BusinessClass
 * @since 04.04.2021 - 17.58
 **/

public class BusinessClass implements ITrainTrip {
    private String nameOfCompany;
    private int numberOfSeats;
    private int kilometrage;
    private boolean isChildren;

    private boolean isMealService;
    private boolean isConferenceRoom;
    private boolean isPlayroom;

    public BusinessClass() {
    }

    public BusinessClass(String nameOfCompany, int numberOfSeats, int kilometrage, boolean isChildren,
                         boolean isMealService, boolean isConferenceRoom, boolean isPlayroom) {
        this.nameOfCompany = nameOfCompany;
        this.numberOfSeats = numberOfSeats;
        this.kilometrage = kilometrage;
        this.isChildren = isChildren;
        this.isMealService = isMealService;
        this.isConferenceRoom = isConferenceRoom;
        this.isPlayroom = isPlayroom;
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

    public void setChildren(boolean children) {
        this.isChildren = children;
    }

    public boolean isMealService() {
        return isMealService;
    }

    public void setMealService(boolean mealService) {
        this.isMealService = mealService;
    }

    public boolean isConferenceRoom() {
        return isConferenceRoom;
    }

    public void setConferenceRoom(boolean conferenceRoom) {
        this.isConferenceRoom = conferenceRoom;
    }

    public boolean isPlayroom() {
        return isPlayroom;
    }

    public void setPlayroom(boolean playroom) {
        this.isPlayroom = playroom;
    }

    @Override
    public String toString() {
        return "BusinessClass {" + '\n'+
                "nameOfCompany = '" + nameOfCompany + '\'' + '\n'+
                "numberOfSeats = " + numberOfSeats + '\n'+
                "kilometrage = " + kilometrage + '\n'+
                "isChildren = " + isChildren + '\n'+
                "isMealService = " + isMealService + '\n'+
                "isConferenceRoom = " + isConferenceRoom + '\n'+
                "isPlayroom = " + isPlayroom + '\n'+
                '}' + '\n';
    }

    @Override
    public double getTicketPrice() {
        int pricePerKilometre = 0;
        if (this.getNameOfCompany() == "Укрзалізниця") {
            pricePerKilometre = 20;
        } else if (this.getNameOfCompany() == "Globaltrans") {
            pricePerKilometre = 15;
        } else if (this.getNameOfCompany() == "Railways") {
            pricePerKilometre = 15;
        } else if (this.getNameOfCompany() == "Voyageur") {
            pricePerKilometre = 10;
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
        int priceForConfRoom = 0;
        if (this.isConferenceRoom == true) {
            priceForConfRoom = 500;
        } else if (this.isConferenceRoom == false) {
            priceForConfRoom = 0;
        }

        int priceForMealService = 0;
        if (this.isMealService == true) {
            priceForMealService = 350;
        } else if (this.isMealService == false) {
            priceForMealService = 0;
        }

        int priceForPlayroom = 0;
        if (this.isPlayroom == true) {
            priceForPlayroom = 400;
        } else if (this.isPlayroom == false) {
            priceForPlayroom = 0;
        }

        return getTicketPrice() + priceForPlayroom + priceForConfRoom + priceForMealService;
    }
}
