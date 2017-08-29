class Data { //ex 4.12
    int dia;
    int mes;
    int ano;

    public String dataFormatada () {
    	String data;
    	data = this.dia + "/" + this.mes + "/" + this.ano;
    	return data;
    }
}