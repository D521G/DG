import javax.swing.*;  
import java.awt.*;  
import java.awt.geom.Ellipse2D;  
public class Traffic extends JFrame{  
    trafficePane traffic=new trafficePane();  
      
    public Traffic(){  
        super("��ͨ���̵�-�����������ø��ȵȴ�ʱ��! create by qkl");  
        JPanel pane=new JPanel();  
        pane.setLayout(new GridLayout(1,1));  
        pane.add(traffic);  
        setContentPane(pane);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setSize(130,300);  
        setVisible(true);  
          
    }  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        Traffic test=new Traffic();  
    }  
}  
