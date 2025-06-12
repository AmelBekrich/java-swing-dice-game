package ba.smoki.dice;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class RightFaceThree extends DiceFaces {
    public RightFaceThree() {
        this.setLayout(null);
        addDiceFace("/face3.png",0,0, "Image r3 not found");
    }
}
