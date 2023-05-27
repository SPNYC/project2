package project2;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("SvetlanaPisareva@yahoo.com");
        registration.setUserName("Svetlana84");
        registration.setPassword("password01234");
        System.out.println("Email: " + registration.getEmail());
        System.out.println("Username: " + registration.getUserName());
        System.out.println("Password: " + registration.getPassword());
    }
    }

