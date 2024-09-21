package DataStructures;

public class ArrayItem {
    private String name;
    private double password;

    public ArrayItem(String name, double password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPassword() {
        return password;
    }

    public void setPassword(double password) {
        this.password = password;
    }
}
