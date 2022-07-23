package mypackage;
 
 interface First//multiple inheritance Diamond problem
 {
	 default void show()
	 {
		 System.out.println("Default First");
	 }
 }
 interface Second
 {
	 default void show() 
	 {
		 System.out.println("Default Second");
	 }
 }
public class TestClass implements First,Second{//drived class
	//has more than one base class or multiple inheritance

	@Override
	public void show() {
		// TODO Auto-generated method stub
		First.super.show();
		Second.super.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	TestClass obj = new TestClass();
	obj.show();//TestClass show called


}
}
