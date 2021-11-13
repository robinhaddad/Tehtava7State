public class Pokemon {
    private double exp = 0;
    private boolean t = true;
    private boolean b = true;
    private State state;

    public Pokemon(){
        state = Bulbasaur.getInstance();
    }

    public void activeOpen() {
        state.activeOpen(this);
    }

    protected void changeState (State s) {
        state = s;
    }

    public String attack() {
        this.exp++;
        if (exp>15&&t){
            t=false;
            System.out.println("Your Pokemon leveled up : ");
            activeOpen();
        }
        if (exp>31&&b){
            b=false;
            System.out.println("Your Pokemon leveled up : ");
            activeOpen();
        }
        return state.attack();
    }

    public double getExp() {
        return exp;
    }
}
