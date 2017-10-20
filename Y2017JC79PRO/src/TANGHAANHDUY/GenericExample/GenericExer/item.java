package TANGHAANHDUY.GenericExample.GenericExer;

public class item<E extends Comparable<E>> implements Comparable<E> {
	E obj;

	public item(E obj) {
		super();
		this.obj = obj;
	}

	public E getObj() {
		return obj;
	}

	public void setObj(E obj) {
		this.obj = obj;
	}

	@Override
	public int compareTo(E o) {
		// TODO Auto-generated method stub
		return this.obj.compareTo(o);

	}
}
