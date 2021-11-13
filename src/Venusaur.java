public class Venusaur extends State {
    private static Venusaur venusaur = null;

    private Venusaur(){}

    public static Venusaur getInstance(){
        if(venusaur == null){
            venusaur = new Venusaur();
        }
        return venusaur;
    }
    public String attack(){
        return "Venusaur attacks!";
    }
}
