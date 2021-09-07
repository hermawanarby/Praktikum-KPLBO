package latihan1;

public class PertandinganMain {

	public static void main(String[] args) {
		Tim tim1 = new Tim("Persib");
		Tim tim2 = new Tim("Arema");
		
		Pertandingan p = new Pertandingan(tim1, tim2);
		p.setSkor(3, 2);
		System.out.println(p);

	}

}
