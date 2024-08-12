import java.util.Scanner;


public class HeroiFogo extends Heroi{
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

    public void PoderFogo(){
        System.out.print("DESEJA UTILIZAR SEU PODER?(sim/não): ");
        String poderfogo = sc.next();

        if(poderfogo.equalsIgnoreCase("sim")){
            System.out.println("\n********************");
            System.out.println("PODER DE FOGO ATIVADO!");
            System.out.println("********************");
        }
        else if(poderfogo.equalsIgnoreCase("nao")){
            System.out.println("VOCÊ NÃO ATIVOU SEU PODER!");
        }
        else{
            System.out.println("OPÇÃO INVÁLIDA!");
            PoderFogo();
        }
    }
}

