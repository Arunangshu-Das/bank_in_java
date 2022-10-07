import  java.awt.*;
import java.awt.event.*;
import javax.accessibility.Accessible;
import javax.swing.*;
import java.util.*;
import java.sql.*;

public class Signup3 extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
    JRadioButton r1, r2, r3, r4;
    JButton b1, b2;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    String formno,who,a;

    Signup3(String who,String formno) {
        this.formno = formno;
        setFont(new Font("system", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z / y;
        String pad = "";
        pad = String.format("%" + w + "s", pad);
        setTitle(pad + "NEW ACCOUNT APPLICATION FORM: Page-3");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        add(l14);
        l1 = new JLabel("Page 3: Account Datails");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l2 = new JLabel("Account Type");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        l3 = new JLabel("Account Number");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l4 = new JLabel("XXXXXXXXXXXXXXXX");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway", Font.BOLD, 10));
        l6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        l6.setFont(new Font("Raleway", Font.BOLD, 14));
        l7 = new JLabel("PIN");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l8 = new JLabel("XXXX");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l9 = new JLabel("(4-Digit Password)");
        l9.setFont(new Font("Raleway", Font.BOLD, 10));
        l10 = new JLabel("Service Required");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l11 = new JLabel("Form Number");
        l11.setFont(new Font("Raleway", Font.BOLD, 10));
        l12 = new JLabel(formno);
        l12.setFont(new Font("Raleway", Font.BOLD, 12));
        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD, 18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        c1 = new JCheckBox("ATM CARD", true);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 18));
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 18));
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 18));
        c4 = new JCheckBox("Email Alerts", true);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 18));
        c5 = new JCheckBox("Cheque Book", true);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 18));
        c6 = new JCheckBox("E-Statement", true);
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 18));
        c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.", true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 10));
        r1 = new JRadioButton("Savings Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        ButtonGroup groupinput = new ButtonGroup();
        groupinput.add(r1);
        groupinput.add(r2);
        groupinput.add(r3);
        groupinput.add(r4);
        setLayout(null);
        l11.setBounds(700, 10, 80, 30);
        add(l11);
        l12.setBounds(800, 10, 40, 30);
        add(l12);
        l1.setBounds(280, 40, 400, 40);
        add(l1);
        l2.setBounds(100, 140, 200, 30);
        add(l2);
        r1.setBounds(100, 180, 200, 30);
        add(r1);
        r2.setBounds(350, 180, 200, 30);
        add(r2);
        r3.setBounds(100, 220, 200, 30);
        add(r3);
        r4.setBounds(350, 220, 260, 30);
        add(r4);
        l3.setBounds(100, 300, 200, 30);
        add(l3);
        l4.setBounds(330, 300, 250, 30);
        add(l4);
        l5.setBounds(100, 340, 200, 20);
        add(l5);
        l6.setBounds(330, 340, 500, 20);
        add(l6);
        l7.setBounds(100, 380, 200, 30);
        add(l7);
        l8.setBounds(330, 380, 200, 30);
        add(l8);
        l9.setBounds(100, 410, 200, 30);
        add(l9);
        l10.setBounds(100, 460, 200, 30);
        add(l10);
        c1.setBounds(100, 500, 200, 30);
        add(c1);
        c2.setBounds(350, 500, 200, 30);
        add(c2);
        c3.setBounds(100, 550, 200, 30);
        add(c3);
        c4.setBounds(350, 550, 200, 30);
        add(c4);
        c5.setBounds(100, 600, 200, 30);
        add(c5);
        c6.setBounds(350, 600, 200, 30);
        add(c6);
        c7.setBounds(100, 680, 600, 20);
        add(c7);
        b1.setBounds(250, 720, 100, 30);
        add(b1);
        b2.setBounds(420, 720, 100, 30);
        add(b2);
        getContentPane().setBackground(Color.WHITE);
        setSize(890, 850);
        setLocation(500, 120);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public void actionPerformed(ActionEvent ae) {
        if (c7.isSelected()) {
            String atype = "";
            if (r1.isSelected())
                atype = "\"" + "Savings Account" + "\"";
            else if (r2.isSelected())
                atype = "\"" + "Fixed Deposite Account" + "\"";
            else if (r3.isSelected())
                atype = "\"" + "Fixed Deposite Account" + "\"";
            else if (r4.isSelected())
                atype = "\"" + "Fixed Deposite Account" + "\"";
            System.out.println(atype);
            Random ran = new Random();
            long first3 = (ran.nextLong() % 9000L) + 1000L;
            String pin = "" + Math.abs(first3);
            String facility = "";
            if (c1.isSelected())
                facility += "\"" + "ATM Card" + "\"";
            if (c2.isSelected())
                facility += "\"" + "Internet Banking" + "\"";
            if (c3.isSelected())
                facility += "\"" + "Mobile Banking" + "\"";
            if (c4.isSelected())
                facility += "\"" + "Email Address" + "\"";
            if (c5.isSelected())
                facility += "\"" + "Cheque Book" + "\"";
            if (c6.isSelected())
                facility += "\"" + "E-Statement" + "\"";
            try {
                if (ae.getSource() == b1) {
                    if (atype.equals("") || facility.equals(""))
                        JOptionPane.showMessageDialog(null, "Fill all the required fields");
                    else {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = null;
                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
                        Statement s = conn.createStatement();
                        String s8 = "UPDATE customer SET acctype=" + atype + ",srequired=" + facility + ",pin="+pin+" where formno=" + formno + "";
                        s.execute(s8);
                        String q = "Select * from customer WHERE formno=" + formno + "";
                        Statement st1 = conn.createStatement();
                        ResultSet rs = st1.executeQuery(q);
                        int s4 = 0;
                        while (rs.next()) {
                            s4 = rs.getInt("accno");
                        }
                        s4 = s4 +2;
                        s8 = "UPDATE customer SET accno=" + s4 + " where formno=" + formno + "";
                        s.execute(s8);
                        if(c5.isSelected())
                        {
                            s8 = "UPDATE customer SET cbook='1' where formno=" + formno + "";
                            s.execute(s8);
                        }
                        JOptionPane.showMessageDialog(null, "Account Number: " + s4 + "\n Pin:" + pin);
                        String sq=Integer.toString(s4);
                        this.a=sq;
                        String u = "Select * from customer WHERE formno=" + formno + "";
                        ResultSet rs1 = st1.executeQuery(u);
                        String f="";
                        while (rs1.next()) {
                            f = rs1.getString("who");
                        }
                        u="self";
                        if(u.equals(f)) {
                            new Login().setVisible(true);
                        }
                        else
                        {
                          String s1=Integer.toString(s4);
                            new Deposit(who,s1).setVisible(true);
                        }
                        setVisible(false);
                    }
                } else if (ae.getSource() == b2) {
                    if(who.equals("self"))
                    new Login().setVisible(true);
                    else
                        new Deposit(who,a);
                    setVisible(false);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select term's and condition");
            new Login().setVisible(true);
            setVisible(false);
        }
    }


    public static void main(String[] args) {
        new Signup3("","2304");
    }
}












