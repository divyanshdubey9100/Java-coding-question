package in.problems.code.corejava;

public class SingeltinPatternExample {
	private static SingeltinPatternExample instance;
	private SingeltinPatternExample(){}
	
	public static SingeltinPatternExample getInstance() {
		if(instance == null) {
			instance=new SingeltinPatternExample();
		}
		return instance;
	}
}
