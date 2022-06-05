<?php

require_once('Car.php');
require_once('Account.php');

$car = new Car("ABC123", new Account("Abel Arismendy", "123456"));
$car->printDataCar();