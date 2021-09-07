/**
 * Created by Hermawan Arby 193040161 on 23/4/2021.
 */
package latihan2;

public class KartuMain {
	
	public static void main(String[] args) {
		Kartu kartu1 = new KartuATM("222", "123");
		Kartu kartu3 = new KartuKredit("333", "457");
		
		System.out.println("Kartu1: " + kartu1.otentikasi("123")); //123X == 123X 
		System.out.println("Kartu1: " + kartu1.otentikasi("237")); //123X == 237X 
		
		System.out.println("Kartu3: " + kartu3.otentikasi("457")); //457Y == 457Y 
		System.out.println("Kartu3: " + kartu3.otentikasi("444")); //444Y != 444Y 
	}
}
