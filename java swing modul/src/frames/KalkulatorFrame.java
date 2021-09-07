/**
 * Created by Hermawan Arby 193040161 on 3/5/2021.
 */
package frames;

import javax.swing.JFrame;
import panels.KalkulatorPanel;

public class KalkulatorFrame extends JFrame {
	
	public KalkulatorFrame() {
		KalkulatorPanel kp = new KalkulatorPanel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Kalkulator");
		setLocationRelativeTo(null);
		setSize(500, 200);
		add(kp);
	}
	
}
