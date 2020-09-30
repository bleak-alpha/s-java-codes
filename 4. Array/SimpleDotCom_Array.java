import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SimpleDotCom {     //Main Class
    int[] locationCells;
    int numOfHits;

    public void setLocationCells(int[] loc) {
        locationCells = loc;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                System.out.print(result+"\n");
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length){
            result = "kill";
            System.out.print(result+"\n");
        }
        return result;
    }
}
class GameHelper{
    public String getUserInput(String prompt){
        String inputLine=null;
        System.out.print(prompt+" ");
        try{
            BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
            inputLine=is.readLine();
            if(inputLine.length()==0) return null;
        }
        catch(IOException e) {System.out.print("IOException "+e);}
        return inputLine;
    }
}
class SimpleDotComTest {
    public static void main(String[] args){
        int numOfGuess=0;
        GameHelper helper=new GameHelper();
        SimpleDotCom theDotCom=new SimpleDotCom();
        int randomNum=(int)(Math.random()*5);
        int[] location={randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCells(location);
        boolean isAlive=true;
        while(isAlive=true){
            String guess=helper.getUserInput("\nEnter a number:");
            String result= theDotCom.checkYourself(guess);
            numOfGuess++;
            if(result.equals("Kill"));{
                isAlive = false;
                System.out.print("You took out " + numOfGuess + " guesses");
            }
        }
    }
}