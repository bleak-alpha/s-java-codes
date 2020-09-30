public class TestArray_Array{
    public static void main(String[] args){
        int [] index=new int[4];
        index[0]=1;
        index[1]=3;
        index[2]=0;
        index[3]=2;
        String [] islands=new String[4];
        islands[0]="Bermuda";
        islands[1]="Fiji";
        islands[2]="Azores";
        islands[3]="Cozumel";
        int y=0, ref;
        while(y<4){
            ref=index[y];  //ref is used as reference as y will change but ref will not
            System.out.print("Island = "+islands[ref]);
            y=y+1;
        }
    }
}