package week3.day4;

public class APIClient {
	
	public void Sports() {
		
		System.out.println("Sports");
		

	}
	
	public void Sports(String gameName, String country) {
		
		System.out.println("Game Name is "+gameName + " Country is "+country);
		

	}
	
	public void Sports(String batsManFName, String batsManSecName, int score ) {
		
		System.out.println("Batsman Name "+ batsManFName +" & " + batsManSecName +". Runs Scored: "+score);

	}

	public static void main(String[] args) {
		
		APIClient objGame = new APIClient();
		objGame.Sports();
		objGame.Sports("Cricket", "India");
		objGame.Sports("Virat", "Kohli", 20000);
		
		

	}

}
