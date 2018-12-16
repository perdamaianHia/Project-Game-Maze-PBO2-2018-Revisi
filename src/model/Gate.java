package model;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author 175314109 AND 175314115
 */
public class Gate extends Sel {

    public Gate(int x, int y) {
        super(x, y);

        URL loc = this.getClass().getResource("Gate.png");
        ImageIcon g = new ImageIcon(loc);
        Image image = g.getImage();
        this.setImage(image);
    }
}
