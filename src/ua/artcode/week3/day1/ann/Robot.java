package ua.artcode.week3.day1.ann;

@Save(num = 6, desc = "save into")
public class Robot {

    @FieldSave(value = "robot.number")
    private int id;

    @FieldSave
    private String model;

    @FieldSave
    private double price;

    private String accessCode;



    public Robot(int id, String model, double price, String accessCode) {
        this.id = id;
        this.model = model;
        this.price = price;
        this.accessCode = accessCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", accessCode='" + accessCode + '\'' +
                '}';
    }
}
