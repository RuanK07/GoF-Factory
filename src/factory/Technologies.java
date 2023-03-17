package factory;

public class Technologies {
	
	private String name;

	private Technologies() {
	}

	protected Technologies(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Technologies [name=" + name + "]";
	}
	
}
