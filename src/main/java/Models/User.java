package Models;

public class User {
    private Gender gender;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private int day;
    private int month;
    private int year;
     private String offers;
     private String customerPrivacy;
     private String signupLetter;
     private String acceptconfition;


    public User(Gender gender, String firstname, String lastname, String email, String password, int day, int month, int year) {
        this.gender = gender;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.day = day;
        this.month = month;
        this.year = year;
        this.offers = offers;
        this.customerPrivacy = customerPrivacy;
        this.signupLetter = signupLetter;
        this.acceptconfition = acceptconfition;
    }

    public Gender getGender() {
        return gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }


    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getOffers() {
        return offers;
    }

    public String getCustomerPrivacy() {
        return customerPrivacy;
    }

    public String getSignupLetter() {
        return signupLetter;
    }

    public String getAcceptconfition() {
        return acceptconfition;
    }

    public String getBirth(){
        return month +"/" + day +"/"+ year;
    }

    public static  final class Builder{
        private Gender gender;
        private String firstname;
        private String lastname;
        private String email;
        private String password;
        private int day;
        private int month;
        private int year;


        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setbirth(int month, int day, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
            return this;
        }


        public User build(){
            return new User(this.gender, this.firstname, this.lastname, this.email, this.password, this.day, this.month,this.year);
        }
    }
}
