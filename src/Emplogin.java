import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Emplogin  extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2,b3;
    Emplogin()
    {
        setFont(new Font("system",Font.BOLD,22));
        Font f=getFont();
        FontMetrics fm=getFontMetrics(f);
        int x=fm.stringWidth("Employee Login");
        int y=fm.stringWidth(" ");
        int z=getWidth()-x;
        int w=z/y;
        String pad="";
        pad=String.format("%"+w+"s",pad);
        setTitle(pad+pad+pad+"Employee login");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l11=new JLabel(i3);
        l11.setBounds(90,10,100,100);
        add(l11);

        l1=new JLabel("Welcome to Bank");
        l1.setFont(new Font("Arial",Font.BOLD,38));
        l1.setBounds(260,46,450,40);
        add(l1);
        l2=new JLabel("ID Number:");
        l2.setFont(new Font("Raleway",Font.BOLD,28));
        l2.setBounds(200,150,375,30);
        add(l2);
        tf1=new JTextField(15);
        tf1.setFont(new Font("Arial",Font.BOLD,14));
        tf1.setBounds(380,150,230,30);
        add(tf1);
        l3=new JLabel("PIN:");
        l3.setFont(new Font("Arial",Font.BOLD,28));
        l3.setBounds(300,220,375,30);
        add(l3);
        pf2=new JPasswordField(15);
        pf2.setFont(new Font("Arial", Font.BOLD, 14));
        pf2.setBounds(380,220,230,30);
        add(pf2);
        setLayout(null);
        b1=new JButton("LOG IN");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Arial",Font.BOLD,14));
        b1.setBounds(200,300,200,30);
        add(b1);
        b2=new JButton("CLEAR");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Arial",Font.BOLD,14));
        b2.setBounds(430,300,200,30);
        add(b2);
        b3=new JButton("Cancel");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("Arial",Font.BOLD,14));
        b3.setBounds(430,350,200,30);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        getContentPane().setBackground(Color.WHITE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(800,500);
        setLocation(550,200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource()==b1){
                String cardno  = tf1.getText();
                String pin  =pf2.getText();
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = null;
                String q="";
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
                Statement s = conn.createStatement();
                int p=Integer.parseInt(cardno);
                System.out.println(p);
                String s8="select pin from employee where eid="+cardno+"";
                ResultSet rs = s.executeQuery(s8);
                while (rs.next()){
                   q=rs.getString("pin");
                }
                if(q.equals(pin))
                {
                    new Empfront(cardno).setVisible(true);
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                    return;
                }
            }else if(ae.getSource()==b2){
                tf1.setText("");
                pf2.setText("");
            }else if(ae.getSource()==b3){
                setVisible(false);
                new Login().setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Emplogin();
    }
}
