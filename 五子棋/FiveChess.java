
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class FiveChess extends JFrame implements ActionListener{
 //使界面显示在中间
 private Toolkit kit=Toolkit.getDefaultToolkit();
 private Dimension screen=kit.getScreenSize();
 private int screenHeight=screen.height;
 private int screenWidth=screen.width;
 
 public static boolean isComputer=true;
 public static boolean checkComputer=true;
 private int width=650,height=500; //x、y  
 private  static final long serialVersionUID=218976543251L;
 
 private MainPanel mp;
 private ChessModel cm;
 
 public FiveChess(){
  this.setTitle("欢迎使用五子棋游戏-人机对弈");
  this.setSize(width, height);
  cm=new ChessModel();
  mp=new MainPanel(cm);
  this.add(mp,"Center");
  this.setResizable(false);
  JMenuBar menuBar=new JMenuBar();
  this.setJMenuBar(menuBar);
  JMenu gameMenu=new JMenu("游戏");
  menuBar.add(gameMenu);
  JMenuItem reItem=new JMenuItem("重新开始");
  reItem.addActionListener(this);
  JMenuItem exitItem=new JMenuItem("退出");
  exitItem.addActionListener(this);
  gameMenu.add(reItem);
  gameMenu.add(exitItem);
  JMenu helpMenu=new JMenu("帮助");
  JMenuItem helpItem=new JMenuItem("关于");
  helpItem.addActionListener(this);
  helpMenu.add(helpItem);
  menuBar.add(helpMenu);
  //改变外观
  try{
   UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
   SwingUtilities.updateComponentTreeUI(this);
  }
  catch(Exception e){
   e.printStackTrace();
  }
  this.setLocation(screenWidth/4, screenHeight/4);
 }
 
 public void actionPerformed(ActionEvent e){
        String arg=e.getActionCommand();
        if(arg.equals("重新开始")){
            restart();
        }
        if(arg.equals("关于"))
            JOptionPane.showMessageDialog(this, "五子棋游戏-人机对弈,设计者：丁毅", "关于", 0);
        if(arg.equals("退出"))
            System.exit(0);
    }
 
 public void restart(){
            cm = new ChessModel();
            ChessSize(cm.getWidth(),cm.getHeight()); 
    }
 
 public void ChessSize(int w,int h){
        setSize(w * 20+50 , h * 20+100);
        if(!FiveChess.checkComputer) {
            FiveChess.isComputer=false;
        } else {
            FiveChess.isComputer=true;
        }
        mp.setModel(cm);
        mp.repaint();
    }
 
 public static void main(String[] args){
  FiveChess fiveCh=new FiveChess();
  fiveCh.setVisible(true);
  fiveCh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}