class DesafioFibonacci { //ex 3.14
    public static void main (String[] args) {
	int ant = 0;
	int prox = 1;
	System.out.println (ant);
	System.out.println (prox);
	while (ant < 100 && prox < 100) {
	    if (ant < prox) {
		ant = ant + prox;
		System.out.println (ant);
	    }
	    else {
		prox = ant + prox;
		System.out.println (prox);
	    }
	}
    }
}
