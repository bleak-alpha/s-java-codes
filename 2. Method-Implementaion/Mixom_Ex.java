class Mix4{
    int counter=0;
    public int maybeNew(int index){
        if(index<5){
            Mix4 m4=new Mix4();
            m4.counter++;
            return 1;
        } else return 0;
    }
    public static void main(String[] args){
        int count=0;
        int x=0;
        Mix4[] m4a=new Mix4[20];
        while(x<20){
            m4a[x]=new Mix4();
            m4a[x].counter++;
            count++;
            count+=m4a[x].maybeNew(x);
            x++;
        }
        System.out.print(count+" "+m4a[1].counter);
    }
}