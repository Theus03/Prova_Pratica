/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Avaliação_1;

/**
 *
 * @author Matheus
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Avaliação_Prática {
    public static void main(String[] args){
       Scanner ent = new Scanner(System.in);
       System.out.println("=========================================");
       System.out.println("            MENU PRINCIPAL");
       System.out.println("=========================================");
       System.out.println("EXERCÍCIOS: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
       System.out.println("DIGITE [0] PARA PARAR");
       System.out.println("==========================================");
       System.out.print("QUAL EXERCÍCIO VOCÊ QUER EXECUTAR:");  
       int ex = ent.nextInt();
       switch(ex){
           case 0: break;
           case 1: av1();
              break;
           case 2: av2();
              break;
           case 3: av3();
              break;
           case 4: av4();
              break;
           case 5: av5();
              break;
           case 6: av6();
              break;
           case 7: av7();
              break;
           case 8: av8();
              break;
           case 9: av9();
              break;
           case 10: av10();
              break;
       } 
}
    private static void av1() {
        Scanner entrada = new Scanner(System.in);
        String sx;
        System.out.print("Informe seu sexo [M/F]:");
        sx = entrada.nextLine();
        System.out.print("Digite sua idade:");
        int ano = entrada.nextInt();
        System.out.print("Digite sua altura:");
        double alt = entrada.nextDouble();
        System.out.print("Digite seu peso:");
        double peso = entrada.nextDouble();
        if ("M".equals(sx)){
            double gebm;
            gebm = 66.47 + (13.75 * peso) + (5 * alt) - (6.76 * ano);
            System.out.println("Seu GEB é: "+ gebm);
        }
        else if("F".equals(sx)){
            double gebf;
            gebf = 665.1 + (9.56 * peso) + (1.85 * alt) - (4.67 * ano);
            System.out.println("Seu GEB é: "+ gebf);
        }
    }
    
    private static void av2(){
      int n = 0,resto1,resto2,div1,div2;
      String centena="",dezena="",unidade="";
      System.out.print("Digite um numero entre 0 e 999: ");
      Scanner scanner = new Scanner(System.in);    
      n = scanner.nextInt();
        resto1 = n%100;
        div1 = n/100;
        resto2 = resto1%10;
        div2 = resto1/10;
        switch(div1){
            case 1 : centena = "cento"; break;
            case 2 : centena = "duzentos"; break;
            case 3 : centena = "trezentos"; break;
            case 4 : centena = "quatrocentos"; break;
            case 5 : centena = "quinhentos"; break;
            case 6 : centena = "seiscentos"; break;
            case 7 : centena = "setecentos"; break;
            case 8 : centena = "oitocentos"; break;
            case 9 : centena = "novecentos"; break;
        }
        if(resto1 !=0 && resto1>10 && resto1<20) {
        switch(resto1){
            case 11: dezena = "onze"; break;
            case 12: dezena = "doze"; break;
            case 13: dezena = "treze"; break;
            case 14: dezena = "quatorze"; break;
            case 15: dezena = "quinze"; break;
            case 16: dezena = "dezesseis"; break;
            case 17: dezena = "dezessete"; break;
            case 18: dezena = "dezoito"; break;
            case 19: dezena = "dezenove"; break;
        }
        }else{
            switch(div2){
                case 1 : dezena = "dez"; break;
                case 2 : dezena = "vinte"; break;
                case 3 : dezena = "trinta"; break;
                case 4 : dezena = "quarenta"; break;
                case 5 : dezena = "cinquenta"; break;
                case 6 : dezena = "sessenta"; break;
                case 7 : dezena = "setenta"; break;
                case 8 : dezena = "oitenta"; break;
                case 9 : dezena = "noventa"; break;
        }
        }
        if(resto1>=20 || n<10 || resto1<10){
            switch(resto2){
                case 1 : unidade = "um"; break;
                case 2 : unidade = "dois"; break;
                case 3 : unidade = "tres"; break;
                case 4 : unidade = "quatro"; break;
                case 5 : unidade = "cinco"; break;
                case 6 : unidade = "seis"; break;
                case 7 : unidade = "sete"; break;
                case 8 : unidade = "oito"; break;
                case 9 : unidade = "nove"; break;
            }
    }if(n==0)
    System.out.println("zero");
    else if (n <= 999)if(n==100){
        System.out.println("cem");
    }
    else if(n>100 && resto1<10 && resto1!=0){
        System.out.println(centena + " e " + unidade); 
    }
    else if(n>100 && resto1 ==0){
        System.out.println(centena);
    }
    else if(n>100 && resto1 !=0 && resto2 !=0 && resto1>=20){
        System.out.println(centena + " e " + dezena + " e " + unidade);
    }
    else if(n>100 && resto1 !=0 && resto2 ==0){
        System.out.println(centena + " e " + dezena);
    }
    else if(n>100 && resto1 !=0){
        System.out.println(centena + " e "+ dezena);
    }                                                        
    else if(n<100 && resto1 !=0 && resto2 ==0){
        System.out.println(dezena);
    }
    else if(n>20 && resto1 !=0 && resto2 !=0){
        System.out.println(dezena + " e " + unidade);
    }
    else if(n<10){
        System.out.println(unidade);
    }
    else{
        System.out.println(dezena);
    }
    else {
        System.out.println("O programa só aceita até 999.");
      }                                                               
    }

    private static void av3() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número:");
        int a = entrada.nextInt();
        System.out.print("Digite o segundo número:");
        int b = entrada.nextInt();
        System.out.println("Seu primeiro valor é " + a);
        System.out.println("Seu segundo valor é " + b);
        if(a % b == 0){
            System.out.print("São Múltiplos!");
        }
        else{
            System.out.print("Não são Múltiplos!");
        }
    }
    private static void av4(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número:");
        int i = entrada.nextInt();
        System.out.print("Digite o segundo número:");
        double a = entrada.nextDouble();
        System.out.print("Digite o terceiro número:");
        double b = entrada.nextDouble();
        System.out.print("Digite o quarto número:");
        double c = entrada.nextDouble();
        if (i == 1){
            if (a > b && a > c && b > c){
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            }  
            else if(a > b && a > c && c > b){
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            }
            else if (b > a && b > c && a > c){
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }    
            else if(b > a && b > c && c > a){
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            }
            else if (c > a && c > b && a > b){
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            }   
            else if(c > a && c > b && b > a){
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
        }
        if (i == 2){
            if(a < b && a < c && b < c){
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);    
            }
            else if(a < b && a < c && c < b){
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);    
            }
            else if(b < a && b < c && a < c){
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }
            else if(b < a && b < c && c < a){
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            }
            else if(c < a && c < b && b < a){
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
            else if(c < a && c < b && a < b){
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            }
        }
        else{
            System.out.println("Fim de Exercício....");
        }
}

    private static void av5() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe quantas horas extras você trabalhou:");
        double hext = entrada.nextDouble();
        System.out.print("Digite quantas horas você faltou no trabalho:");
        double hfal = entrada.nextDouble();
        double h = (hext) - (2/3 * (hfal));
        if (h >= 2400){
            System.out.println("Você trabalhou extra "+ hext);
            System.out.println("Você faltou em hora extra "+ hfal);
            System.out.println("Seu prêmio é de R$500."); 
        }
        else if (h >= 1801 && h <= 2400){
            System.out.println("Você trabalhou extra "+ hext);
            System.out.println("Você faltou em hora extra "+ hfal);
            System.out.println("Seu prêmio é de R$400.");
        }
        else if(h >= 1201 && h <= 1800){
            System.out.println("Você trabalhou extra "+ hext);
            System.out.println("Você faltou em hora extra "+ hfal);
            System.out.println("Seu prêmio é de R$300.");
        }
        else if(h >= 600 && h <= 1200){
            System.out.println("Você trabalhou extra "+ hext);
            System.out.println("Você faltou em hora extra "+ hfal);
            System.out.println("Seu prêmio é de R$200.");
        }
        else if(h <= 600){
            System.out.println("Você trabalhou extra "+ hext);
            System.out.println("Você faltou em hora extra "+ hfal);
            System.out.println("Seu prêmio é de R$100.");
        }
    }

    private static void av6() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um horário entre [0 e 24h]:");
        int he = entrada.nextInt();
        if(he <= 18 && he >= 0){
           int hs = he + 6;
           System.out.println("Seu horário de saída é "+ hs + " horas");
        }
        else if(he >= 19 && he <= 24){
            int hsaida = he - 18;
            System.out.println("Seu horário de saída é "+ hsaida + " horas");
        }
        else{
            System.out.println("Número Inválido!");
        }
    }

    private static void av7() {
        Scanner ent = new Scanner(System.in);
        float i = 0;
        float tam = 1;
        float numI = 1;
        
        do{
          System.out.print("Insira números:");
          numI = ent.nextInt();
          tam += numI;
          i++;
        }
        while(numI >= 0);
        System.out.println("A média é "+"\n"+tam/(i-1));
}
    private static void av8() {
       Scanner entrada = new Scanner(System.in);
       String ped;
       int cont = 0;
       double tot = 0;
       while(true){
            System.out.println("*****************************************");
            System.out.println("            CARDÁPIO");
            System.out.println("*****************************************");
            System.out.println("Código -   Opção -         Preço");
            System.out.println("  C -   Cachorro Quente - R$ 2,00");
            System.out.println("  R -   Refrigerante -    R$ 2,50");
            System.out.println("  S -   Sobremesa -       R$ 1,50");
            System.out.println("  X -   Encerra Pedido -  --------");  
            System.out.print("Faça seu pedido:");
            ped = entrada.nextLine();
            double np;
        char op = ped.charAt(0);
            
        switch(op){
            case 'C': System.out.println("Seu pedido foi um Cachorro Quente"); 
            System.out.println("PREÇO: R$2,00");
            cont += 1;
            np = 2 + cont;
            tot += np - cont;
            break;
            case 'R': System.out.println("Seu pedido foi um Refrigerante");
            System.out.println("PREÇO: R$2,50");
            cont += 1;
            np = 2.50 + cont;
            tot += np - cont;
            break;
            case 'S': System.out.println("Seu pedido foi uma Sobremesa");
            System.out.println("PREÇO: R$1,50");
            cont += 1;
            np = 1.50 + cont;
            tot += np - cont;
            break;
           }
        if("X".equals(ped)){
            System.out.println("Pedido Encerrado!");
            System.out.print("Preço total é de R$"+tot);
            break;
        }
        }
    }
    private static void av9() {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        int i = 1;
        System.out.print("Insira um número:");
        int n = entrada.nextInt();
        while (i <= n){
            soma = soma + i;
            i = i +1;
        }
        System.out.println("A soma dos " + n + " primeiros positivos é " + soma);
    }

    private static void av10() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar:");
        int qnt = entrada.nextInt();
        while(qnt == qnt){
            System.out.print("Insira números:");
            int num = entrada.nextInt();
            if(qnt == qnt){
                if(num % 2 == 0){
                    int qntP = (num = 0);
                    int numP = (num = 0);
                    if(num == 2){
                        int soma = numP + qntP ;
                        System.out.print("A soma é "+soma);
                    }
                    else{
                        System.out.print("NÃO É PRIMO!");
                    }
            break;
                }
            else if(num % 3 == 0){
                if (num == 3){
                System.out.print("É PRIMO!");
                }
                else{
                    System.out.print("NÃO É PRIMO!");
                }
            }
            else if(num % 5 == 0){
                if(num == 5){
                    System.out.print("É PRIMO!");
                }
                else{
                    System.out.print("É PRIMO!");
                }
            }
            }
            }
        while(qnt != qnt){
            break;
        }
    }
}