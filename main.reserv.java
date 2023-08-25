public class main {

    public static void main(String[] args){
        System.out.println("*\n*\n***\n****\n****");
    }
}import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters for username and password
}

class Reservation {
    private String PNR;
    private String trainNumber;
    private String trainName;
    private String classType;
    private String dateOfJourney;
    private String source;
    private String destination;

    public Reservation(String trainNumber, String classType, String dateOfJourney, String source, String destination) {
        this.PNR = generatePNR();
        this.trainNumber = trainNumber;
        this.classType = classType;
        this.dateOfJourney = dateOfJourney;
        this.source = source;
        this.destination = destination;
        // You can fetch train name automatically based on trainNumber from the database
    }

    private String generatePNR() {
        // Generate a unique PNR for the reservation (e.g., using random numbers)
        return "PNR12345";
    }

    // Getters for reservation details
}

public class OnlineReservationSystem {
    private List<User> users = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    public void addUser(String username, String password) {
        User user = new User(username, password);
        users.add(user);
    }

    public User loginUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null; // Invalid login credentials
    }

    public void makeReservation(User user, String trainNumber, String classType, String dateOfJourney, String source, String destination) {
        Reservation reservation = new Reservation(trainNumber, classType, dateOfJourney, source, destination);
        reservations.add(reservation);
    }

    public Reservation cancelReservation(String PNR) {
        for (Reservation reservation : reservations) {
            if (reservation.getPNR().equals(PNR)) {
                reservations.remove(reservation);
                return reservation;
            }
        }
        return null; // PNR not found
    }

    public static void main(String[] args) {
        OnlineReservationSystem system = new OnlineReservationSystem();
        Scanner scanner = new Scanner(System.in);

        // Implement user interface for registration, login, reservation, and cancellation here using scanner inputs.
    }




