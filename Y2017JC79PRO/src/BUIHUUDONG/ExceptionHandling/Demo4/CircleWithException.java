package BUIHUUDONG.ExceptionHandling.Demo4;

public class CircleWithException {
	private double radius;
	private static int numberOfObjects = 0;

	public CircleWithException(double newRadius) {
		setRadius(newRadius);
		numberOfObjects++;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) throws IllegalArgumentException {
		if (radius > 0) {
			this.radius = radius;
		} else {
			throw new IllegalArgumentException("Co loi");
		}

	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	public static void main(String[] args) {
		try {
			CircleWithException c1 = new CircleWithException(5);
			CircleWithException c2 = new CircleWithException(-5);
			CircleWithException c3 = new CircleWithException(0);

		} catch (IllegalArgumentException e) {
			System.out.println(e);

		}
		System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());
	}
}
