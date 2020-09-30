class dog{
    int size; String name;

    void bark(){
        if (size>60)
            System.out.print("Woof! Woof!\n");
        else if (size>14)
            System.out.print("Ruff! Ruff!\n");
        else
            System.out.print("Yip! Yip!\n");
    }
}
class dogTestDrive{
    public static void main(String[] args){
        dog one=new dog();
        one.size=70;
        one.bark();

        dog two=new dog();
        two.size=8;
        two.bark();

        dog three=new dog();
        three.size=35;
        three.bark();
    }
}