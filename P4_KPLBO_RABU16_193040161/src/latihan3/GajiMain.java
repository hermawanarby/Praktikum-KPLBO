package latihan3;

public class GajiMain {

	public static void main(String[] args) {
		GajiPelatih gpel = new GajiPelatih(2000000, 10000000);
		System.out.println("Gaji Pelatih: " + gpel.hitungGaji());
		
		int bonusMenang = 1000000;
		int bonusGol = 500000;
		
		GajiPemain gpem1 = new GajiPemain(8000000, bonusMenang, bonusGol);
		GajiPemain gpem2 = new GajiPemain(10000000, bonusMenang, bonusGol);
		GajiPemain gpem3 = new GajiPemain(50000000, bonusMenang, bonusGol);
		
		System.out.println("Gaji Pemain 1: " + gpem1.hitungGaji());
		System.out.println("Gaji Pemain 2: " + gpem2.hitungGaji());
		System.out.println("Gaji Pemain 3: " + gpem3.hitungGaji());
	}

}
