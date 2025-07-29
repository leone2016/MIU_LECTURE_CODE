package FPP.lectureCode.lesson4.empmanager.useinheritance;

public class Main {

	public static void main(String[] args) {
		Manager m = new Manager("Boss Guy", 80000, 1987, 12, 15);
		m.getName();		//ok
		m.setBonus(5000);  	//ok
		
		Employee e = new Employee("Jimbo", 50000, 1989, 10, 1);
		e.getName();  		//ok
		//e.setBonus(5000);	//compiler error

		
	}

}
