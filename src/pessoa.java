import org.w3c.dom.ls.LSOutput;

public class pessoa  extends Animal{
    // Atributod da classe

    String sobrenome;
    // Método da classe
    public void falar(){
        System.out.println("falei");
    }

    public String falar(String volume){
        return "falei" + volume;
    }

    // sobrescrita do método
   public void comer(){
        System.out.println("pessoa comeu");
    }


}
