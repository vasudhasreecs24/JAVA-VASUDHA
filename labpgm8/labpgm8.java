class BMS extends Thread
{
    public void run()
    {
        try
        {
            for(int i = 1; i <= 5; i++)
            {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);   // 10 seconds delay
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("BMS Thread Interrupted");
        }
    }
}

class CSE extends Thread
{
    public void run()
    {
        try
        {
            for(int i = 1; i <= 5; i++)
            {
                System.out.println("CSE");
                Thread.sleep(2000);    // 2 seconds delay
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("CSE Thread Interrupted");
        }
    }
}

public class labpgm8
{
    public static void main(String args[])
    {
        BMS t1 = new BMS();   // Thread 1
        CSE t2 = new CSE();   // Thread 2

        t1.start();           // Start first thread
        t2.start();           // Start second thread
    }
}
