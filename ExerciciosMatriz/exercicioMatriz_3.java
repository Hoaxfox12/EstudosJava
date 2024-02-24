package ExerciciosMatriz;

import java.util.Scanner;
//ESSE CODIGO É IDENTICO AO EXERCICIOS MATRIX 2 PORÉM USANDO FUNÇÕES
public class exercicioMatriz_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] matriz = new String[31][24];
        int numero = 0;

        do {  //Basicamente um loop do que se deseja fazer, é menos sensível do que usando loop while
            System.out.println(" AGENDA ");
            System.out.println(" 1 - Adicionar evento ");
            System.out.println(" 2 - Verficiar eventos por data e hora");
            numero = sc.nextInt();
            switch (numero){
                case 1:
                    criarEvento(sc, matriz);
                    break;
                case 2:
                    verificaEvento(sc, matriz);
                    break;
                case 0:
                    System.out.println("Afff");
                    break;
            }
        } while (numero != 0);

        sc.next();
    }



    private static void criarEvento(Scanner sc, String matriz [] []) {
           //Função para criar anotação
        boolean criaeventodata = false; //boolean para verificação de data válida
        boolean criaeventohora = false; //boolean para verificação de hora válida
        int data = 0;
        int hora = 0;

        while (!criaeventodata){
            System.out.println("Insira a data");
            data = sc.nextInt();
            if (data > 0 && data <= 31){
               criaeventodata = true;
            } else{
                System.out.println("Insira dia válido");
            }
        }

        while (!criaeventohora){
            System.out.println(" Insira a hora do evento ");
            hora = sc.nextInt();
            if (hora >= 0 && hora <= 23 ){
                criaeventohora = true;
            } else {
                System.out.println(" Insira horário válido ");
            }
        }

        data--;  //decréscimo para acompanhar a numeração
        hora--;

        matriz[data][hora] = sc.next();
        //em criaeventohora e criaeventodata, a data ([i} e hora ([j])
        // recebem valores em suas posições [31] e [24] e recebem texto (o recado)
    }

    private static void verificaEvento(Scanner sc, String matriz [] []) {
        System.out.println("Insira o dia que deseja verificar: ");
        int verificaEventoDia = sc.nextInt();  //inicialização de variável para verificar existencia de dia
        System.out.println("Insira a hora que deseja verificar: ");
        int verificaEventoHora = sc.nextInt(); //inicialização de variável para verificar existencia de hora

        verificaEventoHora--; //decréscimo para acompanhar a numeração
        verificaEventoDia--;

        String verify = matriz [verificaEventoDia][verificaEventoHora];
        //As posições do array preenchidas na outra na verificação são procuradas com base do imput do usuário
        //Se nas posições [i] e [j] forem achadas os números, é printado o valor textual delas

        if (verify != null){
            System.out.println(" Os compromissos são " + verify);
        } else {
            System.out.println(" TEM NADA AQUI");
        }
    }
}
