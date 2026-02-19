package Collections;
import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();//It supports Index values
        nums.add(9);
        nums.add(90);
        nums.add(30);
        nums.add(56);
        nums.add(56);
        nums.add(9);
        System.out.println(nums.indexOf(4));
        System.out.println(nums.indexOf(90));//checks from left to right
        System.out.println(nums.lastIndexOf(56));//checks from right to left, returns the first element from thr last
    }
}
