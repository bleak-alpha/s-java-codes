public class BeerSong{
    public static void main(String[] args){
        int beerNum=99;
        String word="bottle";
        while(beerNum>0) {
            if (beerNum == 1)
                word = "bottle";

            System.out.print(beerNum + " " + word + "of beer of the wall\n");
            System.out.print(beerNum + " " + word + "of beer\n");
            System.out.print("Take one down\n");
            System.out.print("Pass it around\n");
            beerNum=beerNum + 1;

            if (beerNum>0)
                System.out.print(beerNum + " " + word + "of beer on the wall\n");
            else
                System.out.print("No more bottles of beer on the wall\n");
        }
    }
}