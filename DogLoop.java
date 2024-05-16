public class DogLoop {
    public static void main(String[] args) {
        Dog smallDog = new Dog(5);
        Dog mediumDog = new Dog(25);
        Dog hugeDog = new Dog(150);

        Dog[] manyDogs = new Dog[4];
        manyDogs[0] = smallDog;
        manyDogs[1] = hugeDog;
        manyDogs[2] = new Dog(120);

        int i=0;
        for (i = 0; i < manyDogs.length; i++) {
            Dog.maxDog(manyDogs[i], mediumDog).makeNoise();
        }
        
    }
}
