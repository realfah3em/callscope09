package callscope;

public class Transcript {

    private int transcriptId;
    private int callId;
    private Turn[] turns;

    public Transcript(int transcriptId, int callId, Turn[] turns) {
        this.transcriptId = transcriptId;
        this.callId = callId;
        this.turns = turns;
    }

    public int getTranscriptId() {
        return transcriptId;
    }

    public void setTranscriptId(int transcriptId) {
        this.transcriptId = transcriptId;
    }

    public int getCallId() {
        return callId;
    }

    public void setCallId(int callId) {
        this.callId = callId;
    }

    public Turn[] getTurns() {
        return turns;
    }

    public void setTurns(Turn[] turns) {
        this.turns = turns;
    }
}
