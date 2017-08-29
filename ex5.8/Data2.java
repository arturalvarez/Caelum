class Data2 { //ex 5.8
    int dia;
    int mes;
    int ano;

    public String dataFormatada () {
    	String data;
    	data = this.dia + "/" + this.mes + "/" + this.ano;
    	return data;
    }
}