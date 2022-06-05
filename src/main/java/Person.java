public class Person {
    String name;
    String surname;
    int yearOfBirth;
    String placeOfBirth;
    String placeOfResidence;

    public Person(String name, String surname, int yearOfBirth, String placeOfBirth, String placeOfResidence) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.placeOfResidence = placeOfResidence;
    }


    static Person person1 = new Person("Adam", "Nowak", 2002, "Wrocław", "Gniezno");
    static Person person2 = new Person("Jan", "Kowalski", 1952, "Kraków", "Kraków");

    public static boolean equals() {
        return person1.equals(person2);
    }

    public static int hashcode() {
        return person2.hashCode();

    }

}


