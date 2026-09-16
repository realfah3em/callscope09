package callscope;

public class Turn {

    private int turnId;
    private String speaker;
    private String text;
    private double timestamp;

    public Turn(int turnId, String speaker, String text, double timestamp) {
        this.turnId = turnId;
        this.speaker = speaker;
        this.text = text;
        this.timestamp = timestamp;
    }

    public int getTurnId() {
        return turnId;
    }

    public void setTurnId(int turnId) {
        this.turnId = turnId;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(double timestamp) {
        this.timestamp = timestamp;
    }
}
