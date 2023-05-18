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

    }
}