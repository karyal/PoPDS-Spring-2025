package week4.day5;

public class WrapperClassTest {

	public static void main(String[] args) {
		//byte, short, int, long, float, double - primitive data type
		//Byte - Class which can store byte value and have methods related to byte
		
		/*
		byte bn=2;
		Byte objBn=bn;
		System.out.println(objBn);
		System.out.println(Byte.SIZE); //8 bits
		System.out.println(Byte.MAX_VALUE);//127
		System.out.println(Byte.MIN_VALUE);//-128
		
		//static byte parseByte(String s) 	//String to byte conversion
		bn = Byte.parseByte("123");
		bn++;
		System.out.println(bn);
		
		//static String toString(byte b)	//byte to String conversion
		String str1=Byte.toString(bn);
		str1=str1+567;
		System.out.println(str1);
		*/
		
		//Explore Short Class
		//short - type
		//Short - Class
		
		short sn = 678;
		Short snObj=sn;
		System.out.println(snObj);
		System.out.println(Short.SIZE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		sn = Short.parseShort("678");
		System.out.println(++sn);
		String str1 = Short.toString(sn);
		str1=str1+987;
		System.out.println(str1);
				
		//int->Integer
		//long->Long
		//float->Float
		//double->Double
	}

}







