package Objects;

public class QuestionData {

    private String ans, que, cat;
    private int pts;

    public QuestionData(String ans, String que, String cat, int pts) {
        this.ans = ans;
        this.que = que;
        this.cat = cat;
        this.pts = pts;
    }

    public String getAns() {
        return ans;
    }

    public String getQue() {
        return que;
    }

    public String getCat() {
        return cat;
    }

    public int getPts() {
        return pts;
    }
}
