package tuts.tut9.todo.chain_of_responsibility.server;

import tuts.tut9.todo.chain_of_responsibility.middleware.Middleware;

import java.util.HashMap;
import java.util.Map;

/**
 * Server class.
 */
public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    //TO-DO: Implement the setMiddleWare() method

    /**
     * Client passes a chain of object to server. This improves flexibility and
     * makes testing the server class easier.
     */
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    /**
     * Server gets email and password from client and sends the authorization
     * request to the chain.
     */
    public boolean logIn(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authorization have been successful!");
            if (users.get(email).equals(password)) {
                System.out.println("Welcome to the admin page!");
            }
            else {
                System.out.println("Welcome to the user page!");
            }
            return true;
            // Do something useful here for authorized users.
        }
        return false;
    }

    public void register(String email, String password) {
        //TO-DO: put given email & password to 'users' Map
        if (isValidPassword(email, password)) {
            users.put(email, password);
        }

    }

    public boolean hasEmail(String email) {
        //TO-DO: check for existed email in 'users' Map
        if (!users.containsKey(email)) {
            return true;
        }
        System.out.println("Email already existed!");
        return false;
    }

    public boolean isValidPassword(String email, String password) {
        //TO-DO: check for valid password for existed email in 'users' Map
        if (!hasEmail(email)) {
            if (!password.contains(".*[a-zA-Z1-9].*")) {
                System.out.println("Invalid password!");
                return false;
            }
            return true;
        }
        return false;
    }
}