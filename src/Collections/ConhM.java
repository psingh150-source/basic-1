package Collections;
import java.util.concurrent.ConcurrentHashMap;

public class ConhM {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> fruitp=new ConcurrentHashMap<>();
         fruitp.put("Apple", 100);
         fruitp.put("Banana", 40);
         fruitp.put("Kiwi", 120);
         fruitp.put("Grapes", 90);

        System.out.println("Apple Price: " + fruitp.get("Apple"));

        fruitp.putIfAbsent("Apple", 130);
        fruitp.putIfAbsent("Pineapple", 150);

        System.out.println("All fruits: "+ fruitp);

        fruitp.compute("Banana", (key, oldValue)->
        {
            if(oldValue == null)
            {
                return oldValue;
            }
            return oldValue * 2;
        });
        System.out.println("Updated Banana Value "+ fruitp.get("Banana"));

 //Get or compute expensively
        Integer papaya=fruitp.computeIfAbsent(
                "papaya", key -> {
                    System.out.println("Fetch Papaya price from the db");
                    return 85;
                });
        System.out.println("Papaya price " + papaya);

        //another try
        Integer Blackberry=fruitp.computeIfAbsent(
                "Blackberry", key ->
                {
                    System.out.println("Fetching Blackberry from the db");
                    return 200;
                }
        );
        System.out.println("Blackberry Price " + Blackberry);
    }
}
