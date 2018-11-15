package _11인터페이스의이해;

public class ClassA implements InterfaceA {

	@Override
	public void speak() {
		System.out.println("예솔아~");
	}

	@Override
	public void cry() {
		System.out.println("엉엉~");
	}
	
}
