package Displays;

import Utility.Colours;
import Objects.BoardData;
import Utility.TextHandling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BoardDisplay extends JPanel{
    private static final int ROWS = 5;
    private static final int COLS = 6;
    private static final int GAP = 3;
    private JButton[][] buttonGrid = new JButton[ROWS][COLS];
    private int counter = 0;

    Font NUM_FONT = new Font("serif", Font.BOLD, 55);
    Font TITLE_FONT = new Font("serif", Font.BOLD, 22);
    Color SCREEN_COLOUR = Color.decode(Colours.INDIGO_900);
    Color TEXT_COLOUR = Color.decode(Colours.YELLOW_700);

    ScoreDisplay scoreDisplay;
    BoardData boardData;
    boolean round2;
    CellClick click;
    EndGame endGame;


    public BoardDisplay(ScoreDisplay scoreDisplay, BoardData boardData, boolean round2, CellClick click, EndGame endGame) {
        this.scoreDisplay = scoreDisplay;
        this.boardData = boardData;
        this.round2 = round2;
        this.endGame = endGame;
        this.click = click;

        setLayout(new GridLayout(1, 1));
        add(screen());

    }

    private JPanel screen() {
        JPanel layout = new JPanel(new BorderLayout());

        layout.add(scoreDisplay, BorderLayout.SOUTH);
        layout.add(board(), BorderLayout.CENTER);

        return layout;
    }

    private JPanel board(){
        JPanel board = new JPanel(new GridLayout(ROWS+1, COLS, GAP, GAP));

        ActionListener buttonListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                JButton selectedBtn = (JButton) evt.getSource();
                for (int row = 0; row < buttonGrid.length; row++) {
                    for (int col = 0; col < buttonGrid[row].length; col++) {
                        JButton button = buttonGrid[row][col];
                        if (button == selectedBtn  && !button.getText().equals("")) {
                            button.setText("");
                            counter++;
                            click.getCell(col, row);
                        }
                    }
                }
                if(counter == 30) { endGame.end(); }
            }
        };

        String[] cat = boardData.getCategories();
        for (int col = 0; col < cat.length; col++) {
            String txt = TextHandling.htmlText(cat[col], 10);
            JButton temp = new JButton(txt);
            temp.setFont(TITLE_FONT);
            temp.setBackground(SCREEN_COLOUR);
            temp.setForeground(TEXT_COLOUR);
            board.add(temp);
        }

        for (int row = 0; row < buttonGrid.length; row++) {
            int mul = 1;
            if(round2){ mul++; }
            int val = (100 + (100*row))*mul;
            for (int col = 0; col < buttonGrid[row].length; col++) {
                String text = String.format("%d", val);
                JButton temp = new JButton(text);
                temp.setFont(NUM_FONT);
                temp.setBackground(SCREEN_COLOUR);
                temp.setForeground(TEXT_COLOUR);
                buttonGrid[row][col] = temp;
                buttonGrid[row][col].addActionListener(buttonListener);
                board.add(buttonGrid[row][col]);
            }
        }

        return board;
    }

    public void updateScoreText(int col){ scoreDisplay.updateScoreText(col); }

    public interface CellClick {
        void getCell(int col, int row);
    }

    public interface EndGame {
        void end();
    }
}
