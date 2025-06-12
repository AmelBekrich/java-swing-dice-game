package ba.smoki.dice;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class LeftFaceFour extends DiceFaces {
    public LeftFaceFour() {
        this.setLayout(null);
        addDiceFace("/face4.png", 0, 0, "Image l4 not found");
    }
}
