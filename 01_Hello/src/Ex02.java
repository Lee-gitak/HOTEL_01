
public class Ex02 {

	public static void main(String[] args) {
		// 십진수, 2진수, 8진수, 16진수
		int decimal2 = 123_456_789; //십진수값 저장
		int decimal = 10;
		int binary = 0B1010;
		int octal = 012;
		int hexaDecimal = 0Xa;
		System.out.println("decimal : " + decimal);
		System.out.println("binary(0B1010) : " + binary);
		System.out.println("octal(012) : " + octal);
		System.out.println("hexaDecimal(0Xa) : " + hexaDecimal);
		System.out.println(Integer.toBinaryString (10));
		System.out.println(Integer.toOctalString (10));
		System.out.println(Integer.toHexString (10));
		
		
		

	}

}
