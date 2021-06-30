package provider;

import Models.Gender;
import Models.User;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class UserFactory{

    User user;
    public User registerNewUser(){
        return new User.Builder()
                .setGender(Gender.getRandomGender())
                .setFirstname("Nya")
                .setLastname("Nyasha")
                .setEmail(generateRandomText()+"@gmail.com")
                .setPassword(generateRandomText())
                .setbirth(generateRamdomNumric(), generateRamdomNumric(),generateRamdomNumric())
                .build();
    }



    public String generateRandomText(){
        return RandomStringUtils.random(7,true,false);
    }

    public int generateRamdomNumric(){
        return RandomUtils.nextInt(0,31);
    }

    public User alreadyRegisteredUser(){
        return new User.Builder()
                .setEmail("")
                .setPassword("")
                .build();
    }

}
