package gioi1;

import xs1.InvalidAgeException;

public class User {
    private int age;

//    public void setAge(int age) {
//        if (age < 0) {
//            throw new IllegalArgumentException("Tuổi không thể âm!");
//        }
//        this.age = age;
//    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Tuổi không thể âm!");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
