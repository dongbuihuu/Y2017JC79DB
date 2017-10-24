package Teacher.Y2017JC79.oops.abstractions.instance_object_with_interface;

public class ButtonGui implements IVIEWS {
	@Override
	public String PrintInfo() {
		return Processing();
	}

	/* Nghiệp vụ được che giấu khi thực hiện */
	public String Processing() {
		return "Giao diện của Button Controls đã customs!";
	}

	@Override
	public void HienThiDuLieu() {

	}
}
