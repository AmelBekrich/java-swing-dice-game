package ba.smoki.dice;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class RightFaceOne extends DiceFaces {
    public RightFaceOne() {
        this.setLayout(null);
        addDiceFace("/face1.png",0 ,0, "Image r1 not found");
    }
}
