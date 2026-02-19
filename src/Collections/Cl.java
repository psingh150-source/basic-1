package Collections;
import java.util.ArrayList;
import java.util.Collection;



public class Cl {
    public static void main(String[] args) {
        Collection<Integer> col=new ArrayList<>();
        col.add(9);
        col.add(3);
        col.add(4);
        col.add(6);
        col.add(8);
//        for(Object n: col)
//        {
//            int cols=(Integer)n;
//            System.out.println(cols*2);
//        }
        System.out.println(col);


    }
}
