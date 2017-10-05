package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ABSTRACTIONS.INSTANCE_OBJECT_WITH_INTERFACE;

public class TextBoxGui 
			implements IVIEWS {
    @Override
    public String PrintInfo() {
        return Processing();
    }

    /* Nghiệp vụ được che giấu khi thực hiện */
    public String Processing() {
        return "Giao diện của TextBox Controls đã customs!";
    }
    
    @Override
    public void HienThiDuLieu() {
    	
    }
}
