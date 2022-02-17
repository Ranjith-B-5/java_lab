import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyCalc extends JFrame implements ActionListener{
 JLabel label;
 JTextField t1;
 JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bAdd,bSub,bMul,bDiv,bRes,bEql;
 String s0,s1,s2;
 public MyCalc()
 {
 s0 = s1 = s2 = "";
 label = new JLabel("Result");
 t1 = new JTextField(10);
 b1 = new JButton("1");
 b2 = new JButton("2");
 b3 = new JButton("3");
 b4 = new JButton("4");
 b5 = new JButton("5");
 b6 = new JButton("6");
 b7 = new JButton("7");
 b8 = new JButton("8");
 b9 = new JButton("9");
 b0 = new JButton("0");
 bAdd = new JButton("+");
 bSub = new JButton("-");
 bMul = new JButton("*");
 bDiv = new JButton("/");
 bRes = new JButton("C");
 bEql = new JButton("=");
 add(label);add(t1);
 add(bAdd);add(b1);add(b2);add(b3);
 add(bSub);add(b4);add(b5);add(b6);
 add(bMul);add(b7);add(b8);add(b9);
 add(bDiv);add(bRes);add(b0);add(bEql);
 setSize(200,220);
 setTitle("Simple Calculator");
 setLayout(new FlowLayout());
 setVisible(true);
 setLocation(200,200);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 bAdd.addActionListener(this);
 bSub.addActionListener(this);
 bMul.addActionListener(this);
 bDiv.addActionListener(this);
 bRes.addActionListener(this);
 bEql.addActionListener(this);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
 b5.addActionListener(this);
 b6.addActionListener(this);
 b7.addActionListener(this);
 b8.addActionListener(this);
 b9.addActionListener(this);
 b0.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae) {
 String s = ae.getActionCommand();
 if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
 if (!s1.equals(""))
 s2 = s2 + s;
 else
 s0 = s0 + s;
 t1.setText(s0 + s1 + s2);
 }
  else if (s.charAt(0) == 'C') {
 s0 = s1 = s2 = "";
 t1.setText(s0 + s1 + s2);
 }
 else if (s.charAt(0) == '=') {
 double te;
 if (s1.equals("+"))
 te = (Double.parseDouble(s0) + Double.parseDouble(s2));
 else if (s1.equals("-"))
 te = (Double.parseDouble(s0) - Double.parseDouble(s2));
 else if (s1.equals("/"))
 te = (Double.parseDouble(s0) / Double.parseDouble(s2));
 else
 te = (Double.parseDouble(s0) * Double.parseDouble(s2));
 t1.setText(s0 + s1 + s2 + "=" + te);
 s0 = Double.toString(te);
 s1 = s2 = "";
 }
 else {
 if (s1.equals("") || s2.equals(""))
 s1 = s;
 else {
 double te;
 if (s1.equals("+"))
 te = (Double.parseDouble(s0) + Double.parseDouble(s2));
 else if (s1.equals("-"))
 te = (Double.parseDouble(s0) - Double.parseDouble(s2));
 else if (s1.equals("/"))
 te = (Double.parseDouble(s0) / Double.parseDouble(s2));
 else
 te = (Double.parseDouble(s0) * Double.parseDouble(s2));
 s0 = Double.toString(te);
 s1 = s;
 s2 = "";
 }
 t1.setText(s0 + s1 + s2);
 }
 }
 public static void main(String[] args) {
 MyCalc c = new MyCalc();
 }
}
