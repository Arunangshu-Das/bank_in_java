import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
public class Signup extends JFrame implements ActionListener{
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16,l17,l18;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8,t9,t10;
    JRadioButton r1, r2, r3, r4, r5;
    JButton b1;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);
    String who="";
    Signup(String who) {
        setFont(new Font("system", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z / y;
        String pad = "";
        pad = String.format("%" + w + "s", pad);
        setTitle(pad + pad + "NEW ACCOUNT APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(20, 10, 100, 100);
        add(l11);
        this.who=who;
        l1 = new JLabel("APPLICATION FORM NO." + first);
        l1.setFont(new Font("Raleway", Font.BOLD, 38));
        l2 = new JLabel("page 1: Personal Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l3 = new JLabel("Name:");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        l4 = new JLabel("Father's  Name:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        l5 = new JLabel("Mother's  Name:");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));
        l17 = new JLabel("Guardian's  Name:");
        l17.setFont(new Font("Raleway", Font.BOLD, 20));
        l18 = new JLabel("Mobile No.:");
        l18.setFont(new Font("Raleway", Font.BOLD, 20));
        l6 = new JLabel("Date Of Birth:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        l7 = new JLabel("Gender:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        l8 = new JLabel("Email Address:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        l9 = new JLabel("Marital Status:");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        l10 = new JLabel("Address:");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));
        l11 = new JLabel("City:");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        l12 = new JLabel("Pin Code:");
        l12.setFont(new Font("Raleway", Font.BOLD, 20));
        l13 = new JLabel("State:");
        l13.setFont(new Font("Raleway", Font.BOLD, 20));
        l14 = new JLabel("Date: ");
        l14.setFont(new Font("Raleway", Font.BOLD, 20));
        l15 = new JLabel("Month:");
        l15.setFont(new Font("Raleway", Font.BOLD, 20));
        l16 = new JLabel("Year");
        l16.setFont(new Font("Raleway", Font.BOLD, 20));
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));
        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        t3 = new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 14));
        t4 = new JTextField();
        t4.setFont(new Font("Raleway", Font.BOLD, 14));
        t5 = new JTextField();
        t5.setFont(new Font("Raleway", Font.BOLD, 14));
        t6 = new JTextField();
        t6.setFont(new Font("Raleway", Font.BOLD, 14));
        t7 = new JTextField();
        t7.setFont(new Font("Raleway", Font.BOLD, 14));
        t8 = new JTextField();
        t8.setFont(new Font("Raleway", Font.BOLD, 14));
        t9 = new JTextField();
        t9.setFont(new Font("Raleway", Font.BOLD, 14));
        t10 = new JTextField();
        t10.setFont(new Font("Raleway", Font.BOLD, 14));
        b1 = new JButton("Next");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);
        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);
        r5 = new JRadioButton("Others");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(Color.WHITE);
        ButtonGroup groupsatatus = new ButtonGroup();
        groupsatatus.add(r3);
        groupsatatus.add(r4);
        groupsatatus.add(r5);
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 119));
        dateChooser.setBounds(137, 337, 200, 29);
        add(dateChooser);

        setLayout(null);
        l1.setBounds(140, 20, 600, 40);
        add(l1);
        l2.setBounds(290, 80, 600, 30);
        add(l2);
        l3.setBounds(100, 140, 100, 30);
        add(l3);
        t1.setBounds(300, 140, 400, 30);
        add(t1);
        l4.setBounds(100, 190, 200, 30);
        add(l4);
        t2.setBounds(300, 190, 400, 30);
        add(t2);
        l5.setBounds(100, 240, 200, 30);
        add(l5);
        t3.setBounds(300, 240, 400, 30);
        add(t3);
        l17.setBounds(100, 290, 200, 30);
        add(l17);
        t9.setBounds(300, 290, 400, 30);
        add(t9);
        l18.setBounds(100, 340, 200, 30);
        add(l18);
        t10.setBounds(300, 340, 400, 30);
        add(t10);
        l6.setBounds(100, 390, 400, 30);
        add(l6);
        dateChooser.setBounds(300, 390, 400, 30);
        l7.setBounds(100, 440, 200, 30);
        add(l7);
        r1.setBounds(300, 440, 60, 30);
        add(r1);
        r2.setBounds(450, 440, 90, 30);
        add(r2);
        l8.setBounds(100, 490, 200, 30);
        add(l8);
        t4.setBounds(300, 490, 400, 30);
        add(t4);
        l9.setBounds(100, 540, 200, 30);
        add(l9);
        r3.setBounds(300, 540, 100, 30);
        add(r3);
        r4.setBounds(450, 540, 100, 30);
        add(r4);
        r5.setBounds(635, 540, 100, 30);
        add(r5);
        l10.setBounds(100, 590, 200, 30);
        add(l10);
        t5.setBounds(300, 590, 400, 30);
        add(t5);
        l11.setBounds(100, 640, 200, 30);
        add(l11);
        t6.setBounds(300, 640, 400, 30);
        add(t6);
        l12.setBounds(100, 690, 200, 30);
        add(l12);
        t7.setBounds(300, 690, 400, 30);
        add(t7);
        l13.setBounds(100, 740, 200, 30);
        add(l13);
        t8.setBounds(300, 740, 200, 30);
        add(t8);
        b1.setBounds(620, 820, 80, 30);
        add(b1);
        b1.addActionListener(this);
        getContentPane().setBackground(Color.WHITE);
        setSize(1000, 950);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLocation(500, 60);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae)
    {
        String name="\""+t1.getText()+"\"";
        String fname="\""+t2.getText()+"\"";
        String mname="\""+t3.getText()+"\"";
        String gname="\""+t9.getText()+"\"";
        String phno="\""+t10.getText()+"\"";
        String dob = "";
        dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected())
            gender="\""+"Male"+"\"";
        else if(r2.isSelected())
            gender="\""+"Female"+"\"";
        String email="\""+t4.getText()+"\"";
        String marital=null;
        if(r3.isSelected())
            marital="\""+"Married"+"\"";
        else if(r4.isSelected())
            marital="\""+"Unmarried"+"\"";
        else if(r5.isSelected())
            marital="\""+"Others"+"\"";
        String address="\""+t5.getText()+"\"";
        String city="\""+t6.getText()+"\"";
        String pincode="\""+t7.getText()+"\"";
        String state="\""+t8.getText()+"\"";
        try{
            if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals("")||t5.getText().equals("")||t6.getText().equals("")||t7.getText().equals("")||t8.getText().equals("")||t9.getText().equals("")||t10.getText().equals("")||dob==""||gender==null||marital==null)
            {
                JOptionPane.showMessageDialog(null,"Fill all the required fields");
            }
            else
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=null;
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
                Statement s= conn.createStatement();
                String s8="INSERT INTO customer(name,fname,mname,gname,mno,dob,gender,eadd,ms,address,city,pincode,state,formno,religion,category,income,education,occupation,pan,aadhar,senior,existing,acctype,srequired,balance,accno,pin,cbook,who) VALUES ('"+name+"','"+fname+"','"+mname+"','"+gname+"','"+phno+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"','"+first+"',' ',' ',' ',' ',' ',' ',' ', ' ',' ',' ',' ',0,0,' ',0,'"+who+"')";
                s.execute(s8);
                new Signup2(who,first).setVisible(true);
                setVisible(false);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }



    }


    public static void main(String[] args) {
        new Signup("");
    }

}
