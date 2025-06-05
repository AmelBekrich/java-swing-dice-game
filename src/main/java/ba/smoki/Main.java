package ba.smoki;

import ba.smoki.dice.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    private static JLabel currentLeftFace = null;
    private static JLabel currentRightFace = null;

    public static void main(String[] args) {
        MainFrame frame = new MainFrame("Dice Game");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);

        JButton rollDiceButton = new JButton("Click to roll the dice");
        rollDiceButton.setSize(new Dimension(200,60));
        rollDiceButton.setLocation(250,280);

        JLabel[] leftDiceFaces = {new LeftFaceOne(), new LeftFaceTwo(),
                new LeftFaceThree(), new LeftFaceFour(),
                new LeftFaceFive(), new LeftFaceSix()};
        for (JLabel face: leftDiceFaces) {
            face.setBounds(70, 40, 200, 200);
        }

        JLabel[] rightDiceFaces = {new RightFaceOne(), new RightFaceTwo(),
                new RightFaceThree(), new RightFaceFour(),
                new RightFaceFive(), new RightFaceSix()};
        for (JLabel face: rightDiceFaces) {
            face.setBounds(450,40,200,200);
        }

        Random random = new Random();
        rollDiceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (currentLeftFace != null) mainPanel.remove(currentLeftFace);
                if (currentRightFace != null) mainPanel.remove(currentRightFace);

                int randomLeft = random.nextInt(6);
                int randomRight = random.nextInt(6);

                currentLeftFace = leftDiceFaces[randomLeft];
                currentRightFace = rightDiceFaces[randomRight];

                mainPanel.add(currentLeftFace);
                mainPanel.add(currentRightFace);
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });

        mainPanel.add(rollDiceButton);

        frame.setContentPane(mainPanel);
        frame.setVisible(true);

    }
}