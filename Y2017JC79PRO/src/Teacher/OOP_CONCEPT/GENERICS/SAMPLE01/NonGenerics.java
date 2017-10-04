package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.GENERICS.SAMPLE01;

import java.util.ArrayList;

public class NonGenerics {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // 1.
        ArrayList objArr = new ArrayList();
        objArr.add("Nguyễn Văn A");
        objArr.add(100);
        objArr.add(8.5);
        objArr.add(true);

        // 2.
        String fullName = (String) objArr.get(0);
        int Age = (Integer) objArr.get(1);
        double Mark = (Double) objArr.get(2);
        boolean Pass = (Boolean) objArr.get(3);

        // 3.
        System.out.println("FullName: " + fullName);
        System.out.println("Age: " + Age);
        System.out.println("Mark: " + Mark);
        System.out.println("Pass: " + Pass);
    }
}
