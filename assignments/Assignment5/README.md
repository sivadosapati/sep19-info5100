# Assignment 5
## Instructions
* Max score is 10.
* Deadline is 14th October 2019, 11:59pm.
* Extra credits is NOT mandatory finished.
* Extra credits are added only if score is less than 10.
* Write Unit Test for functions
* Try to attempt every question and keep practising from other online sites. 
## Questions

Explain the difference between `final` and `finally` in Java 8.

----

Create a class called `Number`. Write a method called `count()` which can calculate quotient of two integers and use `try...catch` to deal with all possible exception.

----

Create one superclass called Employee and two subclasses – Contractor and FullTime. Both subclasses have common properties to share, like the name of the employee and the the amount of money the person will be paid per hour. There is one major difference between contractors and full-time employees – the time they work for the company. Full-time employees work constantly 8 hours per day and the working time of contractors may vary.

![avatar](https://raw.githubusercontent.com/BlancEtNoir12/INFO5100-Sep19-Assignments/master/Assignment5/UML.png)

----

When a program fails due to an uncaught exception, the system automatically prints out the exception’s stack trace. If the failure is not easily reproducible, it may be difficult or impossible to get any more information. Therefore, it is critically important that the exception’s toString() method return, as much information as possible concerning the cause of the failure. In other words, the detail message of an exception should capture the failure for subsequent analysis. To capture the failure, the detail message of an exception should contain the values of all parameters and fields that “contributed to the exception.”
* Create your own **MyIndexOutOfBoundException** Class. It should contain these parameters
	* **lowerBound** - the lowest legal index value.
	* **upperBound** - the highest legal index value.
	* **index** - the current index value.
* Test your code in main method, by creating an indexOutOfBoundException. Output error message should be like this:

	```“Error Message: Index: 10, but Lower bound: 0, Upper bound: 9”```

----
This assignment requires you to develop an object oriented software system in Java that will keep track of pets treated and boarded in an animal hospital. Detail class specifications (data members, methods and access modifiers) are described below. Please note the following requirements:
* You need to implement each class in a separate file in different package. 
* While implementing the design you may want to follow the order the classes are specified below and test each class individually. 

> **Class: Pet (File name: Pet.java)**
> 
> The class should have the following three private data members, Pet name (a String), owner name (a String), and color (a String), and one protected data members for sex (an integer, but it will only hold one of the following four public static final int values: MALE, FEMALE, SPAYED and NEUTERED. You should define these four static finals in your class). <br />
> Following are the public methods that this class should provide:
> ```java 
> Pet (String name, String ownerName, String color); //Constructor 
> String getPetName(); 
> String getOwnerName(); 
> String getColor(); 
> void setSex(int sexid); 
> String getSex(); // Should return the string equivalent of the gender, e.g the string “MALE” etc. 
> String toString(); // Should return the name, owner’s name, age, color, and gender (use getSex()); 
> ```
> A Sample (preferred) return value by toString is as follows: 
> 
> Spot owned by Mary 
<br> Color: Black and White 
<br> Sex: Male 

> **Interface: Boardable (File name: Boardable.java)** 
> 
> This interface, should include the following public methods: 
> ```java 
> void setBoardStart(int month, int day, int year); 
> void setBoardEnd(int month, int day, int year); 
> boolean boarding(int month, int day, int year); 
> ```
> See the Cat and Dog classes for what these methods should do when implemented. Note, the month will be in the range 1-12, day in the range 1-31, and year will be a four digit number. 

> **Class: Cat (File name: Cat.java)**
> 
> This class should extend the Pet class and implement the Boardable interface. In addition to the data members and methods inherited from Pet, the Cat class should have a private hairLength data member, which is a string. Following are the public methods that this class should provide 
> ```java 
> Cat (String name, String ownerName, String color, String hairLength);// Do not forget to call super. 
> String getHairLength(); // returns the string hairLength 
> String toString() 
> /* method that returns a String that identifies the pet as Cat and returns a complete description of 
> the cat, including the values stored in the Pet parent class.*/
> ```
> A Sample (preferred) return value by toString is as follows: 
> 
> CAT: 
<br> Tom owned by Bob 
<br> Color: black 
<br> Sex: spayed 
<br> Hair: short 
> 
> In order to implement the Boardable interface define new data members to store the boarding start and end dates, implement the setBoardStart and setBoardEnd methods to store values for these data members. Also implement the boarding method to return true if the given data is between the start and end dates, otherwise it returns false. Note: You should also return true if the given date is equal to the start or end date. 


> **Class: Dog (File name: Dog.java)**
> 
> This class should extend the Pet class and implement the Boardable interface. In addition to the data members and methods inherited from Pet, the Dog class should have a private size data member, which is a string. Following are the public methods that this class should provide: 
> ```java
> Dog (String name, String ownerName, String color, String size); 
> // Constructor must set the size. Do not forget to call super. 
> String getSize(); // returns the string size String toString(); 
> /* method that returns a String that identifies the pet as Dog and returns a complete description of 
> the dog, including the values stored in the Pet parent class. */ 
> ```
> A Sample (preferred) return value by toString is as follows: 
> 
> DOG: 
<br> Spot owned by Susan 
<br> Color: white 
<br> Sex: spayed 
<br> Size: medium 
> 
> In order to implement the Boardable interface define new data members to store the boarding start and end dates, implement the setBoardStart and setBoardEnd methods to store values for these data members. Also implement the boarding method to return true if the given data is between the start and end dates, otherwise it returns false. Note: You should also return true if the given date is equal to the start or end date.

----

## Extra Credit
Give the answer shows in console and explain why. (For example, list the operation order of statements.)
* DO NOT run this code in your compiler.
```java
class A {
	List<Object> list = new LinkedList<>();
	public boolean addAll(Collection<Object> c) {
		Iterator<Object> it = c.iterator();
		while(it.hasNext())
			this.add(it.next());
		return true;
	}
	public boolean add(Object e) {
		list.add(e);
		return true;
	}

	private int i = 0;
	public int getI(){
		return i;
	}
}

class B extends A {
	private int addCount = 0;
	public int getAddCount() {
		return addCount;
	}

	@Override
	public boolean addAll(Collection<Object> c) {
		addCount += c.size();
		return super.addAll(c);
	}
	
	@Override
	public boolean add(Object e) {
		addCount++;
		return super.add(e);
	}
    
	public int i = 3;
}

public class Test {
	public static void main(String[] args) {
		B b = new B();
		List<Object> list = Arrays.asList(1,2,3);
		b.addAll(list);
		System.out.println(b.getAddCount()+b.getI());
	}
} 
```
