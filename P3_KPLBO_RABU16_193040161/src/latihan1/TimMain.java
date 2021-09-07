package latihan1;

public class TimMain {

	public static void main(String[] args) {
		Tim tim = new Tim("Persib");
		
		Pemain pemain = new Pemain("I Made", 1);
		tim.tambahPemain(pemain);
		
		pemain = new Pemain("Essien", 99);
		tim.tambahPemain(pemain);
		
		pemain = new Pemain("Atep", 7);
		tim.tambahPemain(pemain);
		
		tim.tambahPemain(new Pemain("Febry", 22));
		
		tim.tampilPemain();
	}

}
