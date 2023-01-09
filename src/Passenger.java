public class Passenger extends Transport {

    private bodyType bodyType;

    public bodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(bodyType bodyType) {
        this.bodyType = bodyType;
    }

    public Passenger(String brand, String model, double engineVolume, bodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных недостаточно");
        } else System.out.println("Тип кузова автомобиля " + getBrand() + " " + getModel() + " - " + getBodyType());
    }
}
