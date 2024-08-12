
import java.util.Scanner;

public class HeroiTerra extends Heroi {
    Scanner sc = new Scanner(System.in);


    public void setNome(String nome){
        this.nome = nome;
    }
    public void setElemento(String elemento){
        this.elemento = elemento;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getElemento(){
        return elemento;
    }

    public void PoderTerra(){
        System.out.print("DESEJA UTILIZAR SEU PODER?(sim/não): ");
        String poderterra = sc.next();

        if(poderterra.equalsIgnoreCase("sim")){
            System.out.println("\n********************");
            System.out.println("PODER DE TERRA ATIVADO!");
            System.out.println("********************");
        }
        else if(poderterra.equalsIgnoreCase("nao")){
            System.out.println("VOCÊ NÃO ATIVOU SEU PODER!");
        }
        else{
            System.out.println("OPÇÃO INVÁLIDA!");
            PoderTerra();
        }
    }
}
