public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        for(int i=1;i<36;i++){
            System.out.println(pokemon.attack()+
                    " (number of attacks: "+i+") (number of exp: "+pokemon.getExp()+")");
        }
    }
}
