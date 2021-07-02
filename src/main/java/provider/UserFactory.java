package provider;

import Models.Gender;
import Models.User;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.By;

public class UserFactory{

    User user;
    public User registerNewUser(){
        return new User.Builder()
                .setGender(Gender.getRandomGender())
                .setFirstname("Oshikoya")
                .setLastname("Adam")
                .setEmail("adam@gmail.pl")
                .setPassword("54321")
                .setbirth(generateRamdomNumric(), generateRamdomNumric(),generateRamdomNumric())
                .build();
    }

    public String generateRandomText(){
        return RandomStringUtils.random(7,true,false);
    }

    public int generateRamdomNumric(){
        return RandomUtils.nextInt(0,31);
    }

}
