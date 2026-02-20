package Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Testcon {
    public static void main(String[] args) throws InterruptedException {

        Map<String, Integer> map = new ConcurrentHashMap<>();

        for (int i = 0; i < 10; i++) {
            new Thread(() ->
            {
                for (int j = 0; j < 1000; j++) {
                    map.put("key" + j, j);
                }
            }).start();
        }
        Thread.sleep(2000);
        System.out.println(map.size());
    }
}
