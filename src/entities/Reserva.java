package entities;

public class Reserva {


    private String name;
    private String email;


    public Reserva(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


}
