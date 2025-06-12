package ba.smoki.dice;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class RightFaceFour extends DiceFaces {
    public RightFaceFour() {
        this.setLayout(null);
        addDiceFace("/face4.png", 0, 0, "Image r4 not found");
    }
}
