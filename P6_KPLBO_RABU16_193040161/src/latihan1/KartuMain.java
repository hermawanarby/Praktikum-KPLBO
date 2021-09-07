/**
 * Created by Hermawan Arby 193040161 on 23/4/2021.
 */
package latihan1;

public class KartuMain {
	
	public static void main(String[] args) {
		Kartu kartu1 = new KartuATM("222", "123");
		Kartu kartu2 = new KartuATM("333", "345");
		
		System.out.println("Kartu1: " + kartu1.otentikasi("123")); //123X == 123X => true
		System.out.println("Kartu1: " + kartu1.otentikasi("237")); //123X == 237X => false
		System.out.println("Kartu2: " + kartu2.otentikasi("345")); //345X == 345X => true
		System.out.println("Kartu2: " + kartu2.otentikasi("356")); //345X != 356X => false
	}
}
