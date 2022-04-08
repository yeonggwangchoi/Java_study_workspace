package JavaStudy;
import javax.swing.JOptionPane;

public class JOptionpane {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "이름을 입력하세요.");
		JOptionPane.showMessageDialog(null,"이름은'"+name+"'입니다.");
	}
	
}
