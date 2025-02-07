package week4.day5;

public class TypeConversionTest {

	public static void main(String[] args) {
		//byte->short->int->long->float->double - Auto Conversion
		byte bn=23; //assign 23 to byte
		short sn=bn; //value of byte to short
		int in=sn; //value of short to int
		long ln=in; //value to int to long
		float fn=ln; //value of long to float
		double dn=fn; //value of float to double
		System.out.println(dn); //accessing the value of double
		
		//byte->short->int->long->float->double - Auto Conversion
		//double->float->long->int->short->byte - Type Casting
		dn=98.6789;
		bn=(byte)dn; //-128 to 127 -> Cast to Byte (double to short)
		System.out.println(bn);
		
		

	}

}




