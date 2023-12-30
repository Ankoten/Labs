import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Product {
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
class SalesManager {
    private List<Product> soldProducts;
    private double totalSales;
    private Map<String, Integer> productCount;
    public SalesManager() {
        soldProducts = new ArrayList<>();
        totalSales = 0;
        productCount = new HashMap<>();
    }
    public void addSoldProduct(Product product) {
        soldProducts.add(product);

        totalSales += product.getPrice();

        if (productCount.containsKey(product.getName())) {
            int count = productCount.get(product.getName());
            productCount.put(product.getName(), count + 1);
        } else {
            productCount.put(product.getName(), 1);
        }
    }
    public void displaySoldProducts() {
        System.out.println("Список проданных товаров:");
        for (Product product : soldProducts) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }
    }
    public double getTotalSales() {
        return totalSales;
    }
    public String getMostPopularProduct() {
        int maxCount = 0;
        String mostPopularProduct = "";
        for (Map.Entry<String, Integer> entry : productCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostPopularProduct = entry.getKey();
            }
        }
        return mostPopularProduct;
    }
}