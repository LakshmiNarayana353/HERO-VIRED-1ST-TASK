import java.io.BufferedReader;
import java.io.FileReader;
public class task5 {
    public static void main(String[] args)
    {
        try
        {   int count=0;
            double Total=0;
            String line = ""; 
            double min=Double.MAX_VALUE;
            double max=Double.MIN_VALUE;
            
            BufferedReader br = new BufferedReader(new FileReader("DATA.csv"));
            while ((line = br.readLine()) != null)
            {
                String[] Transaction = line.split(",");
                double Cost=Double.parseDouble(Transaction[3]);
                Total+=Cost;
                if (Cost>max){
                    max=Cost;
                }
                if(Cost<min){
                    min=Cost;
                }
                count+=1;
            }
            br.close();
            System.out.println("Total number of Transactions : "+count);
            System.out.println("Total amount  : "+Total);
            System.out.println("Maximum amount : "+max);
            System.out.println("Minimum amount : "+min);
        }
        catch (Exception e)
        {
            System.out.println("Run Time Error");
        }
        }

}