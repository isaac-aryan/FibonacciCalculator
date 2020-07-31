import java.io.*;

class fibonacci
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int limit;

    public void fib()throws IOException, NumberFormatException
    {
        System.out.println("Enter the number you want the Fibonacci sequence upto...");
        limit=Integer.parseInt(br.readLine());

        int num1=0;
        int num2=1;
        int total=0;

        System.out.print(num1);
        System.out.print("  "+num2+"  ");

        while(total<=limit-num2)
        {
            total=num1+num2;
            num1=num2;
            num2=total;

            System.out.print(total+"  ");
        }
    }

    public static void main(String[] args)
    {
        fibonacci fb=new fibonacci();

        try
        {
            fb.fib();
        }
        
        catch(IOException ioe)
        {
            System.out.println("Input/Output Error.");
        }

        catch(NumberFormatException nf)
        {
            System.out.println("Number Format Error.");
        }
    }
}