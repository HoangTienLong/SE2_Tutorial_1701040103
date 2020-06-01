package Tut_07;

public class Main {
	public static void main(String[] args) {
		// create a bag with default size
		BagInterface<String> myBag = new ArrayBag<String>();
		myBag.add("Vegeta");
		myBag.add("Goku");
		myBag.add("Goku");
		myBag.add("Goku");
		myBag.remove("Vegeta");
		System.out.println(myBag.getCurrentSize());
		
		
	}
}
