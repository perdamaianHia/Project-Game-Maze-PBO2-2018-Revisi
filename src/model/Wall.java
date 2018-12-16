
package model;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author 175314109 AND 175314115
 */
public class Wall extends Sel{
        public Wall(int x, int y){
        super(x, y);
        URL loc = this.getClass().getResource("Wall.png");
        ImageIcon iia = new ImageIcon(loc);
        Image image = iia.getImage();
        this.setImage(image);
    }
}
