class Player{
    int number;
    public void guess(){
        number=(int)(Math.random()*10);
        System.out.print("\nI'm Guessing "+number);
    }
}
public class GuessGame{
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1=new Player();  int p1guess=0;  Boolean p1right=false;
        p2=new Player();  int p2guess=0;  Boolean p2right=false;
        p3=new Player();  int p3guess=0;  Boolean p3right=false;

        int targetNumber=(int)(Math.random()*10);
        System.out.print("\nI'm thinking of a number between 0 and 9....");

        while(true){
            System.out.print("\nNumber to guess is "+targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            p1guess=p1.number;
            System.out.print("\nPlayer One guessed "+p1guess);

            p2guess=p2.number;
            System.out.print("\nPlayer Two guessed "+p2guess);

            p3guess=p3.number;
            System.out.print("\nPlayer Three guessed "+p3guess);

            if(p1guess==targetNumber)
                p1right=true;
            if(p2guess==targetNumber)
                p2right=true;
            if(p3guess==targetNumber)
                p3right=true;

            if(p1right||p2right||p3right){
                System.out.print("\nWe have a winner!");
                System.out.print("\nPlayer one got it right? "+p1right);
                System.out.print("\nPlayer two got it right? "+p2right);
                System.out.print("\nPlayer three got it right? "+p3right);
                break; }

            else{
                System.out.print("\nPlayers will have to try again.\n");
            }
        }
    }
}

class GameLauncher{
    public static void main(String[] args){
        GuessGame game=new GuessGame();
        game.startGame();
    }
}
