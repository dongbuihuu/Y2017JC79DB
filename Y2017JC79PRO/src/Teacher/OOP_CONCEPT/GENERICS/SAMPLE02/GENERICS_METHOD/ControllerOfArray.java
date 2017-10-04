package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.GENERICS.SAMPLE02.GENERICS_METHOD;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ControllerOfArray {
    /***
     * Lấy giá trị về từ 1 chỉ số Index nào đó (ko sử dụng Generics)
     * 
     * @param myArr
     * @param iIndex
     * @return 
     * @return
     */
    public static  Object getValueOfIndex(Object[] myArr, Object iIndex) {
        return myArr[(Integer) iIndex];
    }

    /***
     * Lấy giá trị về từ 1 chỉ số Index nào đó (có sử dụng Generics Method)
     * @param <T>
     * 
     * @param myArr
     * @param iIndex
     * @return 
     * @return
     */
    public <E> E getValueOfIndexGenerics(E[] myArr, E iIndex) {    	
        return myArr[(Integer) iIndex];
    }

    public static <T> T getValueOfIndexGenerics(T[] myArr) {
        return myArr[0];
    }

    public static void main(String[] str) {
        Students[] ArrStudent = new Students[2];
        Students objSv01 = new Students();
        objSv01.setRollNo(100);
        objSv01.setFullName("Mr A");

        Students objSv02 = new Students();
        objSv02.setRollNo(200);
        objSv02.setFullName("Mr B");

        ArrStudent[0] = objSv01;
        ArrStudent[1] = objSv02;

        // 3.
        Students objStudentA = (Students) getValueOfIndex(ArrStudent, 1);
        System.out.println("+ SV01: ");
        System.out.println("+ RollNo: " + objStudentA.getRollNo());
        System.out.println("+ FullName: " + objStudentA.getFullName());

        // 4. Generics method
        // Nếu định nghĩa là T mà lại truyền vào là kiểu khác nhau thì -->
        // phải tường minh ép kiểu (Khuôn làm ra thì có 2 T trong khi chuyên gia
        // xài 1T)
         //Students objStudentB = getValueOfIndexGenerics(ArrStudent, 1);//
        // Errors
        Students objStudentC = getValueOfIndexGenerics(ArrStudent);
        System.out.println("+ SV02: ");
        System.out.println("+ RollNo: " + objStudentA.getRollNo());
        System.out.println("+ FullName: " + objStudentA.getFullName());
    }

    /***
     * Tìm tập các giá trị thỏa mãn trong danh sách giá trị (ko sử dụng Generics)
     * @param collection
     * @param items
     * @return
     */
    public static List<Object> getValueInfor(List<Object> collection, Object items) {
        List<Object> lisValue = new ArrayList<Object>();
        for (Object value : collection) {
            if (items.equals(value)) {
                lisValue.add(value);
            }
        }
        return lisValue;
    }

    /***
     * Tìm tập các giá trị thỏa mãn trong danh sách giá trị (sử dụng Generics Method)
     * @param collection
     * @param items
     * @return
     */
    public static <T> Collection<T> getValueInforWithGenerics(Collection<T> collection, T items) {
        List<T> lisValue = new ArrayList<T>();
        for (T value : collection) {
            if (items.equals(value)) {
                lisValue.add(value);
            }
        }
        return lisValue;
    }
}
