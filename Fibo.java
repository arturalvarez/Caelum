class Fibo { // ex 4.13
    String sequencia;
    int soma;

    public void calculaFibonacci (int v1, int v2, int limite) {
        System.out.println("passei aki");
        if (v2 == 0) {
            sequencia += v1 + " - " + v2;
            calculaFibonacci (0, 1, limite);
            return;
        }
        soma = v1 + v2;
        if (soma <= limite) {
            sequencia += " - " + soma;
            calculaFibonacci (v2, soma, limite);
        }
        return;
    }

}

class FiboTesta {
    public static void main (String[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println("aloalo");
        fib.calculaFibonacci(0, 0, 13);
        System.out.println(fib.sequencia);
    }
}