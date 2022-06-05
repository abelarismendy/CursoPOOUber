from car import Car

if __name__ == '__main__':
    car = Car()
    car.license = "ABC123"
    car.driver = "Abel Arismendy"
    car.passengers = 4
    print(vars(car))