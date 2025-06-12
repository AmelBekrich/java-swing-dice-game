package ba.smoki.dice;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.sql.PreparedStatement;

public class RightFaceTwo extends DiceFaces {
    public RightFaceTwo() {
        this.setLayout(null);
        addDiceFace("/face2.png", 0, 0, "Image r2 not found");
    }
}
