class PoorDog{
    private int size;
    private String name;

    public int getSize(){return size;}
    public String getName(){return name;}
}
class PoorDogTestDrive {
    public static void main(String[] args) {
        PoorDog one = new PoorDog();
        System.out.print("\nDog Size is " + one.getSize());
        System.out.print("\nDog Name is " + one.getName());
    }
}