public class Main {
    public static void main(String[] args) {
       // Aula de orientacao objetos
        // Declarar objetos
        pessoa adao;
        // Instanciar objetos

        adao = new pessoa();
        pessoa eva= new pessoa();

        // Definição do formato

        adao.nome = "Adão";
        adao.sobrenome = "Silva";
        eva.nome= "Eva";
        eva.sobrenome= "Silva";
        // Acionar comportamento

        adao.falar();
        eva.falar();

        // Criar mais objetos

        pessoa qualquer= new pessoa();
        // Declarar objeto
        pessoa rainha;

        // Instanciamento do objeto
        rainha = new pessoa();

        // Instanciação forma da pessoa
        rainha.nome = "Tina";
        rainha.sobrenome= "tunner";

        // Definição de comportamento
        System.out.println(rainha.falar("alto"));
        rainha.comer();


    }
}