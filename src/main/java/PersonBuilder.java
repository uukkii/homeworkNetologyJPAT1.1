public class PersonBuilder {

    private String firstname;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) throw new IllegalArgumentException("Illegal age argument!");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) throws IllegalArgumentException {
        this.address = address;
        return this;
    }


    public Person build() throws IllegalArgumentException {
        if (firstname == null || surname == null)
            throw new IllegalArgumentException("firstname and surname must be filled!");
        return new Person(firstname, surname, age, address);
    }
}
