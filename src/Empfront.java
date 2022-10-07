import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Empfront  extends JFrame implements ActionListener{
    JLabel l1, l2, l3;
    JTextField tf1;
    JButton b1, b2, b3,b4;
    String accno;
    Empfront(String accno) {
        setFont(new Font("system", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("Employee Login");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z / y;
        String pad = "";
        pad = String.format("%" + w + "s", pad);
        setTitle(pad + pad + pad + "Employee login");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(90, 10, 100, 100);
        add(l11);
        this.accno=accno;
        l1=new JLabel("Customer Account Number:");
        l1.setFont(new Font("Arial",Font.BOLD,38));
        l1.setBounds(100,150,580,30);
        add(l1);
        tf1=new JTextField(15);
        tf1.setFont(new Font("Arial",Font.BOLD,14));
        tf1.setBounds(680,150,300,30);
        add(tf1);
        setLayout(null);
        b1=new JButton("LOG IN");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Arial",Font.BOLD,14));
        b1.setBounds(850,300,200,30);
        add(b1);
        b2=new JButton("Change Your Pin");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Arial",Font.BOLD,14));
        b2.setBounds(500,300,200,30);
        add(b2);
        b3=new JButton("New Customer");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("Arial",Font.BOLD,14));
        b3.setBounds(150,300,200,30);
        add(b3);
        b4=new JButton("Log out");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setFont(new Font("Arial",Font.BOLD,14));
        b4.setBounds(850,350,200,30);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        getContentPane().setBackground(Color.WHITE);
        setSize(1200,800);
        setLocation(550,200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                String ss="",cardno = tf1.getText();
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = null;
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
                Statement s = conn.createStatement();
                String s8 = "select accno from customer where accno=" + cardno + "";
                ResultSet rs = s.executeQuery(s8);
                while (rs.next()) {
                    ss=rs.getString("accno");
                }
                if(ss.equals(cardno))
                {
                    setVisible(false);
                    new Etransaction(accno,cardno).setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Account number Number");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Incorrect Account number Number");
            }
        }
        else if(ae.getSource()==b2)
        {
            new Epin(accno).setVisible(true);
            setVisible(false);
        }
        else if(ae.getSource()==b3)
        {
            new Signup(accno).setVisible(true);
            setVisible(false);
        }
        else if(ae.getSource()==b4)
        {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new Empfront("1111");
    }
}
