package basics;

public class Threadclass2 extends Thread{
    @Override
    public void run() {
        for(int i=0; i < 1000; i++)
        {
            System.out.println("World");
        }
    }
}
