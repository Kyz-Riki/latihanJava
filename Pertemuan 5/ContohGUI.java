import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContohGUI extends JFrame {
    
    JLabel lbl1 = new JLabel("String I"); 
    JLabel lbl2 = new JLabel("String II");
    JLabel lbl3 = new JLabel("Hasil");
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField(); 
    JTextField t3 = new JTextField();
    JButton bil = new JButton("PROSES"); 
    JButton b2 = new JButton("HAPUS");

    public ContohGUI(){
        setLayout(null); // Menggunakan layout null agar bisa mengatur posisi komponen secara manual
        
        add(lbl1); 
        add(lbl2); 
        add(lbl3);
        add(t1);
        add(t2);
        add(t3);
        add(bil);
        add(b2);

        setTitle("GUI Swing");
        setBounds(100, 100, 300, 300);
        
        lbl1.setBounds(15, 20, 80, 25);
        lbl2.setBounds(15, 55, 125, 25);
        lbl3.setBounds(15, 90, 125, 25);

        t1.setBounds(120, 20, 80, 25);
        t2.setBounds(120, 50, 110, 25); 
        t3.setBounds(120, 80, 150, 25);

        bil.setBounds(15, 190, 100, 25); 
        b2.setBounds(120, 190, 80, 25);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        bil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                kirimdata();}
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                hapusdata();}
        });
    }

    public void hapusdata(){
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }
    
    public void kirimdata(){
        // Di sini Anda bisa menulis kode untuk mengirim data sesuai kebutuhan
        String string1 = t1.getText();
        String string2 = t2.getText();
        // Misalnya, menggabungkan string1 dan string2 ke t3
        t3.setText(string1 + " " + string2);
    }

    public static void main(String[] args) { 
        ContohGUI demo = new ContohGUI();
        demo.setVisible(true);  
    }
}