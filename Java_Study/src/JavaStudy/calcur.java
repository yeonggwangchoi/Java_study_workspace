package JavaStudy;
import javax.swing.JOptionPane;

public class calcur {
	String name;
	int score;
	public void setname() {
		name = JOptionPane.showInputDialog(null,"�̸��� �Է��ϼ���.");
	}
	public void setscore() {
		String Sscore = JOptionPane.showInputDialog(null,"������ �Է��ϼ���.");
		score=Integer.parseInt(Sscore);
	}
	public void printall() {
		if(score>=90)
			JOptionPane.showMessageDialog(null, name+"�� ������ 'A'�Դϴ�.");
		else if(score>=80)
			JOptionPane.showMessageDialog(null, name+"�� ������ 'B'�Դϴ�.");
		else if(score>=70)
			JOptionPane.showMessageDialog(null, name+"�� ������ 'C'�Դϴ�.");
		else if(score>=60)
			JOptionPane.showMessageDialog(null, name+"�� ������ 'D'�Դϴ�.");
		else if(score<60)
			JOptionPane.showMessageDialog(null, name+"�� ������ 'F'�Դϴ�.");
	}
}
