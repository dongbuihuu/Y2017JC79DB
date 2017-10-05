package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ABSTRACTIONS.INSTANCE_OBJECT_WITH_INTERFACE;

public class ListViewGUI implements IVIEWS {
	@Override
	public String PrintInfo() {
        return Processing();
    }
	
	public String Processing() {
        return "Giao diện của ListView Controls đã customs!";
    }

	@Override
	public void HienThiDuLieu() {
		
	}
}
