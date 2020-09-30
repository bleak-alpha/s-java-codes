class Books{
    String titles, author;
}
class BooksTestDrive{
    public static void main(String[] args){
        Books [] myBooks=new Books[3];
        int x=0;
        myBooks[0]=new Books();
        myBooks[0].titles="The Grapes of Java";
        myBooks[0].author="Bob";

        myBooks[1]=new Books();
        myBooks[1].titles="The Java Gatsby";
        myBooks[1].author="Bue";

        myBooks[2]=new Books();
        myBooks[2].titles="The Java Cookbook";
        myBooks[2].author="Ian";

        while(x<3){
            System.out.print(myBooks[x].titles+" by "+myBooks[x].author+"\n");
            x++;
        }

    }
}
