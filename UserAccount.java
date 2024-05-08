import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserAccount {
    private String alias;
    private String email;
    private List<Tweet> tweets;
    private List<UserAccount> following;
    private List<Tweet> timeline;

    public UserAccount(String alias, String email) {
        if (!Utils.isValidAlias(alias)) {
            throw new IllegalArgumentException("El alias no es válido.");
        }
        if (!Utils.isValidEmail(email)) {
            throw new IllegalArgumentException("El email no es válido.");
        }
        this.alias = alias;
        this.email = email;
        this.tweets = new ArrayList<>();
        this.following = new ArrayList<>();
        this.timeline = new ArrayList<>();
    }

    // Getters y setters

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        if (!Utils.isValidAlias(alias)) {
            throw new IllegalArgumentException("El alias no es válido.");
        }
        this.alias = alias;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!Utils.isValidEmail(email)) {
            throw new IllegalArgumentException("El email no es válido.");
        }
        this.email = email;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public List<UserAccount> getFollowing() {
        return following;
    }

    public List<Tweet> getTimeline() {
        return timeline;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el alias:");
        String alias = scanner.nextLine();

        System.out.println("Introduce el correo electrónico:");
        String email = scanner.nextLine();

        UserAccount user = new UserAccount(alias, email);
        System.out.println("Se creó la cuenta de usuario con alias: " + user.getAlias() + " y correo electrónico: " + user.getEmail());

        scanner.close();
    }
}

class Utils {
    public static boolean isValidAlias(String alias) {
        return alias.matches("[a-zA-Z0-9]+");
    }

    public static boolean isValidEmail(String email) {
        // Expresión regular simplificada para validar emails
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }
}

class Tweet {
    // Implementación de la clase Tweet
}
