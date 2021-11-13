abstract class State {
    void activeOpen(Pokemon p){}
    void changeState(Pokemon p, State s){
        p.changeState(s);
    }

    public abstract String attack();
}
