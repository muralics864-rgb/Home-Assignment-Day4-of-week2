package week3.day4;

public class LoginPage extends BasePage {

	@Override
	public void findElement() {

		super.clickElement();
		super.findElement();
		// Overrided from Superclass to subclass
		System.out.println("Find Element Method from LoginPage");

	}

	public static void main(String[] args) {

		LoginPage objLogPage = new LoginPage();

		objLogPage.findElement();
	}

}
