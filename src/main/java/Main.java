public class Main {
    public static void main(String[] args) {

        Person mom = new PersonBuilder()
                .setFirstname("Anna")
                .setSurname("Wolf")
                .setAge(31)
                .setAddress("Sydney")
                .build();

        Person son = mom.newChildBuilder()
                .setFirstname("Anton")
                .build();

        System.out.println(mom + "has a son " + son);

        try {
            new PersonBuilder().build();
        } catch (IllegalArgumentException exception) {
            exception.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException exception) {
            exception.printStackTrace();
        }
    }
}
