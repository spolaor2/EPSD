/**
 * Created by p_aki_000 on 4/4/2016.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Você pode selecionar um dos seguintes comandos:/n");

    /* bind: Faz o cliente se conectar a outro servidor e muda o repositório corrente.
    Este comando recebe o nome de um repositório e obtém do serviço de
    nomes uma referência para esse repositório, que passa a ser o repositório
    corrente. */
        System.out.println("bind: Cliente irá se conectar a outro servidor e muda o repositório corrente");


    /* getp: Busca uma peça por código. A busca é efetuada no repositório corrente.
    Se encontrada, a peça passa a ser a nova peça corrente.*/
        System.out.println("getp: Busca uma peça por código. A busca é efetuada no repositório corrente.");

    /*addp Adiciona uma peça ao repositório corrente. A lista de subpeças corrente
    é usada como como lista de subcomponentes diretos da nova peça. (É só
    para isto que existe a lista de subpeças corrente.)*/
        System.out.println("addp: Adiciona uma peça ao repositório corrente.");


        System.out.println("showp: Mostra atributos da peça corrente.");
        System.out.println("listp: Lista as peças do repositório corrente.");
        System.out.println("addsubpart: Adiciona à lista de subpeças corrente n unidades da peça corrente.");
        System.out.println("clearlist: Esvazia a lista de subpeças corrente.");
        System.out.println("quit: Encerra a execução do cliente./n/n");
        System.out.println("Digite o comando que deseja realizar:");

        Scanner input = new Scanner(System.in);
        String comando = input.nextLine();

        switch (comando){
            case "bind":
                System.out.println("Esperado: bind\n Obtido: " + comando);
                break;

            case "getp":
                break;

            case "addp":
                break;

            case "showp":
                break;

            case "clearlist":
                break;

            case "addsubpart":
                break;

            case "listp":
                break;

            case "quit":
                System.exit(1);
                break;
        }
    }
}
