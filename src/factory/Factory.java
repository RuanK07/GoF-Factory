package factory;

public class Factory {

	public static void main(String[] args) {
		
		var monitor = MonitorFactory.getInstance(true);
		var monitor2 = MonitorFactory.getInstance(false);
		var monitor3 = MonitorFactory.getInstance(false);
		var monitor4 = MonitorFactory.getInstance(true);
		var monitor5 = MonitorFactory.getInstance(true);

		
		System.out.println(monitor);
		System.out.println(monitor2);
		System.out.println(monitor3);
		System.out.println(monitor4);
		System.out.println(monitor5);
	}

}
