package coding_problems;

public class DeadLockFixed {

	public void method1() {
		synchronized (Integer.class) {
			System.out.println("Aquired lock on Integer.class object");

			synchronized (String.class) {
				System.out.println("Aquired lock on String.class object");
			}
		}
	}

	public void method2() {
		synchronized (Integer.class) {
			System.out.println("Aquired lock on Integer.class object");

			synchronized (String.class) {
				System.out.println("Aquired lock on String.class object");

			}
		}
	}
}