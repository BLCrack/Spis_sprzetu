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

    public Hardware(int inventoryNumber, String serialNumber, String name, String localization, String previousOwner, String accessory, String information)
    {
        this.inventoryNumber = inventoryNumber;
        this.serialNumber = serialNumber;
        this.name = name;
        this.localization = localization;
        this.previousOwner = previousOwner;
        this.accessory = accessory;
        this.information = information;
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
}
