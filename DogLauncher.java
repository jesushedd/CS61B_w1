public class DogLauncher {
    public static void main(String[] args) {
        Dog small = new Dog(5);
        small.makeNoise();
        Dog hugeDog = new Dog(100);
        hugeDog.makeNoise();
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog(20);
        dogs[1] = new Dog(200);
        for (Dog dogi : dogs) {
            dogi.makeNoise();
        }
        System.out.println();
        (Dog.maxDog(dogs[0], hugeDog)).makeNoise();
        System.out.println();
        System.out.println(Dog.binomen);
    }
}
