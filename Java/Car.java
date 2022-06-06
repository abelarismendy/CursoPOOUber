class Car {
    Integer id;
    String license;
    Account driver;
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

    public Integer getPassangers(){
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
