package ba.smoki.dice;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class RightFaceSix extends DiceFaces {
    public RightFaceSix() {
        this.setLayout(null);
        addDiceFace("/face6.png", 0, 0, "Image r6 not found");
    }
}
