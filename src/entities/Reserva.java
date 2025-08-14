package entities;

public class Reserva {

    public String []name;
    public String []email;
    public int []quarto;

    public void Aluguel(int soma, String name, String email, int quarto){
        int i = soma;
        this.name[i] = name;
        this.email[i] = email;
        this.quarto[i] = quarto;
    }



}
