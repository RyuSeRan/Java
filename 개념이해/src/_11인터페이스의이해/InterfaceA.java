package _11인터페이스의이해;

public interface InterfaceA {
	public static int AAA=10;
	int BBB=20;
	
	abstract void speak();
	void cry();
	
	static void angry() {
		System.out.println("아르르르~");
	}
}
