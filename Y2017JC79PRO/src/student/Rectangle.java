package student;

public class Rectangle extends Shape{
	
	private double heigh;
	private double width;
	

	public double getHeigh() {
		return heigh;
	}

	public void setHeigh(double heigh) {
		this.heigh = heigh;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return this.getHeigh()*this.getWidth();
	}

	@Override
	public double Perimeter() {
		// TODO Auto-generated method stub
		return 2*(this.getHeigh()+this.getWidth());
	}

	public Rectangle(double heigh, double width) {
		super();
		this.heigh = heigh;
		this.width = width;
	}


	
	

}
