public class Bulbasaur extends State {
    private static Bulbasaur bulbasaur = null;
    private Bulbasaur(){}
    public static Bulbasaur getInstance(){
        if(bulbasaur == null){
            bulbasaur = new Bulbasaur();
        }
        return bulbasaur;
    }

    public String attack(){
        return "Bulbasaur attacks!";
    }

    void activeOpen(Pokemon p){
        System.out.println("Bulbasaur evolved into Ivysaur!\n");
        changeState(p,Ivysaur.getInstance());
    }
}
