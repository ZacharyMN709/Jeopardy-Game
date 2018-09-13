package Displays;

import Utility.Colours;
import Objects.TeamData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScoreDisplay extends JPanel {

    TeamData[] teamData;
    JPanel[] cards;
    JButton[] scores;
    boolean main;
    Font TEAM_FONT = new Font("serif", Font.BOLD, 30);
    Font SCORE_FONT = new Font("serif", Font.BOLD, 40);
    Color[] teamColours = {Color.decode(Colours.RED_700), Color.decode(Colours.GREEN_700),
            Color.decode(Colours.DEEPPURPLE_700), Color.decode(Colours.GREY_700),
            Color.decode(Colours.PURE_Black), Color.decode(Colours.DEEPORANGE_700),
            Color.decode(Colours.BROWN_700), Color.decode(Colours.TEAL_700)};
    Color textColor = Color.decode(Colours.PURE_White);
    updateScore updateScore;

    public ScoreDisplay(TeamData[] teamData, boolean main, updateScore updateScore) {
        this.teamData = teamData;
        this.main = main;
        this.updateScore = updateScore;
        setLayout(new GridLayout(1, teamData.length));
        cards = new JPanel[teamData.length];
        scores = new JButton[teamData.length];

        for (int col = 0; col < teamData.length; col++) {
            cards[col] = makeScorecard(teamData[col], col);
            add(cards[col]);
        }
    }

    public JPanel makeScorecard(TeamData teamData, int col){
        JPanel card = new JPanel();
        int rows = 2;
        if(!main){rows++;}
        card.setLayout(new GridLayout(rows,1));

        JButton name = new JButton(teamData.getName());
        name.setFont(TEAM_FONT);
        name.setForeground(textColor);
        name.setBackground(teamColours[col]);

        JButton score = new JButton(String.valueOf(teamData.getPts()));
        score.setFont(SCORE_FONT);
        score.setForeground(textColor);
        score.setBackground(teamColours[col]);
        scores[col] = score;

        card.add(name);
        card.add(score);
        if(!main){card.add(makeBottom(col));}
        return card;
    }

    private JPanel makeBottom(int col){
        JPanel bottom = new JPanel(new GridLayout(1, 2));

        ActionListener buttonListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                JButton selectedBtn = (JButton) evt.getSource();
                for (int col = 0; col < cards.length; col++) {
                    JPanel card = cards[col];
                    if(card.equals(selectedBtn.getParent().getParent())){
                        // TODO - Attempt to print score to command line
                        boolean correct = false;
                        if(selectedBtn.getText().equals("-")){ correct = false; }
                        if(selectedBtn.getText().equals("+")){ correct = true; }
                        updateScore.update(col, correct);
                    }
                }
            }
        };


        JButton plus = new JButton("+");
        plus.setFont(SCORE_FONT);
        plus.setForeground(textColor);
        plus.setBackground(teamColours[col]);
        plus.addActionListener(buttonListener);
        JButton minus = new JButton("-");
        minus.setFont(SCORE_FONT);
        minus.setForeground(textColor);
        minus.setBackground(teamColours[col]);
        minus.addActionListener(buttonListener);

        bottom.add(minus);
        bottom.add(plus);
        return bottom;
    }

    public void updateScoreText(int col){ scores[col].setText(String.valueOf(teamData[col].getPts())); }

    public interface updateScore {
        void update(int col, boolean correct);
    }

}
