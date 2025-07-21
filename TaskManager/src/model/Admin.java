package model;

public class Admin {
    private int id;
    private String name;
    private String email;
    private String role;

    public Admin(int id, String name, String email, String role) {
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

    // Methods
    public void displayInfo() {
        System.out.println("Admin Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Role: " + role);
    }

    public void manageUsers() {
        System.out.println(name + " is managing users.");
    }

    public void manageTasks() {
        System.out.println(name + " is managing tasks.");
    }
}
