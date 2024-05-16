public class Dog{
    public int weight;

    public static String binomen = "Cannis Familiaris";

    public Dog(int startingWeight){
        weight = startingWeight;
    }

    public void makeNoise(){
        if (weight < 10) {
            System.out.println("yipyipyip!");
        } else if (weight < 30) {
            System.out.println("bark.bark!");
        } else {
            System.out.println("woof, woof");
        }
    }
    public static Dog maxDog(Dog d1, Dog d2){
        if (d1.weight > d2.weight) {
            return d1;
        } 
        return d2;
    }
}