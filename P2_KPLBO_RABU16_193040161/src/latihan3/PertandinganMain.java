package latihan3;

public class PertandinganMain {

	public static void main(String[] args) {
		Tim tim1 = new Tim("Persib");
		Tim tim2 = new Tim("Arema");
		Tim tim3 = new Tim("Persikab");
		
		Pertandingan p1 = new Pertandingan(tim1, tim2);
		p1.setSkor(2, 0);
		
		Pertandingan p2 = new Pertandingan(tim1, tim3);
		p2.setSkor(3, 3);

		Klasemen klasemen = new Klasemen(tim1);
		klasemen.tambahPertandinganTim1(p1);
		klasemen.tambahPertandinganTim1(p2);
		System.out.println(klasemen);
	}

}
