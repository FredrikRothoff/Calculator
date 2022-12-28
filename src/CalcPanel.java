import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CalcPanel extends JPanel implements ActionListener {

    JPanel resultPanel;
    JPanel buttonPanel;
    JLabel resultLabel;
    JButton btn;

    double firstNumber;
    double secondNumber;
    double result;
    char operator;
    char number;

   private ArrayList<JButton> buttonList;

    CalcPanel(){

        resultPanel = new JPanel();
        resultPanel.setBounds(0,0, 500,100);
        resultPanel.setBackground(Color.BLACK);

        buttonPanel = new JPanel();
        buttonPanel.setBounds(0,100,500,510);
        buttonPanel.setBackground(Color.BLACK);

        resultLabel = new JLabel();
        resultLabel.setPreferredSize(new Dimension(490,90));
        resultLabel.setBackground(Color.WHITE);
        resultLabel.setText("");
        resultLabel.setOpaque(true);
        resultLabel.setFont(new Font("Times new Roman", Font.BOLD, 72));
        resultPanel.add(resultLabel);

         buttonList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            btn = new JButton("" + i);
            btn.setPreferredSize(new Dimension(120, 90));
            btn.addActionListener(this);
            buttonPanel.add(btn);
            buttonList.add(btn);
            btn.setFont(new Font("Times new Roman", Font.PLAIN, 72));
        }
            buttonList.get(0).setText("AC");    buttonList.get(10).setText("6");
            buttonList.get(1).setText("C");     buttonList.get(11).setText("-");
            buttonList.get(2).setText("  ");    buttonList.get(12).setText("1");
            buttonList.get(3).setText("/");     buttonList.get(13).setText("2");
            buttonList.get(4).setText("7");     buttonList.get(14).setText("3");
            buttonList.get(5).setText("8");     buttonList.get(15).setText("+");
            buttonList.get(6).setText("9");     buttonList.get(16).setText("(-)");
            buttonList.get(7).setText("*");     buttonList.get(17).setText("0");
            buttonList.get(8).setText("4");     buttonList.get(18).setText(",");
            buttonList.get(9).setText("5");     buttonList.get(19).setText("=");
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (((JButton) e.getSource()).getText().equals("AC")) {
            resultLabel.setText("");
        }else if (((JButton) e.getSource()).getText().equals("C")){
            String text = resultLabel.getText();
            resultLabel.setText("");
            for (int j = 0; j < text.length() - 1; j++) {
                resultLabel.setText(resultLabel.getText() + text.charAt(j));
            }
        } else if (((JButton) e.getSource()).getText().equals("0")){
            resultLabel.setText(resultLabel.getText() + "0");
        }else if (((JButton) e.getSource()).getText().equals("1")){
            resultLabel.setText(resultLabel.getText() + "1");
        }else if (((JButton) e.getSource()).getText().equals("2")){
            resultLabel.setText(resultLabel.getText() + "2");
        }else if (((JButton) e.getSource()).getText().equals("3")){
            resultLabel.setText(resultLabel.getText() + "3");
        }else if (((JButton) e.getSource()).getText().equals("4")){
            resultLabel.setText(resultLabel.getText() + "4");
        }else if (((JButton) e.getSource()).getText().equals("5")){
            resultLabel.setText(resultLabel.getText() + "5");
        }else if (((JButton) e.getSource()).getText().equals("6")){
            resultLabel.setText(resultLabel.getText() + "6");
        }else if (((JButton) e.getSource()).getText().equals("7")){
            resultLabel.setText(resultLabel.getText() + "7");
        }else if (((JButton) e.getSource()).getText().equals("8")){
            resultLabel.setText(resultLabel.getText() + "8");
        }else if (((JButton) e.getSource()).getText().equals("9")){
            resultLabel.setText(resultLabel.getText() + "9");
        }else if (((JButton) e.getSource()).getText().equals(",")){
            resultLabel.setText(resultLabel.getText() + ".");
        }else if (((JButton) e.getSource()).getText().equals("+")){
            operator = '+';
            resultLabel.setText(resultLabel.getText() + operator);
        }else if (((JButton) e.getSource()).getText().equals("-")){
            operator = '-';
            resultLabel.setText(resultLabel.getText() + operator);
        }else if (((JButton) e.getSource()).getText().equals("/")){
            operator = '/';
            resultLabel.setText(resultLabel.getText() + operator);
        }else if (((JButton) e.getSource()).getText().equals("*")){
            operator = '*';
            resultLabel.setText(resultLabel.getText() + operator);
        }else if (((JButton) e.getSource()).getText().equals("(-)")){
            double minus = Double.parseDouble(resultLabel.getText());
            minus*= -1;
            resultLabel.setText(String.valueOf(minus));
        }
        else if (((JButton) e.getSource()).getText().equals("=")){
            String text = resultLabel.getText();
            int sepPos = text.lastIndexOf(operator);
            int second = text.indexOf(operator);
            firstNumber = Double.parseDouble(text.substring(0, sepPos));
            secondNumber = Double.parseDouble(text.substring(second + 1));

            switch(operator){
                case'+':
                    result = firstNumber + secondNumber;
                    break;
                case'-':
                    result = firstNumber - secondNumber;
                    break;
                case'*':
                    result = firstNumber * secondNumber;
                    break;
                case'/':
                    result = firstNumber / secondNumber;
                    break;
            }
            resultLabel.setText(String.valueOf(result));

        }

    }
}
