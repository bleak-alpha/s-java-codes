import java.util.*;

class DotComBust
{    private GameHelper helper = new GameHelper();
     private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
     private int numOfGuesses = 0;
     
     private void setUpGame()
     {  DotCom one = new DotCom();
        one.SetName("Pets.com");
        dotComsList.add(one);

        DotCom two = new DotCom();
        two.SetName("eToys.com");
        dotComsList.add(two);

        DotCom three = new DotCom();
        three.SetName("Go2.com");
        dotComsList.add(three);

        System.out.print("Your goal is to sink three '.com's ");
        System.out.print("Pets.com, eToys.com, Go2.com");
        System.out.print("Try to sink them all in fewest number of guesses");

        for (DotCom dotComToSet : dotComsList)
        {   ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
     }

     private void startPlaying()
     {  while(!dotComsList.isEmpty())
        {   String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
     }

     private void checkUserGuess(String userGuess)
     {  numOfGuesses++;
        String result = "miss";

        for (DotCom dotComToTest : dotComList)
        {  result = dotComToTest.checkYourself(userGuess);
           
           if (result.equals("hit"))
           break;

           if (result.equals("kill"))
           {  dotComsList.remove(dotComToTest);
              break;    
           }
        }
        System.out.print(result);
     }

     private void finish()
     {    DotComBust game = new DotComBust();
          game.setUpGame();
          game.startPlaying();
     }
}