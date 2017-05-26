import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
public class Treat extends JFrame{
	//文件
	ClassTest classTest = new ClassTest();
	
	public Treat(){
		super("交通红绿灯");
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