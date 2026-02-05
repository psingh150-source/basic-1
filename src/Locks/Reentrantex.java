package Locks;
import java.util.concurrent.locks.*;

public class Reentrantex {
    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Reentrantex re = new Reentrantex();
        re.enterHouse();
    }

    void enterHouse() {
        lock.lock();
        try {
            System.out.println("Entered House");
            enterRoom();
        } finally {
            lock.unlock();
        }
    }

    void enterRoom() {
        lock.lock();
        try {
            System.out.println("Entered Room");
        } finally {
            lock.unlock();
        }
    }
}

