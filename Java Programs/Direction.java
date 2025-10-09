package JavaPackage;

public enum Direction {
	NORTH("N"), EAST("E"), SOUTH("S"), WEST("W");
	
	private final String shortCode;
	
	Direction(String code) {
		this.shortCode = code;
	}
	
	public String getshortCode() {
		return shortCode;
	}
}
