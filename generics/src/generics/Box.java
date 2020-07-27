package generics;

public class Box<T> {
	
	private T objectInBox;
	
	public Box(T objectInBox) {
		this.objectInBox  = objectInBox;
	}

	public T getobjectInBox() {
		return objectInBox;
	}

	public void setObjectInBox(T objectInBox) {
		this.objectInBox = objectInBox;
	}
	
	public T getObjectInBox() {
		return this.objectInBox;
	}

}
