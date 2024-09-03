public class Main {
    public static void main(String[] args) {

        int primeiroNumero = 0;
        int segundoNumero;
        int soma;

        segundoNumero = 1;
        for(int i = 0; i < 10; i++) {
            soma = primeiroNumero + segundoNumero;
            System.out.println(soma);

            segundoNumero = primeiroNumero;
            primeiroNumero = soma;
        }
    }
}