class BalancoTrimestral { // ex 3.3
    public static void main (String[] args) {
        int gastosJaneiro = 15000;
	int gastosFevereiro = 23000;
	int gastosMarço = 17000;
	int gastosTrimestre;
	double mediaMensal;
	gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarço;
	mediaMensal = (double) gastosTrimestre / 3;
	System.out.println("Gastos do trimestre = " + gastosTrimestre);
	System.out.println("Valor de média mensal = " + mediaMensal);        
    }
}
