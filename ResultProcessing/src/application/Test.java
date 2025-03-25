package application;

import mylibs.ResultProcessing;
import mylibs.Student;

public class Test {

	public static void main(String[] args) {
		new ResultProcessing().insert(new Student(2, "XKumar","BSCSE","Level4","C",78, 65));
	}
}