package ba.smoki.dice;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class RightFaceThree extends JLabel {
    public RightFaceThree() {
        this.setLayout(null);
        addDiceFace("/face3.png",0,0);
    }

    void addDiceFace(String path, int x, int y) {
        URL imageUrl = getClass().getResource(path);
        if (imageUrl != null) {
            ImageIcon imageIcon = new ImageIcon(imageUrl);
            int newImageWidth = imageIcon.getIconWidth() / 3;
            int newImageHeight = imageIcon.getIconHeight() / 3;
            Image scaledImage = imageIcon.getImage().getScaledInstance(newImageWidth,
                    newImageHeight,
                    Image.SCALE_SMOOTH);
            ImageIcon newImage = new ImageIcon(scaledImage);
            JLabel imageLabel = new JLabel(newImage);
            imageLabel.setBounds(x,y,175,175);
            this.add(imageLabel);
        } else {
           System.err.println("Image r3 not found");
        }
    }
}
