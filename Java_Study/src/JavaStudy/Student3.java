package JavaStudy;
import javax.swing.JOptionPane;

public class Student3 {
	String studentnum;
	String name;
	int korscore;
	int engscore;
	int mathscore;
	
	public void setstum() {
		studentnum=JOptionPane.showInputDialog(null,"�й� �Է�");
	}
	public void setname() {
		name=JOptionPane.showInputDialog(null,"�̸� �Է�");
	}
	public void setkorscore() {
		String skors=JOptionPane.showInputDialog(null,"�������� �Է�");
		korscore=Integer.parseInt(skors);
	}
	public void setengscore() {
		String skors=JOptionPane.showInputDialog(null,"�������� �Է�");
		engscore=Integer.parseInt(skors);
	}
	public void setmathscore() {
		String skors=JOptionPane.showInputDialog(null,"�������� �Է�");
		mathscore=Integer.parseInt(skors);
	}
	
	public void total() {
		JOptionPane.showMessageDialog(null,"�� ���� : "+(korscore+engscore+mathscore));
	}
	public void aver() {
		JOptionPane.showMessageDialog(null,"��� : "+(korscore+engscore+mathscore)/3);
	}
}
