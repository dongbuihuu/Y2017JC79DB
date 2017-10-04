package IMIC.NGUYENVANDOAN.JSONDEMO.GOOGLE_JSON;

public class Students {
    private int RollNo;
    private String FullName;
    private double Mark;

    public Students() {
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getFullName() {
        return FullName;
    }

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
