package HomeWork;

public class Paper {

	public static void main(String[] args) {
		/*
		 * ����1) ������ ���� 2���� ���� �� ���� 37�� 91�� ���� �ʱ�ȭ �� ������ ����϶�. ��¿���)
		 * "������1: ������, ������2: ������"
		 */
		System.out.println("���� 1��");

		int num1 = 37;
		int num2 = 91;

		System.out.println("num1�� ��: " + num1 + ", num2�� ��: " + num2);
		System.out.println();

		/*
		 * ����2) ���� 1���� ������ �̿��Ͽ� �� ������ ������ ����� ����϶�. 2.1) 91 ���ϱ� 37 2.2) 91 ���� 37 2.3) 91
		 * ���ϱ� 37 2.4) 91 ������ 37
		 */
		System.out.println("���� 2��");

		int result1 = num2 + num1;
		int result2 = num2 - num1;
		int result3 = num2 * num1;
		int result4 = num2 / num1;

		System.out.println("91 ���ϱ� 37 = " + result1);
		System.out.println("91 ���� 37 = " + result2);
		System.out.println("91 ���ϱ� 37 = " + result3);
		System.out.println("91 ������ 37 = " + result4);
		System.out.println();

		/*
		 * ����3) �� ������ ���� �°� ����Ÿ���� ���� �� ���� ����Ÿ���� printf()�� ����Ͽ� ����ϼ���. ��¿���) int a = 10;
		 * �� ��� "10, int"�� ���.
		 */

		System.out.println("���� 3��");
		// 3-1) byte var1 = 128; =>
		int var1 = 128;
		System.out.printf("%d, %s\n", var1, "int");

		// 3-2) char var2 = "B"; =>
		String var2 = "B";
		System.out.printf("%s, %s\n", var2, "String");

		// 3-3) String var3 = 44032; =>
		int var3 = 44032;
		System.out.printf("%d, %s\n", var3, "int");

		// 3-4) int var4 = 100000000000;
		long var4 = 100000000000L;
		System.out.printf("%d, %s\n", var4, "long");

		// 3-5) float var5 = 43.93106;
		double var5 = 43.93106;
		System.out.printf("%.5f, %s\n", var5, "double");

		// 3-6) long var6 = 301.3;
		double var6 = 301.3;
		System.out.printf("%.1f, %s\n", var6, "double");
		System.out.println();

		// ����4) �Ʒ��� ���� ������ �ʱ�ȭ�Ǿ����� ��� ������� ������ ������ Ÿ���� �����ϰ� ���� �������� ����ϼ���.
		System.out.println("���� 4��");
		byte a = 35;
		byte b = 25;
		int c = 463;
		long d = 1000L;

		/*
		 * 4-1) result1 = a + c + d; System.out.println(result1);
		 */
		long re1 = a + c + d;
		System.out.println(re1);

		/*
		 * 4-2 ) result2 = a + b + c; System.out.println(result2);
		 */
		int re2 = a + b + c;
		System.out.println(re2);

		/*
		 * 4-3 ) double e = 45.31; result3 = c + d + e; System.out.println(result3);
		 */
		double e = 45.31;
		double re3 = c + d + e;
		System.out.println(re3);
		System.out.println();

		/*
		 * ����5) �Ʒ��� ���� ������ �ʱ�ȭ�Ǿ����� ��� ������ ���� ��õȵ��� ����ϼ���. ��¿���) A278����10.0
		 */
		System.out.println("���� 5��");
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = "����";

		int p1 = intValue1 + intValue2;
		double p2 = (int) intValue4;
		String str = String.valueOf(charValue);

		System.out.println(str + p1 + intValue3 + strValue + p2);
		System.out.println();
		/*
		 * �߰�����) �Ʒ��� ���� ���� ���� �־��� ��� �� �ڸ��� ���� ���� ����ϼ���. ����) 373 �� ��� 3 + 7 + 3 = 13 ����
		 * ����� 13�Դϴ�. ��Ʈ) ���ϱ� ������ (*), ������ ������( / ) �� ���� ������ ( - ) �� �̿��ϼ���.
		 */
		System.out.println("���� 6��");
		int value = 485;

		int val1 = value / 100;
		int val2 = (value - (val1 * 100)) / 10;
		int val3 = value - ((value / 10) * 10);
		int sum = val1 + val2 + val3;
//		System.out.println(val1);
//		System.out.println(val2);
//		System.out.println(val3);

		System.out.println(sum);

//		int val1 = value / 100;
//	    int val2 = value % 100 / 10;
//	    int val3 = value % 100 % 10;
//	    int sum = val1 + val2 + val3;
//	    System.out.println(sum);

	}
}
