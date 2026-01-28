package basics;

public class St {
    public static void main(String[] args) {
        String a=new String("Ram");
        String b=new String("Ram");
        String c ="Ram";
        String d="Ram";
        System.out.println(a==b);
        System.out.println(c==d);
    }
}
//new String always creates a new heap object, literals are reused from string pool