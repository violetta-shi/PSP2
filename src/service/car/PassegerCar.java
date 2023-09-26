package service.car;
public class PassegerCar extends Car{
    private String bodyType;
    public PassegerCar(String model, String color, int maxSpeed, String bodyType) {
        super(model, color, maxSpeed);
        this.bodyType = bodyType;
    }
    @Override
    public String toDo() {
        return "Перевозка пассажиров";
    }
}
