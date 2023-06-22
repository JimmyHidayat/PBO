package PBO.Sesi14.TugasSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Formulir extends JFrame implements ActionListener {
    private JButton button;
    private JTextField textField;
    private JTextField textField2;

    private int angka1 = 0;
    private int angka2 = 0;
    private int result = 0;

    public Formulir() {
        button = new JButton("Hasil");
        button.addActionListener(this);
        textField = new JTextField();
        textField2 = new JTextField();

        setTitle("Tentang Penjumlahan");
        setLayout(new GridLayout(3,1));
        setSize(200, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        add(textField);
        add(textField2);
        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!textField.getText().equals("") && !textField2.getText().equals("")) {
            angka1 = Integer.parseInt(textField.getText());
            angka2 = Integer.parseInt(textField2.getText());
            result = angka1 + angka2;
            JOptionPane.showMessageDialog(this, "Hasilnya adalah " + result);
        }
    }
}