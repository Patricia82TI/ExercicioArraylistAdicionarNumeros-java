import java.util.ArrayList;
import java.util.Scanner;

//Faça um programa que adicione números inteiros num arraylist até o número digitado
//ser -1. Depois imprima o arraylist lido na tela
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int valorLido = 0;

        //Enquanto usuário digitar valores diferentes de -1
        while(valorLido != -1) {
            //Lê o valor do usuário
            System.out.println("Digite um valor");
            valorLido = sc.nextInt();

            //Só adiciona o valor ao arraylist se ele não for -1
            if (valorLido != -1) {
                listaDeNumeros.add(valorLido);
            }
        }

        //Imprime o arraylist
        for (int i = 0; i < listaDeNumeros.size(); i++){
            System.out.println(listaDeNumeros.get(i));
        }
    }
}