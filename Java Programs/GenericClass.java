package JavaPackage;

class Box<T> {
	private T item;
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	} 
}


public class GenericClass {

	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.setItem(10);
		System.out.println("Box 1: " + box1.getItem());
		
		Box<String> box2 = new Box<>();
		box2.setItem("Hello");
		System.out.println("Box 2: " + box2.getItem());
	}

}
