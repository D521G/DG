1.����
package Calc;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * 
 * ����������
 * 
 */
public class CalcFrame extends JFrame {
 JButton[] buttons = new JButton[16];// 16����ť

 StringBuffer sb = null;//

 JTextField text1 = null;// �����������ʾ��

 String no1 = null;

 String sign = null;// ��ʾ+-*/����

 String[] s = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-",
   "*", "/", "=", "C" };// ����ϵ��ַ�

 public CalcFrame() {
  setTitle("������");
  setResizable(false);
  setBounds(200, 200, 300, 350);
  setLayout(null);

  sb = new StringBuffer();
  text1 = new JTextField();
  text1.setBounds(10, 10, 250, 30);// ����λ��
  text1.setFont(new Font("Arial", Font.PLAIN, 20));// ��������
  text1.setForeground(Color.RED);// ������ɫ
  add(text1);
  for (int i = 0; i < s.length; i++) {

   buttons[i] = new JButton(s[i]);
   buttons[i].setFont(new Font("Serif", Font.BOLD, 18));
   add(buttons[i]);
  }// ��������ϵİ�ť.

  buttons[0].setBounds(10, 50, 50, 40);
  buttons[0].addActionListener(new ActionListener() {

   public void actionPerformed(ActionEvent e) {
    sb.append(0);
    text1.setText(sb.toString());
   }

  });
  buttons[1].setBounds(70, 50, 50, 40);
  buttons[1].addActionListener(new ActionListener() {

   public void actionPerformed(ActionEvent e) {
    sb.append(1);
    text1.setText(sb.toString());
   }

  });
  buttons[2].setBounds(130, 50, 50, 40);
  buttons[2].addActionListener(new ActionListener() {

   public void actionPerformed(ActionEvent e) {
    sb.append(2);
    text1.setText(sb.toString());
   }

  });
  buttons[3].setBounds(190, 50, 50, 40);
  buttons[3].addActionListener(new ActionListener() {

   public void actionPerformed(ActionEvent e) {
    sb.append(3);
    text1.setText(sb.toString());
   }

  });
  buttons[4].setBounds(10, 100, 50, 40);
  buttons[4].addActionListener(new ActionListener() {

   public void actionPerformed(ActionEvent e) {
    sb.append(4);
    text1.setText(sb.toString());
   }

  });
  buttons[5].setBounds(70, 100, 50, 40);
  buttons[5].addActionListener(new ActionListener() {

   public void actionPerformed(ActionEvent e) {
    sb.append(5);
    text1.setText(sb.toString());
   }

  });
  buttons[6].setBounds(130, 100, 50, 40);
  buttons[6].addActionListener(new ActionListener() {

   public void actionPerformed(ActionEvent e) {
    sb.append(6);
    text1.setText(sb.toString());
   }

  });
  buttons[7].setBounds(190, 100, 50, 40);
  buttons[7].addActionListener(new ActionListener() {

   public void actionPerformed(ActionEvent e) {
    sb.append(7);
    text1.setText(sb.toString());
   }

  });
  buttons[8].setBounds(10, 150, 50, 40);
  buttons[8].addActionListener(new ActionListener() {

   public void actionPerformed(ActionEvent e) {
    sb.append(8);
    text1.setText(sb.toString());
   }

  });
  buttons[9].setBounds(70, 150, 50, 40);
  buttons[9].addActionListener(new ActionListener() {

   public void actionPerformed(ActionEvent e) {
    sb.append(9);
    text1.setText(sb.toString());
   }

  });
  buttons[10].setBounds(130, 150, 50, 40);
  buttons[10].addActionListener(new ActionListener() {

   public void actionPerformed(ActionEvent e) {
    sign = "+";
    no1 = text1.getText();
    sb.delete(0, sb.capacity());

   }
  });
  buttons[11].setBounds(190, 150, 50, 40);
  buttons[11].addActionListener(new ActionListener() {

   public void actionPerformed(ActionEvent e) {
    sign = "-";
    no1 = text1.getText();
    sb.delete(0, sb.capacity());

   }
  });
  buttons[12].setBounds(10, 200, 50, 40);
  buttons[12].addActionListener(new ActionListener() {

   public void actionPerformed(ActionEvent e) {
    sign = "*";
    no1 = text1.getText();
    sb.delete(0, sb.capacity());

   }
  });
  buttons[13].setBounds(70, 200, 50, 40);
  buttons[13].addActionListener(new ActionListener() {

   public void actionPerformed(ActionEvent e) {
    sign = "/";
    no1 = text1.getText();
    sb.delete(0, sb.capacity());

   }
  });
  buttons[14].setForeground(Color.RED);
  buttons[14].setBounds(130, 200, 50, 40);
  buttons[14].addActionListener(new ActionListener() {

   public void actionPerformed(ActionEvent e) {
    int sum = 0;//���ս��
    if (sign.equals("+")) {
     int no2 = Integer.parseInt(no1);//ȡ��ǰһ����

     int no3 = Integer.parseInt(text1.getText());//ȡ�����ڵ���

     sum = no2 + no3;//�ۼ�

     text1.setText(String.valueOf(sum));

    }
    if (sign.equals("-")) {
     int no2 = Integer.parseInt(no1);

     int no3 = Integer.parseInt(text1.getText());

     sum = no2 - no3;

     text1.setText(String.valueOf(sum));

    }
    if (sign.equals("*")) {
     int no2 = Integer.parseInt(no1);

     int no3 = Integer.parseInt(text1.getText());

     sum = no2 * no3;

     text1.setText(String.valueOf(sum));

    }

    if (sign.equals("/")) {
     int no2 = Integer.parseInt(no1);

     int no3 = Integer.parseInt(text1.getText());

     sum = no2 / no3;

     text1.setText(String.valueOf(sum));

    }

   }

  });
  buttons[15].setBounds(190, 200, 50, 40);
  buttons[15].addActionListener(new ActionListener() {

   public void actionPerformed(ActionEvent e) {
    sb.delete(0, sb.capacity());//���sb������
    text1.setText("");//���������Ϊ��
   }
  });

  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//��Ӧ�رմ���
  setVisible(true);//��ʾ����
 }
}

2.��������
package Calc;

public class CalcTest {

 public static void main(String[] args) {
  CalcFrame f = new CalcFrame();

 }

}