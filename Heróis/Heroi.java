import java.util.Scanner;

public class Heroi{
protected String nome;
protected String elemento;
protected int idade;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HeroiAgua heroi_de_agua = new HeroiAgua();
    
    //OBJ 1: HEROI AGUA
    heroi_de_agua.setNome("SUPER WATER");
    heroi_de_agua.setElemento("ÁGUA");
    heroi_de_agua.setIdade(25);
    System.out.println();
    System.out.println("Nome: " + heroi_de_agua.getNome());
    System.out.println("Elemento: " + heroi_de_agua.getElemento());
    System.out.println("Idade: " + heroi_de_agua.getIdade());
    heroi_de_agua.PoderAgua();
    System.out.println("---------------------------");


    //OBJ 2: HEROI FOGO
    HeroiFogo heroi_de_fogo = new HeroiFogo();

    heroi_de_fogo.setNome("SUPER FIRE");
    heroi_de_fogo.setElemento("FOGO");
    heroi_de_fogo.setIdade(18);
    System.out.println();
    System.out.println("Nome: " + heroi_de_fogo.getNome());
    System.out.println("Elemento: " + heroi_de_fogo.getElemento());
    System.out.println("Idade: " + heroi_de_fogo.getIdade());
    heroi_de_fogo.PoderFogo();
    System.out.println("---------------------------");


    // OBJ 3: HEROI TERRA
    //OBJ 2: HEROI FOGO
    HeroiTerra heroi_de_terra = new HeroiTerra();

    heroi_de_terra.setNome("SUPER TERRA");
    heroi_de_terra.setElemento("TERRA");
    heroi_de_terra.setIdade(37);
    System.out.println();
    System.out.println("Nome: " + heroi_de_terra.getNome());
    System.out.println("Elemento: " + heroi_de_terra.getElemento());
    System.out.println("Idade: " + heroi_de_terra.getIdade());
    heroi_de_terra.PoderTerra();
    System.out.println("---------------------------");

    }

}