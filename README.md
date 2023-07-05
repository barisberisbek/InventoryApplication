# Inventory Application

This application is designed to calculate the prices of vehicles in the inventory of Sonda Company, an automobile manufacturer. "Sonda Company" is a purely exemplary company name. The inventory consists of car models (Sivic and Sity) and motorbike models (Racer and Scooter), along with optional features that can be added to these vehicles.

## Class Structure

The project consists of the following classes:

**Main**: The main class that contains the entry point of the application. It demonstrates the usage of the Inventory class by creating vehicle objects, setting optional features, and adding them to the inventory.

**Inventory**: Represents the inventory of vehicles. It stores a collection of Vehicle objects (cars and motorbikes) and provides methods to add vehicles to the inventory. It also calculates the total number of cars, motorbikes, and the overall cost of all vehicles in the inventory.

**Vehicle**: An abstract class that serves as the base class for Car and Motorbike. It contains common attributes and methods for vehicles, such as price and optional features. It provides methods to set optional features, calculate the total price of the vehicle (including optional features), and generate a string representation of the vehicle.

**Car**: An abstract class that extends Vehicle. It represents a car and provides a base implementation for car-specific functionality.

**Sivic**: A concrete class that extends Car. It represents the Sivic car model and sets the base price of the car.

**Sity**: A concrete class that extends Car. It represents the Sity car model and sets the base price of the car.

**Motorbike**: An abstract class that extends Vehicle. It represents a motorbike and provides a base implementation for motorbike-specific functionality.

**Racer**: A concrete class that extends Motorbike. It represents the Racer motorbike model and sets the base price of the motorbike.

**Scooter**: A concrete class that extends Motorbike. It represents the Scooter motorbike model and sets the base price of the motorbike.

**OptionsEnum**: An enumeration that defines the optional features available for vehicles. Each option has a display name and a corresponding price. It provides methods to retrieve the display name and price of an option based on its string representation.

## Usage

To use the inventory application, follow these steps:

1. Create an instance of the Inventory class.
2. Create vehicle objects (Car or Motorbike) for the desired models (Sivic, Sity, Racer, Scooter).
3. Set optional features for the vehicle objects using the appropriate methods (setAbs, setMusicSystem, setAirBag, setSunRoof, setSeatHeating).
4. Add the vehicle objects to the inventory using the add method of the Inventory class.
5. Retrieve the string representation of the inventory by calling the toString method of the Inventory class.

The inventory will display the total number of vehicles (including cars and motorbikes), the number of cars, the number of motorbikes, and the total price of all vehicles in the inventory.

## Enum Class: OptionsEnum

The OptionsEnum class is an enumeration that represents the optional features available for vehicles. Each option has a display name and a corresponding price. The enum provides the following methods:

- `getDisplayName()`: Returns the display name of the option.
- `getPrice()`: Returns the price of the option.
- `fromString(String value)`: Converts a string value to the corresponding OptionsEnum constant. It is used to retrieve the OptionsEnum constant based on the string representation of an optional feature.

** The prices and optional features listed in the OptionsEnum class are specific to the Sonda Company inventory application and can be customized according to the company's requirements.

## Customization Galore!
Remember, this application is not limited to Sonda Company's inventory. You have the power to take this project and make it your own, fitting it perfectly to your unique needs and desires. Create your own vehicle models, set your preferred base prices, and define custom optional features that truly reflect your style and taste.

