class Triangle_Array {
    double area;
    int height;
    int length;
    void setArea(){
        area=(height*length)/2;
    }

    public static void main(String[] args){
         int x=0;
         Triangle_Array[] ta=new Triangle_Array[4];
         while(x<4){
             ta[x]=new Triangle_Array();
             ta[x].height=(x+1)*2;
             ta[x].length=(x+4);
             ta[x].setArea();
             System.out.print("Triangle "+x+", area = "+ta[x].area+"\n");
             x++; }
         int y=x;
         x=27;
         Triangle_Array t5=ta[2];
         ta[2].area=343;
         System.out.print("y = "+y+", t5 area "+t5.area+"\n");
    }
}