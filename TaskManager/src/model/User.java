package model;

public class User {
    private int id;
    private String name;
    private String email;
    private String role;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = "user";
    }

    public User(int id, String name, String email, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Optional: Display user info
    public void displayInfo() {
        System.out.println("User Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Role: " + role);
    }
}
