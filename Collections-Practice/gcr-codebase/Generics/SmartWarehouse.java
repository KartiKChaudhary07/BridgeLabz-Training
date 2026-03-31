import java.util.*;
abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) { this.name = name; }
    abstract String getCategory();
}
class Electronics extends WarehouseItem {
    Electronics(String name) { super(name); }
    String getCategory() { return "Electronics"; }
}

class Groceries extends WarehouseItem {
    Groceries(String name) { super(name); }
    String getCategory() { return "Groceries"; }
}

class Furniture extends WarehouseItem {
    Furniture(String name) { super(name); }
    String getCategory() { return "Furniture"; }
}
class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();
    void add(T item) { items.add(item); }
    List<T> getItems() { return items; }
}
class WarehouseUtil {
    static void display(List<? extends WarehouseItem> list) {
        for (WarehouseItem i : list)
            System.out.println(i.name + " - " + i.getCategory());
    }
}

public class SmartWarehouse {
    public static void main(String[] args) {
        Storage<Electronics> s = new Storage<>();
        s.add(new Electronics("Laptop"));
        s.add(new Electronics("Phone"));
        WarehouseUtil.display(s.getItems());
    }
}
