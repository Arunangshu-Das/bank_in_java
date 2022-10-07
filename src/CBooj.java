import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class CBooj extends JFrame implements ActionListener {
    JCheckBox c1;
    JLabel l1 ;
    JButton b1, b2;
    String accno;

    CBooj(String accno) {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(120, 30, 100, 100);
        add(l14);
        this.accno = accno;
        l14.setForeground(Color.BLACK);
        l14.setFont(new Font("System", Font.BOLD, 16));
        l1 = new JLabel("Check book 25 pages:");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setForeground(Color.BLACK);
        c1 = new JCheckBox("Continue with this", true);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 18));
        b1=new JButton("Continue");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b2=new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        setLayout(null);
        b1.addActionListener(this);
        b2.addActionListener(this);
        l1.setBounds(80,220,500,40);
        add(l1);
        c1.setBounds(80,270,300,40);
        add(c1);
        b1.setBounds(400,420,100,40);
        add(b1);
        b2.setBounds(400,480,100,40);
        add(b2);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(700,650);
        getContentPane().setBackground(Color.WHITE);
        setLocation(500,160);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1 && c1.isSelected()) {
            try {
                int p=0;
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = null;
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
                Statement s = conn.createStatement();
                String s8 = "select cbook from customer where accno=" + accno + "";
                ResultSet rs = s.executeQuery(s8);
                while (rs.next()) {
                 p=rs.getInt("cbook");
                }
                p=p+1;
                s8 = "UPDATE customer SET cbook="+p+" where accno="+accno+"";
                s.execute(s8);
                JOptionPane.showMessageDialog(null, "Check book requested approved");
            }
            catch (Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }
            finally {
                new Transactions(accno).setVisible(true);
                setVisible(false);
            }
        }
        else if(ae.getSource() == b2 || !c1.isSelected())
        {
            new Transactions(accno).setVisible(true);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new CBooj("1111");
    }
}