import java.util.*;
public class Calender
{
    private static String[] months={"January","February","March",
        "April","May","June","July","August","September","October",
        "November","December"};
    
    public static void main(String[] args)
    {
       // loopMonths();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter a month: ");
            String monthName=sc.nextLine();
            if(monthName.length()== 0)
            {
                break;
            }
            int monthNumber=getmonthNumber(monthName);
            if(monthNumber==-1)
            {
                System.out.println("Month not found");
            }
            else
            {
                System.out.println(String.format("%s is month number %d", monthName, monthNumber+1));
            }
        }
    }
    
    private static void loopMonths()
    {
        for(int i=0;i<months.length;i++)
        {
            System.out.println(months[i]);
        }
    }
    
    private static int getmonthNumber(String monthName)
    {
        for(int i=0;i<months.length;i++)
        {
            if(monthName.equalsIgnoreCase(months[i]))
            {
                return i;
            }
        }
        return -1;
    }
}

