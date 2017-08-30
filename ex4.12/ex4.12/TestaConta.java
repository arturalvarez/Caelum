class TestaConta { //ex 4.12
    public static void main (String[] args) {
    	//Atribuos conta:
    	//titular
    	//dataAbertura
   		//agencia
    	//numero
    	//saldo
    	double valor = 20.0;

    	Conta c = new Conta("Artur", 123, "123-4");
    	Conta c2 = new Conta("Ana", 321, "432-1");
    	Data data = new Data();

    	data.dia = 10;
    	data.mes = 10;
    	data.ano = 10;

    	c.setTitular("Artur");
    	c.setNumeroConta(123);
    	c.setAgencia("123-4");
    	c.deposita(100.0);
    	c.setDataAbertura(data);//"29/08/17";

        c2.setTitular("Ana");
        c2.setNumeroConta(321);
        c2.setAgencia("432-1");
        c2.deposita(50.0);
        c2.setDataAbertura(data);//"29/08/17";

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
    	c = c2;

    	if (c == c2)
    		System.out.println("iguais.");
    	else
    		System.out.println("diferentes.");

    	System.out.println(c.recuperaDadosParaImpressao());
    }
}
