public class Main {
    public static void main(String[] args) {

        Bus scania = new Bus("Scania", "Touring", 13.0, Capacity.XL);
        Bus maz = new Bus("MAZ", "206", 4.2, null);
        Bus mercedes = new Bus("Mercedes", "Sprinter", 3.0, Capacity.S);

        Passenger bmw = new Passenger("BMW", "M5", 4.3, bodyType.COUPE);
        Passenger skoda = new Passenger("Skoda", "Superb", 3.6, bodyType.UNIVERSAL);
        Passenger toyota = new Passenger("Toyota", "Tundra", 7.6, bodyType.PICKUP);

        Cargo kamaz = new Cargo("KamAZ", "54907", 13.0, Load_Capacity.N2);
        Cargo hyndai = new Cargo("Hyndai", "Mighty", 3.9, Load_Capacity.N1);
        Cargo freighliner = new Cargo("Freighliner", "Cascadia", 12.9, Load_Capacity.N2);

        System.out.println(scania);
        System.out.println(maz);
        System.out.println(mercedes);
        System.out.println();
        System.out.println(bmw);
        System.out.println(skoda);
        System.out.println(toyota);
        System.out.println();
        System.out.println(kamaz);
        System.out.println(hyndai);
        System.out.println(freighliner);

        maz.printType();
        skoda.printType();
        freighliner.printType();
        scania.printType();


    }
}