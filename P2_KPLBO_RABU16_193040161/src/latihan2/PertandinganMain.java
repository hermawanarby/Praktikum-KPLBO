package latihan2;

public class PertandinganMain {

	public static void main(String[] args) {
		Tim tim1 = new Tim("Persib Bandung");
		Tim tim2 = new Tim("Arema Malang");
		
		Pertandingan p = new Pertandingan(tim1, tim2);
		p.setSkor(2, 0);
		System.out.println(p);
		
		System.out.println(tim1.getNama() + ": " + p.getStatusTim1());
		System.out.println(tim2.getNama() + ": " + p.getStatusTim2());

	}

}
