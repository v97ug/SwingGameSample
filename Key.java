import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by takeyuki on 16/08/19.
 */
public class Key implements KeyListener{
    static boolean up = false;
    static boolean down = false;
    static boolean right = false;
    static boolean left = false;
    static boolean enter = false;

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            up = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            down = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            left = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            right = true;
        }

        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
            enter = true;
        }
    }
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            up = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            down = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            left = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            right = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_ENTER){
            enter = false;
        }
    }
    public void keyTyped(KeyEvent e) {
    }
}
