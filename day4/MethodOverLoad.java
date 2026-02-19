package week3.day4;

public class MethodOverLoad {

	public void reportStep(String a, String b) {

		System.out.println(a + b);

	}

	public void reportStep(String c, String d, Boolean e) {

		System.out.println(c + d + "Snap " + e);

	}

	public static void main(String[] args) {

		MethodOverLoad obj1 = new MethodOverLoad();

		obj1.reportStep("Method Status ", "Pass");
		obj1.reportStep("Method 1 Status ", "Fail ", true);

	}

}
