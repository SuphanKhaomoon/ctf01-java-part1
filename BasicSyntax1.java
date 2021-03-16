package CTF01.Java.part1.No2_1;

public class BasicSyntax1
{

//		1.ลอง Comment ทั้งแบบ Single Line และ Multiple Line

	// Single Line

	/*
	 * Multiple Line
	 */

//		2.ประกาศตัวแปรประเภทต่างๆ
//				a. int
//				b. boolean
//				c. String
//				d. (Optional) หาตัวแปรประเภทอื่นๆเอง อีกสัก 2 ประเภทใน google

	public static int a = 0;
	public static boolean isTrue = true;
	public static String str = "Suphan";
	public static double d = 0.02;
	public static char ch = 'a';

// 3.Print ทุกๆตัวแปร จากข้อ 2 ออกมาในรูปแบบ "This is a String " + variable

	public static void main(String[] args)
	{

		System.out.println("This is a int " + a);
		System.out.println("This is a boolean " + isTrue);
		System.out.println("This is a String " + str);
		System.out.println("This is a double " + d);
		System.out.println("This is a char " + ch);

	}

}
