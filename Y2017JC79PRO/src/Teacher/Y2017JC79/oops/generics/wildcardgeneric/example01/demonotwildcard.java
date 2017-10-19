package Teacher.Y2017JC79.oops.generics.wildcardgeneric.example01;

import Teacher.Y2017JC79.oops.generics.generic_class.sample01.MyStackGeneric;

//Demo tim phần tử max trong stack
public class demonotwildcard {
	public static void main(String[] args) {
		MyStackGeneric<Double> stack = new MyStackGeneric<>();

		stack.push(1.25);
		stack.push(550.25);
		stack.push(3633.5);
		stack.push(125d);
		stack.push(422_555_888.2);
		System.out.println(max(stack));

		// Double instanceof Number => ArrayList<Double> vs ArrayList<Number>? No

	}

	public static double max(MyStackGeneric<? extends Number> stack) {
		double maxValue = stack.pop().doubleValue();
		while (!stack.isEmpty()) {
			double value = stack.pop().doubleValue();
			if (maxValue < value) {
				maxValue = value;
			}
		}
		return maxValue;

	}

}
