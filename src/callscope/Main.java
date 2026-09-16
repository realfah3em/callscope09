package callscope;

public class Main {
    public static void main(String[] args) {

        Agent faheemAgent = new Agent(01, "faheem", "faheem.manyar@gmail.com");
        Agent satishAgent = new Agent(02, "satish", "satish.theophilus@yahoo.com");
        Agent ruksarAgent = new Agent(03, "ruksar", "ruksar.khan@rediffmail.com");


        Customer clara = new Customer(03, "clara jefferson", "clara.jefferson@gmail.com");
        Customer ben = new Customer(05, "ben flitoff", "ben.flitoff@yahoo.com");
        Customer jason = new Customer(06, "jason woakes", "jason.woakes@rediffmail.com");

        Turn turn1 = new Turn(1, "faheem", "Hello Clara, Hows The Weather?", 2.10);
        Turn turn2 = new Turn(2, "clara", "Good Faheem, How are you.. im stuck in some trouble!", 2.20);
        Turn turn3 = new Turn(3, "faheem", "There to help everytime, ma'am", 2.30);
        Turn turn4 = new Turn(4, "clara", "network's gone since 10pm, i dont know what happened!",2.35);
        Turn turn5 = new Turn(5, "faheem", "let me check the issue and get back to you ma'am...... oh, ma'am there some maintainence work going in your area of usage. it will get fixed in 2 hours. we empathize with you in this matter, we want to compensate you for this problem.",3.10);
        Turn turn6 = new Turn(6, "clara", "oh, no thats fine. just fix the maintainence issue for me. thanks, bye!", 3.30);
        Turn turn7 = new Turn(7, "faheem", "sure clara, thanks!", 3.40);

        Turn[] turns = {turn1, turn2, turn3, turn4, turn5, turn6, turn7};


        Transcript transcript = new Transcript(01, 01, turns);


        Call c1 = new Call(01, faheemAgent, clara, transcript, 4.00, 1);


    }
}
