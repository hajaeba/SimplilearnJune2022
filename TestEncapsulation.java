package mypackage;
 class Encapsulate
 {
	 private String Name;
	 private int RollNo;
	 private int Age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
 }
public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulate obj = new Encapsulate();
		obj.setName( "Mendu");
		obj.setAge(32);
		obj.setRollNo(555);
		System.out.println("My name:"+ obj.getName());
		System.out.println("My age:"+ obj.getAge());
		System.out.println("My RollNo:"+ obj.getRollNo());
	}

}
