class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passengers;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;

    }

    void printDataCar() {
        System.out.println("License: "+ license);
        System.out.println("Driver: "+ driver);
        if(this.passengers != null){
            System.out.println("Passengers: "+ passengers);
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    public Integer getPassengers() {
        return passengers;
    }

    public void setPassengers(Integer passengers) {
        if(passengers == 4){
            this.passengers = passengers;
        }else{
            System.out.println("Necesitas asigmar 4 pasajeros");
        }
    }
}
