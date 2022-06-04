package JavaStudy;
import javax.swing.JOptionPane;

public class calcur {
	String name;
	int score;
	public void setname() {
		name = JOptionPane.showInputDialog(null,"이름을 입력하세요.");
	}
	public void setscore() {
		String Sscore = JOptionPane.showInputDialog(null,"점수을 입력하세요.");
		score=Integer.parseInt(Sscore);
	}
	public void printall() {
		if(score>=90)
			JOptionPane.showMessageDialog(null, name+"의 학점은 'A'입니다.");
		else if(score>=80)
			JOptionPane.showMessageDialog(null, name+"의 학점은 'B'입니다.");
		else if(score>=70)
			JOptionPane.showMessageDialog(null, name+"의 학점은 'C'입니다.");
		else if(score>=60)
			JOptionPane.showMessageDialog(null, name+"의 학점은 'D'입니다.");
		else if(score<60)
			JOptionPane.showMessageDialog(null, name+"의 학점은 'F'입니다.");
	}
}
