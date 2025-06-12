package ba.smoki.dice;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class RightFaceFive extends DiceFaces {
    public RightFaceFive() {
        this.setLayout(null);
        addDiceFace("/face5.png", 0, 0, "Image r5 not found");
    }
}
