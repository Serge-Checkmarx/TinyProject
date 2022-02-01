package org.tiny;

public class Main {

    public static void main(String[] args) {
        //  write your code here

    }

    public String login() {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String sql = "select * from users where (email ='" + email +"' and password ='" + password + "')";

        Connection connection = pool.getConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sql);
        if (result.next()) {
            loggedIn = true;
            // Successfully logged in and redirect to user profile page
        }
        else
        {
            // Auth failure - Redirect to Login Page
        }
    }

}
