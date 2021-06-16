package model;

public class SessionUser {
    private static User loggedInUser;
    private static String password;

    public static User getLoggedInUser() {
        return loggedInUser;
    }

    public static void setLoggedInUser(User loggedInUser) {
        SessionUser.loggedInUser = loggedInUser;
    }


}
