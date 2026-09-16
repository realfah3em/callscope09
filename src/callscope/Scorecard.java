package callscope;

public class Scorecard {
    private double score;
    private double communicationScore;
    private double complianceScore;
    private double empathyScore;
    private double resolutionScore;

    public Scorecard(double score, double communicationScore, double complianceScore, double empathyScore, double resolutionScore) {
        this.score = score;
        this.communicationScore = communicationScore;
        this.complianceScore = complianceScore;
        this.empathyScore = empathyScore;
        this.resolutionScore = resolutionScore;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getCommunicationScore() {
        return communicationScore;
    }

    public void setCommunicationScore(double communicationScore) {
        this.communicationScore = communicationScore;
    }

    public double getComplianceScore() {
        return complianceScore;
    }

    public void setComplianceScore(double complianceScore) {
        this.complianceScore = complianceScore;
    }

    public double getEmpathyScore() {
        return empathyScore;
    }

    public void setEmpathyScore(double empathyScore) {
        this.empathyScore = empathyScore;
    }

    public double getResolutionScore() {
        return resolutionScore;
    }

    public void setResolutionScore(double resolutionScore) {
        this.resolutionScore = resolutionScore;
    }
}
