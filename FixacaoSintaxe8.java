class FixacaoSintaxe8 { //ex 3.13
    public static void main (String[] args) {
	int n = 8;
	for (int i = 1; i <= n; i++) {
	    for (int j = 1; j <= i; j++) {
		System.out.print(i * j + " ");
	    }
	    System.out.print("\n");
	}
    }
}
