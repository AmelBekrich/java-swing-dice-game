package ba.smoki.dice;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class LeftFaceThree extends DiceFaces {
    public LeftFaceThree() {
        this.setLayout(null);
        addDiceFace("/face3.png", 0, 0, "Image l3 not found");
    }
}
