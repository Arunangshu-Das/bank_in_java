import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Signup2 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JRadioButton r1,r2,r3,r4;
    JButton b;
    JComboBox c1,c2,c3,c4,c5;
    JTextField t1,t2;
    String fn;
    String who="";
    Signup2(String who,String formno)
    {
        setFont(new Font("system", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM :Page 2");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z / y;
        String pad = "";
        pad = String.format("%" + w + "s", pad);
        setTitle(pad  + "NEW ACCOUNT APPLICATION FORM :Page 2");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(20, 10, 100, 100);
        add(l14);
        this.fn=formno;
        this.who=who;
        l1=new JLabel("Page 2: Additional Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l2=new JLabel("Religion:");
        l2.setFont(new Font("Raleway",Font.BOLD,18));
        l3=new JLabel("category:");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l4=new JLabel("Income:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l5=new JLabel("Educational");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l6=new JLabel("Qualification:");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l7=new JLabel("Occupation:");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l8=new JLabel("PAN Number:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l9=new JLabel("Aadhar Number:");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l10=new JLabel("Senior Citizen:");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l11=new JLabel("Existing Account");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l12=new JLabel("Form No.");
        l12.setFont(new Font("Raleway",Font.BOLD,12));
        l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,12));
System.out.println(formno);
        b=new JButton("Next");
        b.setFont(new Font("Raleway",Font.BOLD,14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);

        t1=new JTextField();
        t1.setFont(new Font("Raleway",Font.BOLD,14));
        t2=new JTextField();
        t2.setFont(new Font("Raleway",Font.BOLD,14));
        r1=new JRadioButton("YES");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(Color.WHITE);
        r2=new JRadioButton("NO");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(Color.WHITE);
        r3=new JRadioButton("YES");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(Color.WHITE);
        r4=new JRadioButton("NO");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(Color.WHITE);
        String religion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        c1 = new JComboBox(religion);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,14));
        String category[]={"General","SC","ST","OBC","Other"};
        c2=new JComboBox(category);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,14));
        String income[]={"<50,000","<1,00,000","<2,00,000","<3,50,000","<5,00,000","NUll"};
        c3=new JComboBox(income);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,14));
        String education[]={"Non-Graduate","Graduate","Post-Graduate","Doctorate","Other"};
        c4=new JComboBox(education);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,14));
        String occupation[]={"Salaried","Self-Employed","Business","Retired","Student","Others"};
        c5=new JComboBox(occupation);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,14));
        setLayout(null);

        ButtonGroup groupy=new ButtonGroup();
        groupy.add(r1);
        groupy.add(r2);
        ButtonGroup groupn=new ButtonGroup();
        groupn.add(r3);
        groupn.add(r4);


        l12.setBounds(700,10,60,30);
        add(l12);
        l13.setBounds(780,10,60,30);
        add(l13);
        l1.setBounds(280,30,600,40);
        add(l1);
        l2.setBounds(100,120,100,30);
        add(l2);
        c1.setBounds(350,120,320,30);
        add(c1);
        l3.setBounds(100,170,100,30);
        add(l3);
        c2.setBounds(350,170,320,30);
        add(c2);
        l4.setBounds(100,220,100,30);
        add(l4);
        c3.setBounds(350,220,320,30);
        add(c3);
        l5.setBounds(100,270,150,30);
        add(l5);
        c4.setBounds(350,270,320,30);
        add(c4);
        l6.setBounds(100,290,150,30);
        add(l6);
        l7.setBounds(100,340,150,30);
        add(l7);
        c5.setBounds(350,340,320,30);
        add(c5);
        l8.setBounds(100,390,150,30);
        add(l8);
        t1.setBounds(350,390,320,30);
        add(t1);
        l9.setBounds(100,440,150,30);
        add(l9);
        t2.setBounds(350,440,320,30);
        add(t2);
        l10.setBounds(100,490,150,30);
        add(l10);
        r1.setBounds(350,490,100,30);
        add(r1);
        r2.setBounds(460,490,100,30);
        add(r2);
        l11.setBounds(100,540,150,30);
        add(l11);
        r3.setBounds(350,540,100,30);
        add(r3);
        r4.setBounds(460,540,100,30);
        add(r4);
        b.setBounds(570,640,100,30);
        add(b);
        b.addActionListener(this);
        getContentPane().setBackground(Color.WHITE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(850, 800);
        setLocation(500, 60);
        setVisible(true);










    }
    public void actionPerformed(ActionEvent ae)
    {
        String religion="";
        religion="\""+(String) c1.getSelectedItem()+"\"";
        String catagory="";
               catagory="\""+(String) c2.getSelectedItem()+"\"";
        String income="";
               income="\""+(String) c3.getSelectedItem()+"\"";
        String education="";
                education="\""+(String) c4.getSelectedItem()+"\"";
        String occupation="";
               occupation="\""+(String) c5.getSelectedItem()+"\"";

        String pan="\""+t1.getText()+"\"";
        String aadhar="\""+t2.getText()+"\"";
        String scitizen="";
        if(r1.isSelected())
            scitizen="\""+"Yes"+"\"";
        else if(r2.isSelected())
            scitizen="\""+"No"+"\"";
        String eacc="";
        if(r3.isSelected())
            eacc="\""+"Yes"+"\"";
        else if(r4.isSelected())
            eacc="\""+"No"+"\"";

        try{
            if(t1.getText().equals("")||t2.getText().equals("")||scitizen==""||eacc==""||religion==""||catagory==""||income==""||education==""||occupation=="")
                JOptionPane.showMessageDialog(null,"Fill All The Require Field");
            else
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=null;
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
                Statement s= conn.createStatement();
                String s8="UPDATE customer  SET religion='"+religion+"',category='"+catagory+"',income='"+income+"',education='"+education+"',occupation='"+occupation+"',pan='"+pan+"',aadhar='"+aadhar+"',senior='"+scitizen+"',existing='"+eacc+"' WHERE formno='"+fn+"'";
                s.execute(s8);
               new Signup3(who,fn).setVisible(true);
                setVisible(false);
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup2("","").setVisible(true);
    }
}
