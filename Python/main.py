from car import Car
from account import Account

if __name__ == '__main__':
    car = Car("ABC123", Account("Abel Arismendy", "123456"))
    print(vars(car))
    print(vars(car.driver))