package FPP.lectureCode.lesson3.objectdemo;

import FPP.lectureCode.lesson3.Empleado;

import java.util.ArrayList;

/**
 * The Main class is the driver class in this package 
 * that coordinates construction and behavior of 
 * objects in this package.
 * 
 * @author pcorazza
 *
 */
public class Main {

	public static void main(String[] args) {

	}

	private static void test(){
		Empleado emp = new Empleado();
		Customer cust = new Customer("Bob");
		cust.createNewAccount();
		cust.makeDeposit(5000);
		cust.makeWithDrawal(1250);
		String id = cust.readCheckingAccountId();
		double bal = cust.checkBalance();
		System.out.printf("%s's Account ID: %s%n%s's balance: %.2f",
				cust.getName(), id, cust.getName(), bal);
	}

	private static void test2(){
		Customer cust = new Customer("Bob");
		cust.createNewAccount();
		cust.makeDeposit(5000);
		cust.makeWithDrawal(1250);
		String id = cust.readCheckingAccountId();
		double bal = cust.checkBalance();
		System.out.printf("%s's Account ID: %s%n%s's balance: %.2f",
				cust.getName(), id, cust.getName(), bal);
	}
}
