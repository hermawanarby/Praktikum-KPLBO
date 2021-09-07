package latihan5;

public class TimMain {
	public static void main(String[] args) {
		Tim tim = new Tim("Persib");
		
		Pemain pemain = new Pemain("I Made", 1);
		tim.tambahPemainInti(pemain);
		
		pemain = new Pemain("Atep", 7);
		tim.tambahPemainInti(pemain);
		
		pemain = new Pemain("Essien", 5);
		tim.tambahPemainInti(pemain);
		
		tim.tambahPemainInti(new Pemain("Febry", 22));
		
		// ---------------------
		
		pemain = new Pemain("Wander Luiz", 9);
		tim.tambahPemainInti(pemain);
		
		pemain = new Pemain("Ferdinand", 6);
		tim.tambahPemainInti(pemain);
		
		pemain = new Pemain("Victor", 32);
		tim.tambahPemainInti(pemain);
		
		pemain = new Pemain("Ezra Waliam", 30);
		tim.tambahPemainInti(pemain);
		
		pemain = new Pemain("Frets Butuan", 21);
		tim.tambahPemainInti(pemain);
		
		pemain = new Pemain("Viscarra", 10);
		tim.tambahPemainInti(pemain);
		
		pemain = new Pemain("Erwin", 93);
		tim.tambahPemainInti(pemain);
		
		pemain = new Pemain("Dedi Kusnandar", 11);
		tim.tambahPemainInti(pemain);
		
		pemain = new Pemain("Kuipers", 2);
		tim.tambahPemainInti(pemain);
		
		pemain = new Pemain("Zalnando", 27);
		tim.tambahPemainInti(pemain);
		
		// --- Pemain Cadangan ---
		pemain = new Pemain("Teja", 14);
		tim.tambahPemainCadangan(pemain);
		
		pemain = new Pemain("Zola", 18);
		tim.tambahPemainCadangan(pemain);
		
		pemain = new Pemain("Aziz", 8);
		tim.tambahPemainCadangan(pemain);
		
		pemain = new Pemain("Bayu", 4);
		tim.tambahPemainCadangan(pemain);
		
		pemain = new Pemain("Jufriyanto", 16);
		tim.tambahPemainCadangan(pemain);
		
		pemain = new Pemain("Henhen", 12);
		tim.tambahPemainCadangan(pemain);
		
		
		System.out.println("");
		System.out.println("== Pemain Inti ==");
		tim.tampilPemainInti();
		
		System.out.println("");
		System.out.println("== Pemain Cadangan ==");
		tim.tampilPemainCadangan();
	}
}
