import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;

public class ENEFT extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4,t5;
    JLabel l1,l2,l3,l4,l5,l6;
    JButton b1,b2;
    String who,accno;
    ENEFT(String who,String accno)
    {
        this.accno=accno;
        this.who=who;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(60, 40, 100, 100);
        add(l14);
        l1=new JLabel("Enter Beneficiary Name");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l2=new JLabel("Enter Beneficiry Account Number");
        l2.setFont(new Font("System", Font.BOLD, 16));
        l3=new JLabel("Enter Beneficiry Phone Number");
        l3.setFont(new Font("System", Font.BOLD, 16));
        l4=new JLabel("Enter Beneficiry Email id");
        l4.setFont(new Font("System", Font.BOLD, 16));
        l5=new JLabel("Amount");
        l5.setFont(new Font("System", Font.BOLD, 16));
        l6=new JLabel(" NEFT ");
        l6.setFont(new Font("System", Font.BOLD, 30));
        t1=new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 18));
        t2=new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 18));
        t3=new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 18));
        t4=new JTextField();
        t4.setFont(new Font("Raleway", Font.BOLD, 18));
        t5=new JTextField();
        t5.setFont(new Font("Raleway", Font.BOLD, 18));
        b1=new JButton("SEND");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b2=new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        setLayout(null);
        l6.setBounds(200,80,350,40);
        add(l6);
        l1.setBounds(50,200,500,30);
        add(l1);
        t1.setBounds(50,250,500,30);
        add(t1);
        l2.setBounds(50,300,500,30);
        add(l2);
        t2.setBounds(50,350,500,30);
        add(t2);
        l3.setBounds(50,400,500,30);
        add(l3);
        t3.setBounds(50,450,500,30);
        add(t3);
        l4.setBounds(50,500,500,30);
        add(l4);
        t4.setBounds(50,550,500,30);
        add(t4);
        l5.setBounds(50,600,500,30);
        add(l5);
        t5.setBounds(50,650,500,30);
        add(t5);
        b1.setBounds(500,700,100,30);
        add(b1);
        b2.setBounds(500,750,100,30);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setSize(720,850);
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
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                String name ="\""+ t1.getText()+"\"";
                String Accno = t2.getText();
                String phno = t3.getText();
                String Emailid = t4.getText();
                String amount = t5.getText();
                int d=Integer.parseInt(amount);
                int a=Integer.parseInt(amount);
                if (t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("") || t4.getText().equals("") || t5.getText().equals("")||a<1) {
                    JOptionPane.showMessageDialog(null, "Please Fill all the requirments validly");
                    new Transactions(accno).setVisible(true);
                    setVisible(false);
                } else {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = null;
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
                    Statement s = conn.createStatement();
                    String s8 = "select * from customer where accno=" + Accno + "";
                    int b, c, g, e, f, p;
                    b = c = g = e = f = p = 0;
                    ResultSet rs = s.executeQuery(s8);
                    while (rs.next()) {
                        if (name.equals(rs.getString("name"))) {
                            p = 1;
                            b = rs.getInt("balance");
                        }
                    }
                    if (p == 1) {
                        String s9 = "select * from customer where accno=" + accno + "";
                        ResultSet rs1 = s.executeQuery(s9);
                        while (rs1.next()) {
                            c = rs1.getInt("balance");
                        }
                        if ((c-d)>20) {
                            c = c - d;
                            s8 = "UPDATE customer SET balance=" + c + " where accno="+accno+"";
                            s.execute(s8);
                            b = b + d;
                            s8 = "UPDATE customer SET balance=" + b + " where accno="+Accno+"";
                            s.execute(s8);
                            JOptionPane.showMessageDialog(null, "Rs. " + amount + " Deposited Successfully");
                            new Transactions(accno).setVisible(true);
                            setVisible(false);
                        } else {
                            JOptionPane.showMessageDialog(null, "Insufficient Balance");
                            new Transactions(accno).setVisible(true);
                            setVisible(false);
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Account not found");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Please Fill in a valid format");
                setVisible(false);
                new Etransaction(who,accno).setVisible(true);
            }
        }
        else if(ae.getSource()==b2)
            new Etransaction(who,accno).setVisible(true);
        setVisible(false);
    }


    public static void main(String[] args) {
        new NEFT("1018182007");
    }
}
