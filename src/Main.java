import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        About Pets obyektlerle
//        Pet pet1 = new Pet();
//        pet1.species= "cat";
//        pet1.age= 1;
//        pet1.nickname ="Masi";
//        pet1.trickLevel= 75;
//        String[] habits = new String[]{"eating","sleeping","drinking"};
//        pet1.habits= habits;
//   constructorla
        Pet pet1 = new Pet("cat", "masi",
                1, 75,
                new String[]{"drinking", "eating", "sleeping"});
        pet1.showElements();

//        About Humans bos konstruktor
//        Human human1 = new Human();
//        Human mother = new Human();
//        Human father = new Human();
//        mother.name = "Firengiz";
//        mother.surname = "Karleone";
//        mother.birthday = LocalDate.of(2004, 8, 11);
//        mother.iQ = 75;
//        father.name = "Qezenfer";
//        father.surname = "Karleone";
//        father.birthday = LocalDate.of(2004, 8, 11);
//        father.iQ = 75;
//        String[][] scheduleActivity = {
//                {"Monday", "Gym", "Reading"},
//                {"Tuesday", "Running", "Cooking"},
//                {"Wednesday", "Swimming", "Painting"},
//                {"Thursday", "Yoga", "Gaming"},
//                {"Friday", "Cycling", "Photography"},
//                {"Saturday", "Hiking", "Gardening"},
//                {"Sunday", "Rest", "Family Time"}
//        };
//
//        human1.name = "Michael";
//        human1.surname = "Karleone";
//        human1.birthday = LocalDate.of(2004, 8, 11);
//        human1.iQ = 75;
//        human1.mother = mother;
//        human1.father = father;
//        human1.pet = pet1;
        String[][] schedule ={
                {"Monday", "Gym", "Reading"},
                {"Tuesday", "Running", "Cooking"},
                {"Wednesday", "Swimming", "Painting"},
                {"Thursday", "Yoga", "Gaming"},
                {"Friday", "Cycling", "Photography"},
                {"Saturday", "Hiking", "Gardening"},
                {"Sunday", "Rest", "Family Time"}
        };
        Human mother = new Human();
        mother.name= "Gulbahar";
        Human father = new Human();
        father.name="Qazanfar";
        Human human1= new Human("Alisa","Ahmadova",
                LocalDate.of(2000,3,6),
                75,pet1,schedule,mother,father);

        human1.showElements();
//        System.out.println(mother.name);
//        System.out.println(father.name);
//        System.out.println(human1.schedule[2][2]);
//        System.out.println(human1.pet.nickname);
//        System.out.println(human1.pet.age);
//        System.out.println(human1.describePet());

    }


}