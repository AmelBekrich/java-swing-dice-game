package ba.smoki;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        initComponents();
    }
    public MainFrame(String title) {
        initComponents();
    }

    void initComponents() {
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700,400);
    }
}
