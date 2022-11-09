public class Main {

    public static void main(String[] args) {

        User user = new User();
        user.setName("bob");
        user.setSurname("ali");

        System.out.println( "hello my name is " + user.getName() +" " + user.getSurname());
    }
}
