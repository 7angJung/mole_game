import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Main extends JFrame{
    int img_x=800, img_y=600;
    private JPanel panel;
    private JLabel background;
    private JButton button;
    public Main() {
        setTitle("Mole Game");
        setSize(1000,800);

        button = new JButton("");
        panel = new JPanel();
        background = new JLabel("");

        // 잔디 배경 설정
        ImageIcon grass = new ImageIcon("C:\\Users\\peter\\MoleGame\\src\\잔디.jpg");
        background.setIcon(grass);

        // 뿅망치 설정
        ImageIcon hammer = new ImageIcon("C:\\Users\\peter\\MoleGame\\src\\뿅망치.png");
        button.setIcon(hammer);

        button.setLocation(img_x,img_y);
        button.setSize(100,100);

        panel.setLayout(new BorderLayout());
        panel.add(button);
        panel.add(background);
        panel.requestFocus();
        panel.setFocusable(true);
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keycode = e.getKeyCode();
                switch(keycode) {
                    case KeyEvent.VK_UP: img_y-=10; break;
                    case KeyEvent.VK_DOWN: img_y+=10; break;
                    case KeyEvent.VK_LEFT: img_x-=10; break;
                    case KeyEvent.VK_RIGHT: img_x+=10; break;
                }
                button.setLocation(img_x,img_y);
            }
        });
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Main();
    }
}