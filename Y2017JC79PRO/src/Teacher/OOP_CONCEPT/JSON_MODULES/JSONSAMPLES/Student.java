package JAVACORE_TRAINING.OBJECT_AND_CLASSES.JSON_MODULES.JSONSAMPLES;

public class Student {
    private int RollNo;
    private String FullName;
    private double Mark;

    /**
     * @return the rollNo
     */
    public int getRollNo() {
        return RollNo;
    }

    /**
     * @param rollNo the rollNo to set
     */
    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return FullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        FullName = fullName;
    }

    /**
     * @return the mark
     */
    public double getMark() {
        return Mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(double mark) {
        Mark = mark;
    }
}
