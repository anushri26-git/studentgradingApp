package p5;
class Counter {
static int count = 0;

public Counter() {
count++;
}

public static void displayCount() {
System.out.println("Count:" + count);
	//printing the things
}
}
public class CounterTest {

	public static void main(String[] args) {
		new Counter();
		new Counter();
		Counter.displayCount();

	}

}
