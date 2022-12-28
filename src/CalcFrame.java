import javax.swing.*;
import java.awt.*;

public class CalcFrame extends JFrame {

    CalcPanel panels;
    CalcFrame(){

        panels = new CalcPanel();

        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500, 610);

        this.getContentPane().setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.add(panels.resultPanel);
        this.add(panels.buttonPanel);
        this.setVisible(true);

    }
}
