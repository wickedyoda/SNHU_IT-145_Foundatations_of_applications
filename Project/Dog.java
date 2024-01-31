// to be submitted: module_2/Dog.java

public class Dog extends Pet {
    private String breed;
    private int age;
    private int dogSpaceNumber;
    private double dogWeight;
    private boolean grooming;

    public Dog(String name, String breed, int age) {
        super(name);
        this.breed = breed;
        this.age = age;
    }

    public boolean getGrooming() {
        return grooming;
    }

    public void setGrooming(boolean grooming) {
        this.grooming = grooming;
    }

    public double getDogWeight() {
        return dogWeight;
    }

    public void setDogWeight(double dogWeight) {
        this.dogWeight = dogWeight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDogSpaceNumber() {
        return dogSpaceNumber;
    }

    public void setDogSpaceNumber(int dogSpaceNumber) {
        this.dogSpaceNumber = dogSpaceNumber;
    }
}