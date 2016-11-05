import java.awt.*;

/**
 * Created by takeyuki on 16/08/19.
 */
public class Player {
    private int x;
    private int y;

    Player(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void move(){
        if(Key.up){
            y -= 5;
        }
        if(Key.down){
            y += 5;
        }
        if(Key.left){
            x -= 5;
        }
        if(Key.right){
            x += 5;
        }
    }

    public void draw(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(x, y, 30, 30);
    }
}
