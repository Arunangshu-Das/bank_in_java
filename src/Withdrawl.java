import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
public class Withdrawl extends JFrame implements ActionListener{
    JLabel l1,l2;
    JTextField t1,t2,t3;
    String accno,who;
    JButton b1,b2,b3;
    Withdrawl(String who,String accno)
    {
        this.accno=accno;
        this.who=who;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(60, 40, 100, 100);
        add(l14);
        l1=new JLabel("DEPOSITE");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("System",Font.BOLD,16));
        l1=new JLabel("Amount want to Withdrawl");
        l1.setFont(new Font("System",Font.BOLD,16));
        t1=new JTextField();
        t1.setFont(new Font("Raleway",Font.BOLD,22));
        b1=new JButton("Withdrawl");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b2=new JButton("BACK");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        setLayout(null);
        l1.setBounds(170,80,400,40);
        add(l1);
        t1.setBounds(100,150,400,40);
        add(t1);
        b1.setBounds(350,250,120,40);
        add(b1);
        b2.setBounds(350,300,120,40);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setSize(600,600);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        getContentPane().setBackground(Color.WHITE);
        setLocation(500,160);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae)
    {
        try {
            String amount = t1.getText();
            int q=Integer.parseInt(amount);
            if (ae.getSource() == b1) {
                if (t1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the valid Amount to you want to Deposit");
                } else {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = null;
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
                    Statement s = conn.createStatement();
                    String s8 = "select balance from customer where accno="+accno+"";
                    ResultSet rs = s.executeQuery(s8);
                    int p=0;
                    while(rs.next())
                    {
                        p=rs.getInt("balance");
                    }
                    if((p-q)<2000) {
                        JOptionPane.showMessageDialog(null,"Amount not permit");
                    }
                    else {
                        p = p - q;
                        s8 = "UPDATE customer SET balance=" + p + " where  accno=" + accno + "";
                        s.execute(s8);
                        JOptionPane.showMessageDialog(null, "Rs. " + amount + " Withdrawl Successfully");
                        new Etransaction(who, accno).setVisible(true);
                        setVisible(false);
                    }
                }
            } else if (ae.getSource() == b2) {
                setVisible(false);
                new Etransaction(who,accno).setVisible(true);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Withdrawl("1111","");
    }
}
