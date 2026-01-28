package basics;

import accessm.Student;

public class Studenttest {
    public static void main(String[] args) {
        Student.getInstance();
        Student.getInstance();
        Student.getInstance();
        Student.getInstance();
        Student.getInstance();
        Student.getInstance();
    }
}
//Singleton pattern - Ek hi object create hoga ek class ka, ye restriction bna diya humne