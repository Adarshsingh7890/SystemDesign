package Uber;

public class Vehicle {
    private String id;
    private String Model;
    private String Color;
    private String OtherInfo;

    
    public Vehicle(String id, String model, String color, String otherInfo) {
        this.id = id;
        Model = model;
        Color = color;
        OtherInfo = otherInfo;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    public String getModel() {
        return Model;
    }
    public void setModel(String model) {
        Model = model;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public String getOtherInfo() {
        return OtherInfo;
    }
    public void setOtherInfo(String otherInfo) {
        OtherInfo = otherInfo;
    }

    
}
