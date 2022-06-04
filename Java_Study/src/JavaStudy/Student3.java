package JavaStudy;
import javax.swing.JOptionPane;

public class Student3 {
	String studentnum;
	String name;
	int korscore;
	int engscore;
	int mathscore;
	
	public void setstum() {
		studentnum=JOptionPane.showInputDialog(null,"학번 입력");
	}
	public void setname() {
		name=JOptionPane.showInputDialog(null,"이름 입력");
	}
	public void setkorscore() {
		String skors=JOptionPane.showInputDialog(null,"국어점수 입력");
		korscore=Integer.parseInt(skors);
	}
	public void setengscore() {
		String skors=JOptionPane.showInputDialog(null,"영어점수 입력");
		engscore=Integer.parseInt(skors);
	}
	public void setmathscore() {
		String skors=JOptionPane.showInputDialog(null,"수학점수 입력");
		mathscore=Integer.parseInt(skors);
	}
	
	public void total() {
		JOptionPane.showMessageDialog(null,"총 점수 : "+(korscore+engscore+mathscore));
	}
	public void aver() {
		JOptionPane.showMessageDialog(null,"평균 : "+(korscore+engscore+mathscore)/3);
	}
}
