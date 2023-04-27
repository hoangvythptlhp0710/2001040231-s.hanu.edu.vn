package tuts.tut9.todo.chain_of_responsibility.middleware;


import tuts.tut9.todo.chain_of_responsibility.server.Server;

/**
 * ConcreteHandler. Checks whether a user with the given credentials exists.
 */
public class UserExistsMiddleware extends Middleware {
    private Server server;

    //TO-DO: Implement the UserExistsMiddleWare() method
    public UserExistsMiddleware(Server server) {
         this.server = server;
    }

    public boolean check(String email, String password) {
        //TO-DO: Check for invalid email => show error message then return false
        if (server.isValidPassword(email, password)) {
            System.out.println("Error!");
        }
        //TO-DO: Check for invalid password for an email => show error message then return false
        return checkNext(email, password);
    }
}