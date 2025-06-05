package pessoa;

public class Pessoa {
    public String nome;
    public int idade;
    public double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void fazerAniversario(){
        idade++;
    }

    public void mostrarDados(){
        System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nAltura: "+altura+"\n");
    }
}
