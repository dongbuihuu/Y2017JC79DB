package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ABSTRACTIONS.INSTANCE_OBJECT;

public class ButtonGui extends VIEWS {
    @Override
    public String PrintInfo() {
        return Processing();
    }

    /* Nghiệp vụ được che giấu khi thực hiện */
    public String Processing() {
        return "Giao diện của Button Controls đã customs!";
    }
    
    @Override
    public void HienThiDuLieu() { }
}
