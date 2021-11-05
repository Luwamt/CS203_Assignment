package assignmentold_4;

public class ContactValues {

	private String value;
	private String type;	
	
	public ContactValues(String value, String type) {
		this.value = value;
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "value: " + value + ", Type: " + type ;
	}

	
}
