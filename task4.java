import java.util.*;
class item{
    
    String specification;
    String productName;
    double cost;
    int count;
    
    item(String name,String spec,double cost,int count){
        
        this.productName = name;
        this.specification = spec;
        this.cost = cost;
        this.count = count;
        
    }
    
    public void editProductName(String name) {
        this.productName = name;
    }
    public String getProduct() {
        return this.productName;
    }
    public void editOrUpdate(int count) {
        this.count = count;
    }
    public void editOrUpdate(double cost) {
        this.cost = cost;
    }
    public void productDetails() {
        System.out.println("item name : "+this.productName);
        System.out.println("item Specification : "+this.specification);
        System.out.println("item cost : "+this.cost);
        System.out.println("item count : "+this.count);
        System.out.println();
    }
    public int productCount() {
        return this.count;
    }
    
    public void editOrUpdate(String spec) {
        this.specification = spec;
    }
}

public class task4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("No of items\n ");
        int n = sc.nextInt();
        sc.nextLine();
        List<item>list = new ArrayList<item>();
        System.out.println("Note : enter details of product with name in one line seperared with spaces \n");
        for(int i = 0 ; i < n ; i++) {
            System.out.println("Enter productName,  Specification,  cost,  count : \n");
            String t = sc.nextLine();
            String []arr = t.split(" ");
            String name = arr[0];
            String spec = arr[1];
            double cost = Double.parseDouble(arr[2]);
            int count = Integer.parseInt(arr[3]);
            item p1 = new item(name,spec,cost,count);
            list.add(p1);
            System.out.println();
        }
        boolean flag = true;
        while(flag != false) {
            System.out.println("	1.Product List  ");
            System.out.println("	2.Product count ");
            System.out.println("	3.Product details ");
            System.out.println("	4.Edit product details ");
            System.out.println("	5.Update Inventory ");
            System.out.println("	6.Exit");
            System.out.println("	Enter your choice ");
            int choice = sc.nextInt();
            if(choice == 1) {
                productList(list);
            }else if(choice == 2) {
                productcount(list);
            }else if(choice == 3) {
                productdetails(list);
            }else if(choice == 4) {
                editproduct(list);
            }else if(choice == 5) {
                updateInventory(list);
            }else if(choice  == 6) {
                flag = false;
            }else {
                System.out.println("Enter choice between 1 - 6 ");
            }

        }
        sc.close();
    }
    public static void editproduct(List<item> list) {
        System.out.println("Enter product name : ");
        sc.nextLine();
        String pname = sc.nextLine();
        for(item p: list) {
            if(p.getProduct().compareToIgnoreCase(pname) == 0) {
                System.out.println("what do you want to edit :\n1.Specification\n2.Cost\n3.item count");
                int ch = sc.nextInt();
                if(ch == 1) {
                    System.out.println("Enter item specification ");
                    sc.nextLine();
                    String st = sc.nextLine();
                    p.editOrUpdate(st);
                }else if(ch == 2) {
                    System.out.println("Enter item cost ");
                    double cost = sc.nextDouble();
                    p.editOrUpdate(cost);
                }else {
                    System.out.println("\nEnter item count ");
                    int count = sc.nextInt();
                    p.editOrUpdate(count);
                }
                return;
            }System.out.println();
        }
        System.out.println("\nitem not found");
    }
    public static void productdetails(List<item> list) {
        System.out.println("\nEnter item name : ");
        sc.nextLine();
        String pname = sc.nextLine();
        for(item p: list) {
            if(p.getProduct().compareToIgnoreCase(pname) == 0) {
                p.productDetails();
                return;
            }
        }
        System.out.println("\nitem not found");System.out.println();
    }
    public static void productcount(List<item> list) {
        System.out.print("\nEnter item name : ");
        sc.nextLine();
        String pname = sc.nextLine();
        boolean f = false;
        for(item p: list) {
            if((p.getProduct()).compareToIgnoreCase(pname) == 0) {
                System.out.println("no. of "+p.getProduct() + " is "+p.productCount());
                f = true;
                break;
            }
        }
        if(!f)
            System.out.println("item not found");
    }
    public static void productList(List<item> list) {
        if(list.size() == 0) {
            System.out.println("item is Empty");
            return;
        }
        int i = 1 ;
        for(item p:list)
            System.out.println((i++) + " " +p.getProduct());
        System.out.println();
    }
    public static void updateInventory(List<item> list) {
        System.out.println("-----------------------");
        System.out.println("   1. Add poduct");
        System.out.println("   2. Delete product");
        System.out.println("Enter your choice");System.out.println();
        sc.nextLine();
        int n = sc.nextInt();
        if(n == 1) {
            System.out.println("Enter itemName,Specification,cost,count : ");
            sc.nextLine();
            String t = sc.nextLine();
            String []arr = t.split(" ");
            String name = arr[0];
            String spec = arr[1];
            double cost = Double.parseDouble(arr[2]);
            int count = Integer.parseInt(arr[3]);
            item p1 = new item(name,spec,cost,count);
            list.add(p1);
        }else {
            System.out.println("Enter name to delete product : ");
            sc.nextLine();
            String pname = sc.nextLine();
            int i = 0;
            for(item p: list) {
                if((p.getProduct()).compareToIgnoreCase(pname) == 0) {
                    break;
                }
                i++;
            }
            if(i == list.size())
                System.out.println("item not found");
            else {
                list.remove(i);
                System.out.println("item removed successfully");
            }
        }
    }
}