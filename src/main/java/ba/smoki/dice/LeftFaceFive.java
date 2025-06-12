package ba.smoki.dice;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class LeftFaceFive extends DiceFaces {
    public LeftFaceFive() {
        this.setLayout(null);
        addDiceFace("/face5.png", 0, 0, "Image l5 not found");
    }
}
