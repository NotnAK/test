package vnorenetypy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private JLabel label;
    public Window() {
        setTitle("Pocitadlo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 400);

        Container pane = getContentPane();
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

        label = new JLabel("pocet kliknuti");


        pane.add(label);
        JButton button = new JButton("click");
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE,Integer.MAX_VALUE));
        pane.add(button);
        pack();

        button.addActionListener(new ClickListener());



    }
    class ClickListener implements ActionListener{
        private int counter = 0;
        @Override
        public void actionPerformed(ActionEvent e) {
            counter++;
            label.setText("klik " + counter);
            pack();
        }
    }
}