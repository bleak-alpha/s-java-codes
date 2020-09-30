public class PhraseOMatic{
    public static void main(String[] args){
        //Three sets of words to choose from
        String[] wordListOne={"24/7","multi-Tier","30,000 foot","B-to-B","win-win",
                "front-end","web-based","persuasive","smart","six-sigma",
                "critical-path","dynamic"};

        String[] wordListTwo={"empowered","sticky","value-added","oriented",
                "centric","distributed","clustered","branded","outside-the-box",
                "positioned","networked","focused","leveraged","aligned","targeted",
                "shared","cooperative","accelerated"};

        String[] wordListThree = {"process","tipping-point","solution",
                "architecture","core competency","strategy","mind-share","portal",
                "space","vision","paradigm","mission"};

        //Find out how many words are in each list
        int oneLength=wordListOne.length;
        int twoLength= wordListTwo.length;
        int threeLength=wordListThree.length;

        //Generate three random numbers
        int rand1=(int)(Math.random()*oneLength);
        int rand2=(int)(Math.random()*twoLength);
        int rand3=(int)(Math.random()*threeLength);

        //Now build a phrase
        String phrase=wordListOne[rand1]+" "+wordListTwo[rand2]+" "
                +wordListThree[rand3];

        //Now print out the phrase
        System.out.print("What we need is a "+phrase);
    }
}

