package Teacher.Y2017JC79.oops.generics.wildcardgeneric.example01;

public class MyGenerics<T, E> {
	public boolean CheckElement(T objT, E objE) {
		return true;
	}

	public static void main(String[] args) {
		MyGenerics<Double, Integer> objMy = new MyGenerics<>();
	}
}
