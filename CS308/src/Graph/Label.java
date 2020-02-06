package Graph;

public class Label<T> {
	
	private T label;
	private String str;
	
	public Label(T label) {
		this.label = label;
		
	}
	
	public T getLabel() {
		return this.label;
	}
	
	public void setLabel(T label) {
		this.label = label;
	}
	
	//extend this class and override toString method if you want a custom label or some different object
	@Override
	public String toString() {
		if(label instanceof String) str = (String) label;
		return str;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
}
