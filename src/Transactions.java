import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Transactions extends JFrame implements ActionListener{
    JLabel l1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    String accno;
    Transactions(String cardno)
    {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(120, 40, 100, 100);
        add(l14);
        this.accno=cardno;
        l1=new JLabel("Please Select Your Transaction");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("System",Font.BOLD,16));
        b2=new JButton("NEFT");
        b2.setFont(new Font("Raleway",Font.BOLD,18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b4=new JButton("New Check Book request");
        b4.setFont(new Font("Raleway",Font.BOLD,18));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b5=new JButton("PIN Change");
        b5.setFont(new Font("Raleway",Font.BOLD,18));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b6=new JButton("Balance Enquiry");
        b6.setFont(new Font("Raleway",Font.BOLD,18));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b1=new JButton("Change Mobile no.");
        b1.setFont(new Font("Raleway",Font.BOLD,18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b3=new JButton("Change Email Address");
        b3.setFont(new Font("Raleway",Font.BOLD,18));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b7=new JButton("Log Out");
        b7.setFont(new Font("Raleway",Font.BOLD,18));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);

        setLayout(null);
        l1.setBounds(315,70,900,40);
        add(l1);
        b2.setBounds(50,200,250,35);
        add(b2);
        b4.setBounds(400,200,300,35);
        add(b4);
        b5.setBounds(50,300,250,35);
        add(b5);
        b6.setBounds(400,300,300,35);
        add(b6);
        b1.setBounds(50,400,250,35);
        add(b1);
        b3.setBounds(400,400,300,35);
        add(b3);
        b7.setBounds(400,500,300,35);
        add(b7);
        b2.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b1.addActionListener(this);
        b3.addActionListener(this);
        b7.addActionListener(this);

        setSize(750,650);
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
       if(ae.getSource()==b2)
        {
            setVisible(false);
            new NEFT(accno).setVisible(true);
        }
       else if(ae.getSource()==b1)
       {
           setVisible(false);
            new Cmno(accno).setVisible(true);
       }
       else if(ae.getSource()==b3)
       {
           setVisible(false);
            new Eadd(accno).setVisible(true);
       }
       else if(ae.getSource()==b4)
        {
            setVisible(false);
            new CBooj(accno).setVisible(true);
        }
        else if(ae.getSource()==b5)
        {
            setVisible(false);
            new Pin(accno).setVisible(true);
        }
        else if(ae.getSource()==b6)
        {
            setVisible(false);
           new BalanceEquiry(accno).setVisible(true);
        }
        else if(ae.getSource()==b7)
        {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Transactions("4000");
    }


}
