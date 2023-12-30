public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push(4);
        System.out.println(stack.pop());

        SalesManager salesManager = new SalesManager();

        Product product1 = new Product("Товар 1", 100);
        Product product2 = new Product("Товар 2", 100);
        Product product3 = new Product("Товар 3", 150);

        salesManager.addSoldProduct(product1);
        salesManager.addSoldProduct(product2);
        salesManager.addSoldProduct(product3);
        salesManager.addSoldProduct(product1);
        salesManager.addSoldProduct(product2);

        salesManager.displaySoldProducts();
        System.out.println("Общая сумма продаж: " + salesManager.getTotalSales());
        System.out.println("Наиболее популярный товар: " + salesManager.getMostPopularProduct());
    }
}
