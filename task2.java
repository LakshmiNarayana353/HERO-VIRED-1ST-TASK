import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt() ;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        Set<Integer> s = new HashSet<>();
        System.out.println("The Unique Numbers Are: ");
        for(int a:arr){
            s.add(a);
        }
        for (int a : s) {
            System.out.print(a+", ");
        }
    }
}