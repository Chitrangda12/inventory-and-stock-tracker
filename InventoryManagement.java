import java.util.*;

class Item {
    private final String name;
    private final String category;
    private int quantity;
    private double price;

    public Item(String name, String category, int quantity, double price) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{name='" + name + "', category='" + category + "', quantity=" + quantity + ", price=" + price + "}";
    }
}

class Inventory {
    private final List<Item> items = new ArrayList<>();

    public void addItem(String name, String category, int quantity, double price) {
        items.add(new Item(name, category, quantity, price));
    }

    public void removeItem(String name) {
        items.removeIf(item -> item.getName().equalsIgnoreCase(name));
    }

    public void updateQuantity(String name, int quantity) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                item.setQuantity(quantity);
                break;
            }
        }
    }

    public void updatePrice(String name, double price) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                item.setPrice(price);
                break;
            }
        }
    }

    public void generateReport() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addItem("Laptop", "Electronics", 10, 750.50);
        inventory.addItem("Chair", "Furniture", 20, 45.99);
        inventory.generateReport();

        inventory.updateQuantity("Laptop", 8);
        inventory.updatePrice("Chair", 49.99);
        inventory.generateReport();

        inventory.removeItem("Laptop");
        inventory.generateReport();
    }
}
