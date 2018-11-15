package _07상속과생성자의이해1;

public class ClassA extends ClassB {
	ClassA(){
		System.out.println("ClassA() 호출");
	}
	ClassA(int a){
		System.out.println("ClassA(int a) 호출");
	}
}
