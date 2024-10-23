import java.time.LocalDate;
import java.util.Arrays;

public class Human {
    public String name;
    public String surname;
    public LocalDate birthday;
    public int iQ;
    public Pet pet;
    public String[][] schedule;
    public Human mother;
    public Human father;
    public Human(){

    }
    public Human(String name,String surname,LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }
    public Human(String name,String surname,LocalDate birthday,Human mother,Human father) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.mother = mother;
        this.father= father;
    }

    public Human(String name,String surname,LocalDate birthday,int iQ,Pet pet,String[][] schedule, Human mother,Human father) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.iQ = iQ;
        this.pet = pet;
        this.schedule = schedule;
        this.mother = mother;
        this.father = father;
    }

    public String greetPet(){
        return  String.format("Hello %s", pet.nickname);
    }
    public String describePet(){
        String message = pet.trickLevel>50? "very sly":" almost not sly";
        return String.format("I have a %s, he is %s years old,he is %s ",pet.species,pet.age,message);
    }
    public void showElements(){
        String birthday = this.birthday.toString();
        String habits = Arrays.toString(this.pet.habits);
        String result = String.format("Human={name=%s, surname=%s," +
                " year=%s, iq=%d, mother=%s," +
                " father=%s," +
                " pet={nickname=%s," +
                " age=%d, trickLevel=%d, habits=%s}}",name,surname,birthday,iQ,mother.name,father.name,pet.nickname,pet.age,pet.trickLevel,habits);
        System.out.println(result);
    }

}
