/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class TestScores {

    private double score1;
    private double score2;
    private double score3;

    public double getScore1() {
        return score1;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public double getScore3() {
        return score3;
    }

    public void setScore3(double score3) {
        this.score3 = score3;
    }

    public double averageScores() {
        return (getScore1() + getScore2() + getScore3()) / 3;
    }
}
