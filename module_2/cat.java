public class Cat extends Pet {
    private String breed;
    private int age;
    private double weight;
    private boolean isOutdoor;
    private int catSpaceNumber; 

    public Cat(String name, String breed, int age, double weight, boolean isOutdoor, int catSpaceNumber) {
        super(name);
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.isOutdoor = isOutdoor;
        this.catSpaceNumber = catSpaceNumber; 
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isOutdoor() {
        return isOutdoor;
    }

    public void setOutdoor(boolean outdoor) {
        isOutdoor = outdoor;
    }

    public int getCatSpaceNumber() {
        return catSpaceNumber;
    }

    public void setCatSpaceNumber(int catSpaceNumber) {
        this.catSpaceNumber = catSpaceNumber;
    }
}
