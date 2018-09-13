import Displays.BoardDisplay;
import Displays.QuestionDisplay;
import Displays.ScoreDisplay;
import Objects.BoardData;
import Objects.QuestionData;
import Objects.TeamData;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Jeopardy {

    boolean override;
    boolean winner = false;
    boolean close = false;

    JFrame frameM = new JFrame("Jeopardy");
    JFrame frameQ;

    private BoardData boardData;
    private TeamData[] teamData;

    private BoardDisplay board;
    private QuestionDisplay question;

    public Jeopardy(BoardData boardData, TeamData[] teamData, boolean override) {
        this.boardData = boardData;
        this.teamData = teamData;
        this.override = override;

        ScoreDisplay sd = new ScoreDisplay(teamData, true, updateScore);
        board = new BoardDisplay(sd, boardData, false, click, endGame);
        loadFrame(frameM, board, JFrame.EXIT_ON_CLOSE);

    }


    BoardDisplay.EndGame endGame = new BoardDisplay.EndGame() {
        @Override
        public void end() {
            winner = true;
            System.out.print("Last question!");
        }
    };

    BoardDisplay.CellClick click = new BoardDisplay.CellClick() {
        @Override
        public void getCell(int col, int row) {
            QuestionData questionData = boardData.getQuestion(col, row);
            String title = questionData.getCat() + " - " + questionData.getPts();
            frameQ = new JFrame(title);

            ScoreDisplay sd = new ScoreDisplay(teamData, false, updateScore);
            question = new QuestionDisplay(sd, questionData, closeCell);

            loadFrame(frameQ, question, JFrame.DISPOSE_ON_CLOSE);
        }
    };

    QuestionDisplay.closeCell closeCell = new QuestionDisplay.closeCell() {
        @Override
        public void close() {
            frameQ.dispatchEvent(new WindowEvent(frameQ, WindowEvent.WINDOW_CLOSING));
            if(close){
                frameM.dispatchEvent(new WindowEvent(frameM, WindowEvent.WINDOW_CLOSING));
            }
            if(winner){
                // TODO - Pop-up winning team
                close = true;
                int highscore = 0;
                ArrayList<TeamData> winners = new ArrayList<>();
                for(TeamData x : teamData){ if(x.getPts() > highscore) {highscore = x.getPts();} }
                for(TeamData x : teamData){ if(x.getPts() == highscore) {winners.add(x);} }
                String que, ans;
                if(winners.size() == 1) {
                    que = "And the winner is...";
                    ans = winners.get(0).getName();
                }
                else {
                    que = "And the winners are...";
                    ans = "<html>";
                    for(TeamData x: winners) {ans += x.getName() + "<br>";}
                    ans += "</html>";
                }

                QuestionData questionData = new QuestionData(ans, que, "Win", 0);
                String title = "Drum-roll please!";
                frameQ = new JFrame(title);

                ScoreDisplay sd = new ScoreDisplay(teamData, false, updateScore);
                question = new QuestionDisplay(sd, questionData, closeCell);

                loadFrame(frameQ, question, JFrame.DISPOSE_ON_CLOSE);
            }
        }
    };

    ScoreDisplay.updateScore updateScore = new ScoreDisplay.updateScore() {
        @Override
        public void update(int col, boolean correct) {
            int score = question.getQuestionScore();
            if(!correct) {score = score * -1;}
            teamData[col].setPts(teamData[col].getPts() + score);
            board.updateScoreText(col);
            question.updateScoreText(col);
        }
    };


    public void loadFrame(JFrame frame, JPanel panel, int close){
        frame.setDefaultCloseOperation(close);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

}
