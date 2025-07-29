package FPP.lectureCode.lesson12.checkedexceptions.problem;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class CallingClass {
	void writeInfo() throws IOException {
		//need to handle possible exception
		FileWriter fw = new FileWriter("MyFile");  //compiler error
		TreeSet ts;
	}
}
