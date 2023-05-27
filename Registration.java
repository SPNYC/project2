package project2;
/*
Create Registration Class in which you would have variables as email, userName and password that have an access scope only within its own class. After creating an object of the class user should be able to call methods and in each method separately pass values to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain userName.
 */
 class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println("Email is correct");
        } else {
            System.out.println("Invalid email");
        }
    }

    public void setUserName(String userName) {
        if (userName.length() > 6) {
            if (password == null || !password.contains(userName)) {
                this.userName = userName;
                System.out.println("Username is correct");
            } else {
                System.out.println("Invalid username");
            }
        } else {
            System.out.println("Username should be longer than 6 characters.");
        }
    }

    public void setPassword(String password) {
        if (password.length() > 6) {
            if (userName == null || !password.contains(userName)) {
                this.password = password;
                System.out.println("Password is correct");
            } else {
                System.out.println("Invalid password");
            }
        } else {
            System.out.println("Password should be longer than 6 characters.");
        }
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}


