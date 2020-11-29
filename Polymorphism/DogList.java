class myDogList
{   private Dog [] dogs = new Dog[5];
    private int index = 0;

    public void add(Dog d)
    {    if (index < dogs.length)
        {    dogs[index] = d;
             System.out.print("Dog added at "+index);
             index++;
        }

    }
}