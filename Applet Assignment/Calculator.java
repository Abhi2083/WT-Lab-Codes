import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Calculator extends Applet implements ActionListener {

   TextField display;
   double num1, num2, result;
   int op;
   boolean op_selected, decimal;

   public void init() {
      setLayout(new BorderLayout());
      display = new TextField("0", 10);
      display.setEditable(false);
      add(display, BorderLayout.NORTH);

      Panel buttonPanel = new Panel();
      buttonPanel.setLayout(new GridLayout(4, 4, 4, 4));

      String buttonLabels[] = {"7", "8", "9", "/",
                               "4", "5", "6", "*",
                               "1", "2", "3", "-",
                               "0", ".", "=", "+"};

      Button buttons[] = new Button[16];

      for (int i = 0; i < 16; i++) {
         buttons[i] = new Button(buttonLabels[i]);
         buttons[i].addActionListener(this);
         buttonPanel.add(buttons[i]);
      }

      add(buttonPanel, BorderLayout.CENTER);
   }

   public void actionPerformed(ActionEvent e) {
      String buttonLabel = e.getActionCommand();

      if (buttonLabel.equals(".")) {
         if (!decimal) {
            display.setText(display.getText() + ".");
            decimal = true;
         }
      } else if (buttonLabel.equals("+")) {
         num1 = Double.parseDouble(display.getText());
         op = 1;
         op_selected = true;
         decimal = false;
      } else if (buttonLabel.equals("-")) {
         num1 = Double.parseDouble(display.getText());
         op = 2;
         op_selected = true;
         decimal = false;
      } else if (buttonLabel.equals("*")) {
         num1 = Double.parseDouble(display.getText());
         op = 3;
         op_selected = true;
         decimal = false;
      } else if (buttonLabel.equals("/")) {
         num1 = Double.parseDouble(display.getText());
         op = 4;
         op_selected = true;
         decimal = false;
      } else if (buttonLabel.equals("=")) {
         num2 = Double.parseDouble(display.getText());

         switch (op) {
            case 1:
               result = num1 + num2;
               break;
            case 2:
               result = num1 - num2;
               break;
            case 3:
               result = num1 * num2;
               break;
            case 4:
               result = num1 / num2;
               break;
         }

         display.setText(Double.toString(result));
         op_selected = false;
         decimal = false;
      } else {
         if (op_selected) {
            display.setText(buttonLabel);
            op_selected = false;
         } else {
            display.setText(display.getText() + buttonLabel);
         }
      }
   }
}

/*
 * <applet code="Calculator.class" width="300" height="250">
    </applet>
 */