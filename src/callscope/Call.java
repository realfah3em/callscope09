package callscope;

public class Call {

    private int callId;
    private Agent agent;
    private Customer customer;
    private Transcript transcript;
    private double duration;
    private int status;

    public Call(int callId, Agent agent, Customer customer, Transcript transcript, double duration, int status) {
        this.callId = callId;
        this.agent = agent;
        this.customer = customer;
        this.transcript = transcript;
        this.duration = duration;
        this.status = status;
    }

    public int getCallId() {
        return callId;
    }

    public void setCallId(int callId) {
        this.callId = callId;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
