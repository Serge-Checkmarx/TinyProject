package org.tiny;

public class Main {

    public static void main(String[] args) {
        //  write your code here

    }

    public String login() {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        //String sql = "select * from users where (email ='" + email +"' and password ='" + password + "')";
        String sql = "select * from users where email = ? and password = ? ";
        Connection connection = pool.getConnection();
        //Statement statement = connection.createStatement();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //ResultSet result = statement.executeQuery(sql);
        preparedStatement.setString(1, email);
        preparedStatement.setString(2, password);
        ResultSet result = preparedStatement.executeQuery();
        if (result.next()) {
            loggedIn = true;
            // Successfully logged in and redirect to user profile page
        }
        else {
            //Auth failure - Redirect to Login Page
        }
    }

}
