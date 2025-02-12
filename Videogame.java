import java.util.Scanner;
public class Videogame
{
    private String game;
    private String console;
    private int numPlayed;
    public Videogame(String game1, String console1, int numPlayed1){
        game = game1;
        console = console1;
        numPlayed = numPlayed1;
    }
    public Videogame( String console2, int numPlayed2){
        game = "Kirby";
        console = console2;
        numPlayed = numPlayed2;
    }
    public Videogame( int numPlayed3){
        game = "The binding of Isaac";
        console = "PC";
        numPlayed = numPlayed3;
    }
    public void ExtraTimesPlayed(int extraNumPlayed){
        numPlayed = numPlayed + extraNumPlayed;
    }
    public String toString(){
        return "You played "+ game+" form the console " + console + " this number of times: "+ numPlayed;
    }
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        System.out.println("Hello enter a game");
        System.out.print("Game: ");
        String game = key.nextLine();
        System.out.print("Console: ");
        String console = key.nextLine();
        System.out.print("Number of times played: ");
        int numPlayed = key.nextInt();
        Videogame gaming = new Videogame(game, console, numPlayed);
        System.out.println(gaming);
        gaming = new Videogame(console, numPlayed);
        System.out.println(gaming);
        gaming = new Videogame(numPlayed);
        System.out.println(gaming);
        System.out.println("Add the times that you played");
        int extraTiemsPlayed = key.nextInt();
        gaming.ExtraTimesPlayed(extraTiemsPlayed);
        System.out.print(gaming);
    }
}
