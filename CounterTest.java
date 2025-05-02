package p5;
class Counter {
static int count = 0;

public Counter() {
count++;
}

public static void displayCount() {
System.out.println("Count:" + count);//print statement
	System.out.println("Count:");
	System.out.println("Hello");
	//printing the things
}
}
public class CounterTest {

	public static void main(String[] args) {
		new Counter();
		new Counter();
		Counter.displayCount();//display

	}

}
