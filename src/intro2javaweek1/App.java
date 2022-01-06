package intro2javaweek1;

public class App {
	public static void main(String[] args) {
		//double price = 34.50;
		//System.out.println(price);
		
		//Create amount of money in wallet
		System.out.println("I have exactly");
//		a.	Item price
//		b.	Amount of money in wallet
//		c.	Number of friends
//		d.	Age in years (as a whole number)
//		e.	First name
//		f.	Last name
//		g.	Middle initial
		double guitarPrice = 999.99;
		double cleetsPrice = 89.10;
		double tomsWallet = 2000.00;
		double steveWallet = 32.45;
		int tomsFriends = 4;
		int steveFreinds = 6;
		int tomsAge = 24;
		int SteveWallet = 42;
		String firstName = ("Tom");
		String lastName = ("Smith");
		char middleInitial = 'A';
		
				
				
				
//		a.	New amount of money in wallet after buying the item
		double newAmount = tomsWallet - guitarPrice;
		System.out.println(newAmount);
//		b.	Number of friends you’ve made each year based on your age variable and your number of friends variable
		double friendsPerYear = Double.valueOf(tomsFriends) / Double.valueOf(tomsAge);
		System.out.println(friendsPerYear);
//		c.	Full name based on first name, middle initial, and last name
		String fullName = firstName + " " + lastName + " , " + middleInitial;
		System.out.println(fullName);
		
		
		
	}

}
