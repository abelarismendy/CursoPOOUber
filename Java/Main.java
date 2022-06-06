class Main {
    public static void main(String[] args) {
        UberX uberX = new UberX("ABC123", new Account("Abel Arismendy", "123456"), "Chevrolet", "Spark");
        uberX.setPassengers(4);
        // uberX.printDataCar();

        UberVan uberVan = new UberVan("ABC123", new Account("Abel Arismendy", "123456"));
        uberVan.setPassengers(6);
        uberVan.printDataCar();
    }
}