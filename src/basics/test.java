package basics;

public class test {
    public static void main(String[] args) {
        Clob clob=new Clob();
        {
            clob.color ="Blue";
            clob.brand ="Tata";
            clob.model ="Safari";
            clob.speed=40;
            clob.year=2024;

            clob.accelerate(3);
            System.out.println(clob.speed);
            clob.year=2030;
        }
    }
}
