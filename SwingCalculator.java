import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCalculator implements ActionListener{
    JFrame frame;
    JTextField textfield;
    JButton[] numberButton = new JButton[10];
    JButton[] functionButton= new JButton[5];
    JButton addButton, subButton, mulButton, divButton, equButton;
    JPanel panel;

    double num1=0, num2=0, result=0;
    char operator;

    SwingCalculator(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(50, 25, 200, 50);
        textfield.setEditable(false);
        
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equButton = new JButton("=");

        functionButton[0]= addButton;
        functionButton[1]= subButton;
        functionButton[2]= mulButton;
        functionButton[3]= divButton;
        functionButton[4]= equButton;

        for( int i=0; i<5; i++){
            numberButton[i]= new JButton(String.valueOf(i));
            numberButton[i].addActionListener(this);

        }
        panel = new JPanel();
        panel.setBounds(50, 100, 200, 200);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.add(numberButton[1]);
        panel.add(numberButton[2]);
        panel.add(numberButton[3]);
        panel.add(addButton);
        panel.add(numberButton[4]);
        panel.add(numberButton[5]);
        panel.add(numberButton[6]);
        panel.add(subButton);
        panel.add(numberButton[7]);
        panel.add(numberButton[8]);
        panel.add(numberButton[9]);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(numberButton[0]);
        panel.add(equButton);

        frame.add(panel);
        frame.add(textfield);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new SwingCalculator();

    }


@override
public void actionPerformed(ActionEvent e){
    if(e.getSource()==addButton){
        num1=Double.parseDouble(textfield.getText());
        operator='+';
        textfield.setText("");
    }
    if(e.getSource()==subButton){
        num1=Double.parseDouble(textfield.getText());
        operator='-';
        textfield.setText("");
    }
    if(e.getSource()==mulButton){
        num1=Double.parseDouble(textfield.getText());
        operator='*';
        textfield.setText("");
    }
    if(e.getSource()==divButton){
        num1=Double.parseDouble(textfield.getText());
        operator='/';
        textfield.setText("");
    }
    if(e.getSource()==equButton){
        num2=Double.parseDouble(textfield.getText());
        switch(operator){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                result=num1/num2;
                break;
        }
        textfield.setText(String.valueOf(result));
        num1=result;
       }
   }
}
