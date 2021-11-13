public class Ivysaur extends State {
    private static Ivysaur ivysaur = null;

    private Ivysaur(){}

    public static Ivysaur getInstance(){
        if (ivysaur == null){
            ivysaur = new Ivysaur();
        }
        return ivysaur;
    }

    public String attack(){
        return "Ivysaur attacks!";
    }

    void activeOpen(Pokemon p){
        System.out.println("Ivysaur evolved into Venusaur!\n");
        changeState(p,Venusaur.getInstance());
    }
}
