package mypackage;

public class Dog {
  
	String name;
	String breed;
	int age;
	String color;
	//para constructor
	public Dog(String name, String breed, int age, String color)
	{
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	public String getName()
	{
		return name;
	}
	public String getBreed()
	{
		return breed;
	}
	public int getAge()
	{
		return age;
	}
	public String getColor()
	{
		return color;
	} 
	@Override
	public String toString()//it is predefine method need to use override key word
	{
	 return("Hi my name is " +this.getName()+".\nMy breed, age and color are "
	       + "" +this.getBreed()+", "
	       + "" +this.getAge()+ ", and "+this.getColor());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //dog obj
		Dog scott = new Dog("Scott","papillon",5," black.");
		System.out.println(scott.toString());//it will return the above toString stmt
	}

}
