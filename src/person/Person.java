package person;

public class Person {
    private String fullName;
    private char gender;
    private String email;
    public Person(){

    }

    public Person(String fullName, char gender, String email) {
        this.fullName = fullName;
        this.gender = gender;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "fullName='" + fullName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'';
    }
}
