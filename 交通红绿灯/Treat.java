import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
public class Treat extends JFrame{
	//�ļ�
	ClassTest classTest = new ClassTest();
	
	public Treat(){
		super("��ͨ���̵�");
		JPanel nel = new JPanel();
		nel.setLayout(new GridLayout(1,1));
		nel.add(classTest);
		setContenpane(pane);
		this.setDefaultCloseOperation(JFrame.EXIT_NO_CLOSE);
		setSize(130,300);
		setVisible(true);
		
	}
	/**
	 *@param args		
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Treat treat = new Treat(); 
	}
}