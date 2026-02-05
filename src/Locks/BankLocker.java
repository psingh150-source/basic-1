package Locks;
import java.util.concurrent.locks.ReentrantLock;
public class BankLocker {
    private static final ReentrantLock lock=new ReentrantLock();

    public static void main(String[] args) throws InterruptedException{
        Runnable task = () -> {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " Accessing Locker");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        };
    Thread t1=new Thread(task, "Customer1");
    Thread t2=new Thread(task, "Customer2");
    t1.start();
    t1.join();
        t2.start();



            }
    }

