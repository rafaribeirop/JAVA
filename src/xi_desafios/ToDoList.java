package xi_desafios;
import java.util.Scanner;
import java.util.ArrayList;
public class ToDoList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        int resp;
        do {
            //Menu inicial
            System.out.println("----- Lista de tarefas -----");
            System.out.println("[1] Adicionar");
            System.out.println("[2] Listar");
            System.out.println("[3] Remover");
            System.out.println("[0] Sair");
            resp = sc.nextInt();
            sc.nextLine();

            switch (resp) {
                case 1:
                    String tarefa;
                    do {
                        System.out.println("Adicionar: (Digite '0' para parar)");
                        tarefa = sc.nextLine();
                        if (!tarefa.equals("0")){
                            tarefas.add(tarefa);
                        }
                    } while (!tarefa.equals("0"));
                    // Mostrar as tarefas depois de adicionar
                    for (String t : tarefas) {
                        System.out.println("[ ] " + t);
                    }
                    break;
                case 2:
                    //Apenas listar as tarefas
                    System.out.println("Tarefas");
                    for (String t : tarefas) {
                        System.out.println("[ ] " + t);
                    }
                    break;
                case 3:
                    //Remover a tarefas
                    System.out.println("Digite o NÚMERO da tarefa que deseja remover: ");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println(" - (" + i + ") " + tarefas.get(i) + " -");
                    }
                    int removerTarefa = sc.nextInt();
                    sc.nextLine();
                    tarefas.remove(removerTarefa);
                    for (String t : tarefas) {
                        System.out.println("[ ] " + t);
                    }
                    break;
            }

        }while (resp != 0);
    }
}
