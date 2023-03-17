package factory;

import java.util.List;

public abstract class Monitor {
	
	protected List<Technologies> technologies;
	
	protected Monitor() {
	}

	public List<Technologies> getTechnologies() {
		return technologies;
	}

	@Override
	public String toString() {
		return "Monitor [technologies=" + technologies + "]";
	}
	
}
