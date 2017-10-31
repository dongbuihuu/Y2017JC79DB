package Teacher.Y2017JC79.enumerations.WithConstructorInstanceVariableAndMethod;

enum Apple {
	A(10), B(9), C, D(15), E(8);

	// Field - Instance Variables
	private int price; // price of each apple

	// Constructor
	Apple(int p) {
		price = p;
	}

	// Overloaded constructor
	Apple() {
		price = -1;
	}

	// Properties
	int getPrice() {
		return price;
	}

	// Method
	String PrintInfo() {
		return "ABC";
	}
}
