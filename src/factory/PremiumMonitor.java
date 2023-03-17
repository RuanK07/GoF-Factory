package factory;

import java.util.List;

public class PremiumMonitor extends Monitor {
	
	protected PremiumMonitor() {
		this.technologies = List.of(
			new Technologies("IPS"),
			new Technologies("240hz"),
			new Technologies("curved"),
			new Technologies("VESA")
		);
	}

}
