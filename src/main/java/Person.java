import java.util.Objects;

public class Person {

    protected final String firstname;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }

    public Person(String firstname, String surname, int age) {
        this.firstname = firstname;
        this.surname = surname;
        this.age = age;
    }

    public Person(String firstname, String surname, int age, String address) {
        this.firstname = firstname;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        return age > -1;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() throws UnknownError {
        if (hasAge()) {
            age += 1;
        } else throw new UnknownError("Person haven't age!");
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAge(0)
                .setAddress(address);
    }

    @Override
    public String toString() {
        return firstname +
                " " + surname +
                " (" + (hasAge() ? age + " y.o., " : "age unknown, ") +
                (hasAddress() ? address + ") " : "address unknown) ");
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstname(), getSurname(), getAge(), getAddress());
    }
}
