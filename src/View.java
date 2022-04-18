import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class View extends JPanel{
    private JFrame jFrame = new JFrame();
    private final GridLayout gridLayout = new GridLayout(3, 3);
    private final JPanel innerPanel = new JPanel();

    private final Color backgroundColor = new Color(225, 225, 225);
    private JButton[] gridButtons = new JButton[9];
    private JLabel topLabel = new JLabel("TEST");

    private int[][] gridBorderMap = {
            {0, 0, 5, 5},
            {0, 5, 5, 5},
            {0, 5, 5, 0},
            {5, 0, 5, 5},
            {5, 5, 5, 5},
            {5, 5, 5, 0},
            {5, 0, 0, 5},
            {5, 5, 0, 5},
            {5, 5, 0, 0}
    };

    View() {
        generateGrid();

        jFrame.getContentPane().setBackground(backgroundColor);

        jFrame.getContentPane().add(BorderLayout.NORTH, topLabel);
        jFrame.getContentPane().add(BorderLayout.CENTER, innerPanel);

        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    private void generateGrid() {
        innerPanel.setBorder(new MatteBorder(20, 20, 20, 20, backgroundColor));
        innerPanel.setLayout(gridLayout);

        for (int i = 0; i < 9; i++) {
            JButton button = new JButton(""+(i + 1));
            button.setBorder(new MatteBorder(gridBorderMap[i][0], gridBorderMap[i][1], gridBorderMap[i][2], gridBorderMap[i][3], Color.BLACK));
            button.setBackground(backgroundColor);
            gridButtons[i] = button;
            innerPanel.add(button);
        }
    }

    public JButton[] getGridButtons() {
        return gridButtons;
    }
}

