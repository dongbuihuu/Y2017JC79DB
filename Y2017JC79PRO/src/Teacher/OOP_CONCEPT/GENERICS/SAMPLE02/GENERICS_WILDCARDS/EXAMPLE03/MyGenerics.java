package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.GENERICS.SAMPLE02.GENERICS_WILDCARDS.EXAMPLE03;

import java.util.ArrayList;
import java.util.List;

public class MyGenerics<T,E> {
	public boolean CheckElement(T objT, E objE){	
		return true;
	}	
	
	public static void main(String[] args) {
		MyGenerics<Double, Integer> objMy = new MyGenerics<>();		
	}
}
