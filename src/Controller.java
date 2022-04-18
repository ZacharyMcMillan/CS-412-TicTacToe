import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private View view = new View();
    private Model model = new Model();

    private JButton[] gridButtons = new JButton[9];

    Controller() {
        gridButtons = view.getGridButtons();
        for (int i = 0; i < view.getGridButtons().length; i++) {
            gridButtons[i].addActionListener(this);
            gridButtons[i].setActionCommand(""+(i + 1));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("1")) {
            gridButtons[(Integer.parseInt(actionCommand)) - 1].setText("X");
            System.out.println(1);
        }

        if (actionCommand.equals("2")) {
            gridButtons[(Integer.parseInt(actionCommand)) - 1].setText("O");
            System.out.println(2);
        }

        if (actionCommand.equals("3")) {
            gridButtons[(Integer.parseInt(actionCommand)) - 1].setText("X");
            System.out.println(3);
        }

        if (actionCommand.equals("4")) {
            gridButtons[(Integer.parseInt(actionCommand)) - 1].setText("O");
            System.out.println(4);
        }

        if (actionCommand.equals("5")) {
            gridButtons[(Integer.parseInt(actionCommand)) - 1].setText("X");
            System.out.println(5);
        }

        if (actionCommand.equals("6")) {
            gridButtons[(Integer.parseInt(actionCommand)) - 1].setText("O");
            System.out.println(6);
        }

        if (actionCommand.equals("7")) {
            gridButtons[(Integer.parseInt(actionCommand)) - 1].setText("X");
            System.out.println(7);
        }

        if (actionCommand.equals("8")) {
            gridButtons[(Integer.parseInt(actionCommand)) - 1].setText("O");
            System.out.println(8);
        }

        if (actionCommand.equals("9")) {
            gridButtons[(Integer.parseInt(actionCommand)) - 1].setText("X");
            System.out.println(9);
        }
    }
}
