class Car {
    Integer id;
    String license;
    Account driver;
    Integer passengers;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;

    }

    void printDataCar() {
        System.out.println("License: "+ license);
        System.out.println("Driver: "+ driver);
        System.out.println("Passengers: "+ passengers);
    }
}
