package ba.smoki.dice;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class LeftFaceSix extends DiceFaces {
    public LeftFaceSix() {
        this.setLayout(null);
        addDiceFace("/face6.png", 0, 0, "Image l6 not found");
    }
}
