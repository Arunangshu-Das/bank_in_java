import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
public class EBalanceEquiry extends JFrame implements ActionListener{
    JLabel l1;
    JButton b1;
    String accno,who;
    EBalanceEquiry(String who,String accno)
    {
        this.accno=accno;
        this.who=who;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(120, 40, 100, 100);
        add(l14);
        l1=new JLabel();
        l14.setForeground(Color.BLACK);
        l14.setFont(new Font("System",Font.BOLD,16));

        b1=new JButton("Back");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        setLayout(null);
        l1.setBounds(250,80,200,40);
        add(l1);
        b1.setBounds(390,200,100,40);
        add(b1);
        b1.addActionListener(this);
        int Balance=0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
            Statement s = conn.createStatement();
            String s6 = "select balance from customer where accno=" + accno + "";
            ResultSet rs = s.executeQuery(s6);
            while (rs.next()) {
                int a=rs.getInt("balance");
                Balance+=a;
                l1.setText("Current Balance is  " + Balance);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
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

    public void actionPerformed(ActionEvent e)
    {
        setVisible(false);
        new Etransaction(who,accno).setVisible(true);
    }

    public static void main(String[] args) {
        new EBalanceEquiry("","1111");
    }

}
