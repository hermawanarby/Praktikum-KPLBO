package latihan4;

public class PemainMain {

	public static void main(String[] args) {
		Pemain pemain1 = new Pemain();
		pemain1.setNama("Devid Seaman");
		pemain1.setNoPunggung(1);
		System.out.println(pemain1);
		
		Pemain pemain2 = new Pemain("Toni Adams");
		pemain2.setNoPunggung(6);
		System.out.println(pemain2);
		
		Pemain pemain3 = new Pemain("Thiery Henry", 11);
		System.out.println(pemain3);
	}

}
