public class Cargo extends Transport {

private Load_Capacity loadCapacity;

    public Load_Capacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Load_Capacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Cargo(String brand, String model, double engineVolume, Load_Capacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных недостаточно.");
        } else System.out.println("Грузоподъемность грузовика " + getBrand() + " " + getModel() + " составляет от " + getLoadCapacity().getLow() + " до " +
                getLoadCapacity().getHigh() + " тонн.");
    }
}