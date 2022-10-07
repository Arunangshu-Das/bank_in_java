import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Pin extends JFrame implements ActionListener {
    JPasswordField tf1,tf2,tf3;
    JLabel l1,l2,l3,l4;
    JButton b1,b2;
    String accno;
    Pin(String accno)
    {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(120, 30, 100, 100);
        add(l14);
        this.accno=accno;
        l14.setForeground(Color.BLACK);
        l14.setFont(new Font("System",Font.BOLD,16));
        l1=new JLabel("Enter Current Pin");
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setForeground(Color.BLACK);
        l2 = new JLabel("New PIN:");
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setForeground(Color.BLACK);

        l3 = new JLabel("Re-Enter New PIN:");
        l3.setFont(new Font("System", Font.BOLD, 16));
        l3.setForeground(Color.BLACK);

        l4 = new JLabel("Change your pin");
        l4.setFont(new Font("System", Font.BOLD, 16));
        l4.setForeground(Color.BLACK);

        tf1 = new JPasswordField();
        tf1.setFont(new Font("Raleway", Font.BOLD, 25));

        tf2 = new JPasswordField();
        tf2.setFont(new Font("Raleway", Font.BOLD, 25));

        tf3 = new JPasswordField();
        tf3.setFont(new Font("Raleway", Font.BOLD, 25));

        b1=new JButton("Change");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b2=new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(null);
        l4.setBounds(250,50,200,40);
        add(l4);
        l1.setBounds(80,120,300,40);
        add(l1);
        tf1.setBounds(80,170,300,40);
        add(tf1);
        l2.setBounds(80,220,300,40);
        add(l2);
        tf2.setBounds(80,270,300,40);
        add(tf2);
        l3.setBounds(80,320,300,40);
        add(l3);
        tf3.setBounds(80,370,300,40);
        add(tf3);
        b1.setBounds(400,420,100,40);
        add(b1);
        b2.setBounds(400,480,100,40);
        add(b2);
        setSize(700,650);
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
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1) {
            try {
                String cpin = tf1.getText();
                String npin = tf2.getText();
                String rpin = tf3.getText();
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = null;
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
                Statement s = conn.createStatement();
                String s6="select pin from customer where accno="+accno+"";
                ResultSet rs = s.executeQuery(s6);
                while (rs.next()){
                    if(cpin.equals(rs.getString("pin"))) {

                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Incorrect PIN");
                        return;
                    }
                }
                if (!npin.equals(rpin)) {
                    JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                    return;
                }
                if (tf2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                }
                if (tf3.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                }

                String s8="UPDATE customer SET pin="+npin+" where  accno="+accno+"";
                s.execute(s8);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transactions(accno).setVisible(true);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
     else if (ae.getSource() == b2) {
        new Transactions(accno).setVisible(true);
        setVisible(false);
    }
}
    public static void main(String[] args) {
        new Pin("1111");
    }
}
