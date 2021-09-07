package latihan4;

public class PertandinganMain {

	public static void main(String[] args) {
		Tim tim1 = new Tim("Persib");
		Tim tim2 = new Tim("Arema");
		Tim tim3 = new Tim("Persikab");
		Tim tim4 = new Tim("Semen Padang");
		Tim tim5 = new Tim("Persipura");
		
		Pertandingan p1 = new Pertandingan(tim1, tim2);
		p1.setSkor(2, 0);
		
		Pertandingan p2 = new Pertandingan(tim1, tim3);
		p2.setSkor(3, 3);
		
		Pertandingan p3 = new Pertandingan(tim1, tim4);
		p3.setSkor(3, 1);
		
		Pertandingan p4 = new Pertandingan(tim1, tim5);
		p4.setSkor(1, 3);
		
		Klasemen klasemen = new Klasemen(tim1);
		klasemen.tambahPertandinganTim1(p1);
		klasemen.tambahPertandinganTim1(p2);
		klasemen.tambahPertandinganTim1(p3);
		klasemen.tambahPertandinganTim1(p4);
		System.out.println(klasemen);
	}
}
