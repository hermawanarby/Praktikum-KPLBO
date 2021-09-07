package latihan4;

public class GajiMain {

	public static void main(String[] args) {
		GajiPelatih gpel = new GajiPelatih(2000000, 10000000);
		System.out.println("Gaji Pelatih: " + gpel.hitungGaji());
		
		int bonusMenang = 1000000;
		int bonusGol = 500000;
		
		GajiPemain gpem1 = new GajiPemain(8000000, bonusMenang, bonusGol);
		GajiPemain gpem2 = new GajiPemain(10000000, bonusMenang, bonusGol);
		GajiPemain gpem3 = new GajiPemain(50000000, bonusMenang, bonusGol);
		
		Pemain pemain1 = new Pemain("Febri haryadi", 22, gpem1);
		Pemain pemain2 = new Pemain("Sergio Van Dijk", 10, gpem2);
		Pemain pemain3 = new Pemain("Michael Essien", 5, gpem3);
		
		System.out.println(pemain1);
		System.out.println(pemain2);
		System.out.println(pemain3);
	}

}
