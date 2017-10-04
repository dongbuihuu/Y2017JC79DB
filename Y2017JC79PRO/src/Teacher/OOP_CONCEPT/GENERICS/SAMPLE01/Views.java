package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.GENERICS.SAMPLE01;

public class Views {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // 1. Khai báo & khởi tạo TringleObject
        TringleEntity objTringle = new TringleEntity();
        objTringle.setSide01(3);
        objTringle.setSide02(4);
        objTringle.setSide03(5);

        // 2. Khai báo & khởi tạo
        GEOController objController = new GEOController();

        // 3. KQ
        double result = objController.ExecuteOf(objTringle, (byte)0, (byte)0);
        
        // 1. Khai báo & khởi tạo Octagon
        OctagonEntity  objOctagon = new OctagonEntity();
        objOctagon.setSide(2);

        // 2.
        result = objController.ExecuteOf("objOctagon", (byte)1, (byte)0);
    }
}
