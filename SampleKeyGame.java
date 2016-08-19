import javax.swing.*;
import java.awt.*;

public class SampleKeyGame extends JFrame {
    public static void main(String[] args) {
        new SampleKeyGame();
    }

    SampleKeyGame() {
        setTitle("Sample Game!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);

        MyJPanel myJPanel = new MyJPanel();
        getContentPane().add(myJPanel);

        myJPanel.setBounds(0, 0, 800, 600);

        myJPanel.setFocusable(true);
        myJPanel.addKeyListener(new Key());
        myJPanel.game();
    }

    class MyJPanel extends JPanel {
        Graphics g;
        int scene = 0;
        int select = 0;
        boolean once = true; //一度目に実行するもの

        public void game() {
            Image img = createImage(800, 600);
            g = img.getGraphics();
            Graphics wg = getGraphics();


            while (true) {
                if (scene == 0) {
                    title();
                }
                if(scene == 1){
                    play();
                }
                if(scene == -1){
                    System.exit(0);
                }

                wg.drawImage(img, 0, 0, null);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void title() {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 800, 600);

            g.setColor(Color.lightGray);
            g.setFont(new Font("Arial", Font.BOLD, 12));

            if (select == 0) {
                g.drawString("→", 280, 425);
                g.drawString("START", 325, 425);
                g.drawString("EXIT", 325, 500);
            } else if (select == 1) {
                g.drawString("START", 325, 425);
                g.drawString("→", 280, 500);
                g.drawString("EXIT", 325, 500);
            }

            if (once) {
                if (!Key.enter) {
                    once = false;
                }
            } else {
                if (Key.up) {
                    select = 0;
                }
                if (Key.down) {
                    select = 1;
                }
                if ((select == 0) &&
                        (Key.enter)) {
                    scene = 1;
                    once = true;
                }
                if ((select == 1) &&
                        (Key.enter)) {
                    scene = -1;
                }
            }
        }

        Player player = new Player(0,0);

        public void play() {
            g.setColor(Color.WHITE);
            g.fillRect(0,0,800,600);
            player.move();
            player.draw(g);
        }
    }

}
