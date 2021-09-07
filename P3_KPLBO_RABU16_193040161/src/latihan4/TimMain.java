package latihan4;

public class TimMain {

	public static void main(String[] args) {
		Tim tim = new Tim("Persib");
		tim.setDaftarPemain(Persistence.getAllPemain());
		tim.cekKebugaranPemain();
	}

}
