Inventory-and-stock-tracker
Overview
This Java program is a simple Inventory Management System that helps you manage items in a store. We can
Add items to the inventory, Update item quantity or price, Remove items, View all current items in a report.

Classes included:-
1. Item Class(This class represents a single item in the inventor)
Attributes:
name: The name of the item (e.g., "Laptop")
category: Category the item belongs to (e.g., "Electronics")
quantity: How many items are available
price: Price of each item
name and category are marked final, meaning they can’t be changed once set.

Methods:
Getters: For all fields (getName(), getCategory(), etc.)
Setters: Only for quantity and price since those can change
toString(): Returns a neat summary of the item for printing


2. Inventory Class(This class is responsible for managing multiple Item objects)
Attribute:
items: A list (ArrayList) that holds all Item objects

Methods:
addItem(): Adds a new item to the inventory
removeItem(): Removes an item by name (case-insensitive)
updateQuantity(): Updates quantity of an item by name
updatePrice(): Updates price of an item by name
generateReport(): Prints details of every item in inventory


3. InventoryManagement Class(This class contains the main() method. It runs the program and shows how to use the Inventory)
Creates an inventory object
Adds two items: a "Laptop" and a "Chair"
Prints all items
Updates quantity of Laptop and price of Chair
Prints again
Removes Laptop
Prints final

Key Concepts Learned:
Class Design
Object Creation
List Handling
Method Overriding (toString)
Encapsulation (private fields with public getters/setters)
