package Models;

import java.util.Random;

public enum Gender {
    male,female;

    public static Gender getRandomGender(){
        Random rnd = new Random();
        return values()[new Random().nextInt(values().length)];
    }
}
