class TestaConta2 { //ex 5.8
    public static void main (String[] args) {
    	//Atribuos conta:
    	//titular
    	//dataAbertura
   		//agencia
    	//numero
    	//saldo
    	
        //double valor = 20.0;

    	Conta2 c = new Conta2("Artur", 123, "123-4");
    	Conta2 c2 = new Conta2("Ana", 321, "432-1");
    	Data2 data = new Data2();

    	data.dia = 10;
    	data.mes = 10;
    	data.ano = 10;

    	c.deposita(100.0);
    	c.setDataAbertura(data);

        c2.deposita(50.0);
        c2.setDataAbertura(data);

/*
    	if (c.saca(valor))
    		System.out.println("Saquei " + valor);

    	c.deposita(valor * 2);
    	System.out.println("Agora fiquei com " + c.saldo);

    	System.out.println("A conta rende " + c.calculaRendimento());

    	valor = valor * 3;
    	if (c.transfere(valor, c2)) {
    		System.out.println("Transferi " + valor + " para c2, que ficou com " + c2.saldo + " e eu fiquei com " + c.saldo);
    	}
*/
    	//c = c2;

    	if (c == c2)
    		System.out.println("iguais.");
    	else
    		System.out.println("diferentes.");

    	System.out.println(c.recuperaDadosParaImpressao());
    }
}
