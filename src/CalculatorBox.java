import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author ruwandigeekiyanage on 2022-12-21.

 */
public class CalculatorBox extends JFrame {
JButton btnAdd, btnSubtract, btnDivide, btnMultiply, btnClear, btnDelete, btnDot, btnEquals;
JButton[] numBtn;
JTextField output;
String previous, current, operator;

    private class NumberBtnHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            JButton selectedBtn = (JButton) e.getSource();
            for(JButton btn : numBtn){
                if(selectedBtn == btn){
                   appendToOutput(btn.getText());
                    updateOutput();
                }
            }
        }
    }

    private class OperatorBtnHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton selectedBtn = (JButton) e.getSource();
            if(selectedBtn == btnAdd){
                selectOperator(btnAdd.getText());
            }else if (selectedBtn == btnDelete){
                selectOperator(btnDelete.getText());
            }else if (selectedBtn == btnDivide){
                selectOperator(btnDivide.getText());
            }else if (selectedBtn == btnMultiply){
                selectOperator((btnMultiply.getText()));
            }
            updateOutput();

        }
    }

    private class OtherBtnHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton selectedBtn = (JButton) e.getSource();
            if(selectedBtn == btnClear){
                clear();
            }else if(selectedBtn == btnDelete){
                delete();
            }else if(selectedBtn == btnEquals){
                calculate();
            }
            updateOutput();
        }
    }

CalculatorBox(){
    super("Box Calculator");

    JPanel mainPanel = new JPanel();

    //Create sub panels inside main panel
    JPanel row1 = new JPanel();
    JPanel row2 = new JPanel();
    JPanel row3 = new JPanel();
    JPanel row4 = new JPanel();
    JPanel row5 = new JPanel();

    //Initialize components

    output = new JTextField(16);
    btnAdd = new JButton("+");
    btnSubtract = new JButton("-");
    btnDivide = new JButton("÷");
    btnMultiply = new JButton("*");

    btnDot = new JButton(".");
    btnClear = new JButton("clear");
    btnDelete = new JButton("Delete");
    btnEquals = new JButton("=");

    //Initialize, style and add action listeners to number buttons
    numBtn = new JButton[11];
    numBtn[10] = btnDot;
    for(int count=0; count<numBtn.length-1; count++){
        numBtn[count] = new JButton(String.valueOf(count));
        numBtn[count].setFont(new Font("Monospaced", Font.BOLD, 22));

    }

    //Style other buttons
    btnClear.setFont(new Font("Monospaced", Font.BOLD, 22));
    btnDot.setFont(new Font("Monospaced", Font.BOLD, 22));
    btnDivide.setFont((new Font("Monospaced", Font.BOLD, 22)));
    btnDelete.setFont(new Font("Monospaced", Font.BOLD, 22));
    btnEquals.setFont(new Font("Monospaced", Font.BOLD,22));
    btnAdd.setFont(new Font("Monospaced", Font.BOLD, 22));
    btnMultiply.setFont(new Font("Monospaced", Font.BOLD,22));
    btnSubtract.setFont(new Font("Monospaced", Font.BOLD, 22));

    //Style the output display
    output.setMaximumSize(new Dimension(185, 40));
    output.setFont(new Font("Monospaced", Font.BOLD, 27));
    output.setEnabled(false);
    output.setDisabledTextColor(new Color(0, 10, 0));
    output.setMargin(new Insets(0,5,0,0));
    output.setText("0");

    //Set the layout of each row in the pane
    row1.setLayout(new BoxLayout(row1,BoxLayout.LINE_AXIS));
    row2.setLayout(new BoxLayout(row2,BoxLayout.LINE_AXIS));
    row3.setLayout(new BoxLayout(row3,BoxLayout.LINE_AXIS));
    row4.setLayout(new BoxLayout(row4, BoxLayout.LINE_AXIS));
    row5.setLayout(new BoxLayout(row5, BoxLayout.LINE_AXIS));

    //Add components to each of the row
    row1.add(Box.createHorizontalGlue());
    row1.add(btnClear);
    row1.add(btnDelete);

    row2.add(numBtn[7]); row2.add(numBtn[8]); row2.add(numBtn[9]);
    row2.add(btnMultiply);

    row3.add(numBtn[4]); row3.add(numBtn[5]); row3.add(numBtn[6]);
    row3.add(btnAdd);

    row4.add(numBtn[1]); row4.add(numBtn[2]); row4.add(numBtn[3]);
    row4.add(btnSubtract);

    row5.add(btnDot); row5.add(numBtn[0]); row5.add(btnEquals);
    row5.add(btnDivide);

    //Add all rows to main panel
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
    mainPanel.add(output);
    mainPanel.add(row1);
    mainPanel.add(row2);
    mainPanel.add(row3);
    mainPanel.add(row4);
    mainPanel.add(row5);

    this.add(mainPanel);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    this.setSize(300, 275);
    this.setResizable(false);

    }

    public void clear(){}
    public void delete(){}
    public void updateOutput(){}
    public void appendToOutput(String text){}
    public void selectOperator(String text){}
    public void calculate(){}
}
