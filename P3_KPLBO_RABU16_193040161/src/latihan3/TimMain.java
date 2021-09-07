package latihan3;

public class TimMain {

	public static void main(String[] args) {
		Tim tim = new Tim("Persib");
		
		Pemain pemain = new Pemain("I Made", 1, 2000000);
		tim.tambahPemain(pemain);
		
		pemain = new Pemain("Essien", 99, 10000000);
		tim.tambahPemain(pemain);
		
		pemain = new Pemain("Atep", 7, 2500000);
		tim.tambahPemain(pemain);
		
		tim.tambahPemain(new Pemain("Febry", 22, 1500000));
		
		tim.tampilPemain();
		System.out.println("Total Gaji Perminggu: " + tim.hitungTotalGajiPerMinggu());
		System.out.println("Total Gaji Perbulan: " + tim.hitungTotalGajiPerBulan());
	}

}
