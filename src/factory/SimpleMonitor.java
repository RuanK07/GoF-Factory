 package factory;

import java.util.List;

public class SimpleMonitor extends Monitor {
	
	protected SimpleMonitor() {
		this.technologies = List.of(
			new Technologies("VA"),
			new Technologies("60hz"),
			new Technologies("flat")
		);
	}

}