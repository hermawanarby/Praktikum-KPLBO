package latihan5;

import java.util.List;
import java.util.ArrayList;

public class Persistence {
	public static List<Pemain> getAllPemain() {
		List<Pemain> daftarPemain = new ArrayList<>();
		
		daftarPemain.add(new Pemain("I Made", 1, 95, false));
		daftarPemain.add(new Pemain("Essien", 99, 85, false));
		daftarPemain.add(new Pemain("Atep", 7, 90, false));
		daftarPemain.add(new Pemain("Febry", 22, 90, false));
		daftarPemain.add(new Pemain("Van Dijk", 9, 75, true));
		daftarPemain.add(new Pemain("Tony", 3, 80, true));
		
		return daftarPemain;
	}
}
