package factory;

public class MonitorFactory {
	
	private MonitorFactory() {
	}
	
	public static Monitor getInstance(boolean premium) {
		return premium ? new PremiumMonitor() : new SimpleMonitor();
	}
}
