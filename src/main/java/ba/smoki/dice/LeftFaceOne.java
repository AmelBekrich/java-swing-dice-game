package ba.smoki.dice;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class LeftFaceOne extends DiceFaces {
    public LeftFaceOne() {
        setLayout(null);
        addDiceFace("/face1.png",0,0, "Image l1 not found");
    }
}
