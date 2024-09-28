package view;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaScore extends JFrame {
    private JLabel scoreLabel;

    public VentanaScore() {
        setTitle("Score");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        scoreLabel = new JLabel("Score: 0");
        add(scoreLabel);
    }

    public void updateScore(int score) {
        scoreLabel.setText("Score: " + score);
    }
}
