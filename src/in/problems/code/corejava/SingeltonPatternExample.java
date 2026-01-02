package in.problems.code.corejava;

public class SingeltonPatternExample {
	private static SingeltonPatternExample instance;
	private SingeltonPatternExample(){}
	
	public static SingeltonPatternExample getInstance() {
		if(instance == null) {
			instance=new SingeltonPatternExample();
		}
		return instance;
	}
}
