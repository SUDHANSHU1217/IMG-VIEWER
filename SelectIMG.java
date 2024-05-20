package jbv;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectIMG extends JFrame {
    private JTextField field;
    private JPanel panel1;
    private JButton button;
    private JLabel ImageLable;

    public SelectIMG() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=field.getText();
                int id=Integer.parseInt(str);
                ImageIcon icon =Helper.getImageIconById(id,ConnectionProvider.getConnection());
                if(icon == null){
                    JOptionPane.showMessageDialog(null,"no image found");
                }else {
                    ImageLable.setIcon(icon);
                }
            }
        });
    }

    public static void main(String[] args) {
        SelectIMG f=new SelectIMG();
        f.setContentPane(f.panel1);
        f.setTitle("IMG");
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
