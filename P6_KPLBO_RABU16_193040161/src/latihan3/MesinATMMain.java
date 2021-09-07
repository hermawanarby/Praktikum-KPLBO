/**
 * Created by Hermawan Arby 193040161 on 23/4/2021.
 */
package latihan3;

public class MesinATMMain {
	
	public static void main(String[] args) {
		MesinATM mesinATM = new MesinATM();
		
		Kartu kartu1 = new KartuATM("222", "123");
		mesinATM.cekPIN(kartu1, "123");
		mesinATM.tarikTunai();
		mesinATM.cekPIN(kartu1, "237");
		mesinATM.tarikTunai();
		
		Kartu kartu2 = new KartuKredit("333", "457");
		mesinATM.cekPIN(kartu2, "457");
		mesinATM.tarikTunai();
	}
}
