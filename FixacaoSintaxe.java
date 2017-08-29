class FixacaoSintaxe { //ex 3.13
    public static void main (String[] args) {
	int i;
	int soma = 0;
	long fat = 1;
	int fib[] = new int[100];
	int num = 2;
	System.out.println("---Numeros de 150 a 300:"); // 1
	for (i = 150; i <= 300; i++)
	    System.out.println(i);
	System.out.println("---Soma de 1 até 1000:"); // 2
	for (i = 1; i <= 1000; i++)
	    soma = soma + i;
	System.out.println(soma);
	System.out.println("---Múltiplos de 3, entre 1 e 100:"); // 3
	for (i = 1; i <= 100; i++) {
	    if (i % 3 == 0)
		System.out.println(i + " é múltiplo de 3.");
	}
	System.out.println("---Fatoriais de 1 a 10:"); // 4 e 5
	for (long a = 1; a <= 20; a++) {
	    for (long j = a; j > 0; j--) 
		fat = fat * j;
	    System.out.println("O fatorial de " + a + " é " + fat);
	    fat = 1;
	}
	System.out.println("---Série de Fibonacci:"); // 6
	for (i = 0; i < 100; i++)
	    fib[i] = -1;
	fib[0] = 0;
	fib[1] = 1;
	while (fib[num - 1] < 100) {
	    fib[num] = fib[num - 1] + fib[num - 2];
	    System.out.println("o Fibonacci da posição " + num + " é " + fib[num]);
	    num++;
	}
	
    }
}
