import java.util.*;
public class task3 {
    static Scanner sc= new Scanner(System.in);
    static class pro {
        String p_name;
        String specification;
        int cost;
        int count;

        pro(String name, String specification, int cost, int count) {
            this.p_name = name;
            this.specification = specification;
            this.cost = cost;
            this.count = count;
        }
    }

    static pro[] products = {
        new pro("Laptop", "16GB RAM, 512GB SSD, Intel i7 Processor", 900, 20),
        new pro("Smartphone", "6GB RAM, 128GB Storage, Octa-Core Processor", 500, 30),
        new pro("Tablet", "4GB RAM, 64GB Storage, Octa-Core Processor", 300, 40)
    };

    public static void main(String[] args) {
        while (true) {
            System.out.println("Inventory Management System");
            System.out.println("1. Product List");
            System.out.println("2. Product Count");
            System.out.println("3. View Product Details");
            System.out.println("4. Edit Product");
            System.out.println("5. Update Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int a= sc.nextInt();

            switch (a) {
                case 1:
                    viewProductList();
                    break;
                case 2:
                    viewProductCount();
                    break;
                case 3:
                    viewProductDetails();
                    break;
                case 4:
                    editProduct();
                    break;
                case 5:
                    updateInventory();
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static void viewProductList() {
        System.out.println("\nProduct List");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i].p_name);
        }
    }

    static void viewProductCount() {
        System.out.println("\nProduct Count");
        System.out.print("Enter the product name: ");
        String productName = sc.next();
        for (int i = 0; i < products.length; i++) {
            if (products[i].p_name.equalsIgnoreCase(productName)) {
                System.out.println("Count: " + products[i].count);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    static void viewProductDetails() {
        System.out.println("\nProduct Details");
        System.out.print("Enter the product name: ");
        String productName = sc.next();
        for (int i = 0; i < products.length; i++) {
            if (products[i].p_name.equalsIgnoreCase(productName)) {
            System.out.println("Name: " + products[i].p_name);
            System.out.println("Specification: " + products[i].specification);
            System.out.println("Cost: " + products[i].cost);
            System.out.println("Count: " + products[i].count);
            return;
            }
            }
            System.out.println("Product not found.");
            }
            static void editProduct() {
                System.out.println("\nEdit Product");
                System.out.print("Enter the product name: ");
                String productName = sc.next();
                for (int i = 0; i < products.length; i++) {
                    if (products[i].p_name.equalsIgnoreCase(productName)) {
                        System.out.print("Enter new specification: ");
                        products[i].specification = sc.next();
                        System.out.print("Enter new cost: ");
                        products[i].cost = sc.nextInt();
                        System.out.println("Product details updated successfully.");
                        return;
                    }
                }
                System.out.println("Product not found.");
            }
            
            static void updateInventory() {
                System.out.println("\nUpdate Inventory");
                System.out.print("Enter the product name: ");
                String productName = sc.next();
                for (int i = 0; i < products.length; i++) {
                    if (products[i].p_name.equalsIgnoreCase(productName)) {
                        System.out.print("Enter the number of quantities to add or delete: ");
                        int quantity = sc.nextInt();
                        products[i].count += quantity;
                        System.out.println("Inventory updated successfully.");
                        return;
                    }
                }
                System.out.println("Product not found.");
            }
        }