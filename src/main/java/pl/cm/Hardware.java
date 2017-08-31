package pl.cm;

public class Hardware
{
    private int inventoryNumber;
    private String serialNumber;
    private String name;
    private String localization;
    private String previousOwner;
    private String accessory;
    private String information;
    private double price;

    public Hardware(int inventoryNumber, String serialNumber, String name, String localization, String previousOwner, String accessory, String information, double price)
    {
        this.inventoryNumber = inventoryNumber;
        this.serialNumber = serialNumber;
        this.name = name;
        this.localization = localization;
        this.previousOwner = previousOwner;
        this.accessory = accessory;
        this.information = information;
        this.price = price;
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public String getPreviousOwner() {
        return previousOwner;
    }

    public void setPreviousOwner(String previousOwner) {
        this.previousOwner = previousOwner;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}
}
