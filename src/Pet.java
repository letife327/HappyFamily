import java.util.Arrays;

public class Pet {
    public String species;
    public String nickname;
    public int age;
    public int trickLevel;
    public String[] habits;
    public Pet(){

    }
    public Pet(String nickname, String species){
        this.nickname = nickname;
        this.species = species;
    }
    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
    this.nickname = nickname;
    this.species = species;
    this.age = age;
    this.trickLevel = trickLevel;
    this.habits = habits;
    }

    public void eat() {
        System.out.println("I'm eating");
    }

    public String respond() {
        return String.format("Hello owner, I'm -%s. I miss you!", nickname);
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    public void showElements() {
        String arr = Arrays.toString(habits);
        String result = String.format("Pet = {nickname=%s, age=%d, trickLevel=%d, habits=%s, species = %s}", nickname, age, trickLevel, arr,species);
        System.out.println(result);
    }
}
