import java.sql.SQLOutput;

public class Car {
    public String model;
    public String color;
    public int seats;

    public Car(){
        model = "Test model";
        color = "Test color";
        seats =  4;
        System.out.println("First Constructor");
    }
// Parameter Constructor
    public Car(String model, String color, int seats){
        this.model = model;
        this.color = color;
        this.seats = seats;
    }

    public void display(){
        System.out.println("Model is : " + model);
        System.out.println("Color is : " + color);
        System.out.println("Seats is : " + seats );
    }
}
