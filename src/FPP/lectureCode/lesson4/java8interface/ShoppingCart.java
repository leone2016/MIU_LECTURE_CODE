package FPP.lectureCode.lesson4.java8interface;

import java.time.LocalDate;
import java.util.List;

/**
 * Interfaces
 * tienen methodos abstractos (sin cuerpo)
 * pueden tener tipo static (public static )
 * pueden tener default methods (public default )
 * y private methods (private )
 */
public interface ShoppingCart {
	String getName();
	List<Item> getItems();
	LocalDate getDateOfPurchase();
	void addItem(Item item);

	default double getDiscount() {
		display();
		return 0.0;
	}


	//Utility that belongs with ShoppingCart
	//Should be able to compute base cost even if
	//no instance of ShoppingCart exists - a "price check"
	static double computeBaseCost(List<Item> items) {
		return 23.45;//stub
	}

	private void display() {System.out.println("");}//java 9


	default String printReceipt() {
		String ret =
			"Customer: " + getName() + "\n"
			   + getItems() + "\n"
			   + "Total: " + Util.formatDouble(getCost()) + "\n";
		if(getDiscount() > 0.0) {
			 ret += "  Applied a " + (int)(100*getDiscount()) + "% discount.";
		}
		return ret;
	}

	default double getCost() {
		return (1 - getDiscount()) * computeBaseCost(getItems());
	}
}
