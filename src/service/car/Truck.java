package service.car;

public class Truck extends Car{
    private int payload;

    public Truck(String model, String color, int maxSpeed, int payload) {
        super(model, color, maxSpeed);
        this.payload = payload;
    }

    @Override
    public String toDo() {
        return "Перевозка грузов и материалов";
    }
}
