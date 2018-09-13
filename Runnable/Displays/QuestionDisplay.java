package Displays;

import Utility.Colours;
import Objects.QuestionData;
import Utility.TextHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestionDisplay extends JPanel{

    ScoreDisplay scoreDisplay;
    private QuestionData que;
    Font CUSTOM_FONT = new Font("serif", Font.BOLD, 60);
    closeCell closeCell;

    public QuestionDisplay(ScoreDisplay scoreDisplay, QuestionData que, closeCell closeCell){
        this.scoreDisplay = scoreDisplay;
        this.que = que;
        this.closeCell = closeCell;
        setLayout(new GridLayout(1,1));

       add(screen());
    }

    private JPanel screen() {
        JPanel layout = new JPanel(new BorderLayout());

        layout.add(scoreDisplay, BorderLayout.SOUTH);
        layout.add(question(), BorderLayout.CENTER);

        return layout;
    }

    private JPanel question(){
        JPanel text = new JPanel(new BorderLayout());
        ActionListener buttonListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                JButton selectedBtn = (JButton) evt.getSource();
                String txt = selectedBtn.getText();
                if(!txt.equals("+") && !txt.equals("-")){
                    selectedBtn.setText(que.getAns());
                }
                if(txt.equals(que.getAns())){
                    closeCell.close();
                }
            }
        };
        System.out.println(que.getAns() + '\n');
        String txt = TextHandling.htmlText(que.getQue(), 35);

        JButton label = new JButton(txt);
        label.setFont(CUSTOM_FONT);
        label.setForeground(Color.decode(Colours.YELLOW_700));
        label.setBackground(Color.decode(Colours.INDIGO_900));
        label.addActionListener(buttonListener);

        text.add(label, BorderLayout.CENTER);
        return text;
    }

    public void updateScoreText(int col){ scoreDisplay.updateScoreText(col); }

    public int getQuestionScore() {
        return que.getPts();
    }

    public interface closeCell{
        void close();
    }
}
