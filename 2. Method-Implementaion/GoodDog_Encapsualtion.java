class GoodDog{
    private
    int size;

    public
    int getSize(){
        return size; }

    void setSize(int s){
        size=s; }

    void bark(){
        if (size>60)
            System.out.print("\nWoof! Woof!");
        else if (size>14)
            System.out.print("\nRuff! Ruff!");
        else
            System.out.print("\nYip! Yip!");
    }
}
class GoodDogTestDrive{
    public static void main(String[] args){
        GoodDog one=new GoodDog();
        one.setSize(70);

        GoodDog two=new GoodDog();
        two.setSize(8);

        System.out.print("\nDog one: "+one.getSize()); one.bark();
        System.out.print("\nDog two: "+two.getSize()); two.bark();
    }
}