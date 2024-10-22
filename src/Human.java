import java.time.LocalDate;

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

}
