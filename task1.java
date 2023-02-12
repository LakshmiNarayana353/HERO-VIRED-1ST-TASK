import java.util.*;
public class task1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        int i=0;
        int a = 1;
        System.out.print("Missing numbers are : ");
        while(a<arr[arr.length-1]){
            if(arr[i]!=a){
                System.out.print(a+", ");
                a++;
            }
            else {
                i++;
                a++;
            }
        }
    }
}