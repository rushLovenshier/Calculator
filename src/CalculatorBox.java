import javax.swing.*;
import java.awt.*;

/**
 * @author ruwandigeekiyanage on 2022-12-21.

 */
public class CalculatorBox extends JFrame {
JButton btnAdd, btnSubtract, btnDivide, btnMultiply, btnClear, btnDelete, btnDot, btnEquals;
JButton numBtn[];
JTextField output;
String previous, current, operator;

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
    btnDelete = new JButton("D");
    btnEquals = new JButton("=");


}
}
