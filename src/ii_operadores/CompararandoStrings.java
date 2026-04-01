package ii_operadores;

public class CompararandoStrings {
    public static void main(String[] args) {

        String nome1 = "Rafinha";
        String nome2 = "Rafinha";
        String nome3 = new String("Rafinha");
        
        // Comparação
        String r1 = (nome1==nome2)?"iguais":"diferentes";
        System.out.println(r1);

        String r2 = (nome1==nome3)?"iguais":"diferentes"; //Apesar do conteúdo igual, estrutura diferente
        System.out.println(r2);

        String r3 = (nome1.equals(nome3))?"iguais":"diferentes"; //metodo .equals() usado para comparar o conteúdo dentro da var
        System.out.println(r3);



    }
}
