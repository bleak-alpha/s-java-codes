class Dog{
    public void bark(){
        System.out.print(name+" says ruff"); }
    public void cat(){}
    public void chasecat(){}
    String name;
    public static void main(String[] args){
        //now make a Dog object and access it
        Dog dog1=new Dog();
        dog1.bark();
        dog1.name="Bart";

        //now make a Dog array
        Dog[] myDogs=new Dog[3];
        //Adding some dogs into array
        myDogs[0]=new Dog();
        myDogs[1]=new Dog();
        myDogs[2]=new Dog();

        //Now access
    }
}