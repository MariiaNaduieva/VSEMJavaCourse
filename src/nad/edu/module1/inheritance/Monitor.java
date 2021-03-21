package nad.edu.module1.inheritance;

import java.util.Objects;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class Monitor
 * @since 21.03.2021 - 17.30
 **/

public class Monitor extends Rectangle {
    private String manufacturer;
    private String displayType;
    private String colour;
    private int gigahertz; // screen update rate
    private String screenResolution;

    public Monitor() {
    }

    public Monitor(String manufacturer, String displayType, String colour, int gigahertz, String screenResolution) {
        this.manufacturer = manufacturer;
        this.displayType = displayType;
        this.colour = colour;
        this.gigahertz = gigahertz;
        this.screenResolution = screenResolution;
    }

    public Monitor(int length, int width, String manufacturer, String displayType, String colour,
                   int gigahertz, String screenResolution) {
        super(length, width);
        this.manufacturer = manufacturer;
        this.displayType = displayType;
        this.colour = colour;
        this.gigahertz = gigahertz;
        this.screenResolution = screenResolution;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getGigahertz() {
        return gigahertz;
    }

    public void setGigahertz(int gigahertz) {
        this.gigahertz = gigahertz;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                super.toString() +
                "manufacturer='" + manufacturer + '\'' +
                ", displayType='" + displayType + '\'' +
                ", colour='" + colour + '\'' +
                ", gigahertz=" + gigahertz +
                ", screenResolution='" + screenResolution + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        return getGigahertz() == monitor.getGigahertz() &&
                getManufacturer().equals(monitor.getManufacturer()) &&
                getDisplayType().equals(monitor.getDisplayType()) &&
                getColour().equals(monitor.getColour()) &&
                getScreenResolution().equals(monitor.getScreenResolution());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getManufacturer(), getDisplayType(), getColour(), getGigahertz(), getScreenResolution());
    }
}
