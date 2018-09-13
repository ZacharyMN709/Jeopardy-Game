package Objects;

public class TeamData {

    String name;
    int idx, pts;

    public TeamData(String name, int idx) {
        this.name = name;
        this.idx = idx;
        this.pts = 0;
    }

    public String getName() {
        return name;
    }

    public int getIdx() {
        return idx;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }
}
