class Conta { //ex 4.12
    private String titular;
    private Data dataAbertura;
    private String agencia;
    private int numero;
    private double saldo; //coloca private para só ser possivel mexer no atributo saldo por meio dos métodos.
    private static int totalContas;//o static significa que o é um atributo da classe, enquanto os outros o específicos de um objeto.


    public Conta (String titular, int numero, String agencia) { //O construtor só é chamado uma única vez,
        this.titular = titular;                                 //no momento de construção do objeto.
        this.numero = numero;
        this.agencia = agencia;
        Conta.totalContas++;
    }
    //o construtor DEFAULT (new Conta()) é chamado caso seja sem parâmetros e só existe se não tiver
    //nenhum outro construtor especificado na classe. O DEFAULT deixa de existir a partir do momento
    //que escrevemos a especificação de um construtor como o acima.
    //caso quisermos utilizar ambos os construtores concomitantemente, temos que especificá-lo como abaixo:
    //
    //public Conta () {
    //    Conta.totalContas++;
    //}



    //métodos podemos chamar quantas vezes quisermos,
    //no momento que quisermos, desde que o objeto esteja construído.

    public boolean saca (double valor) { // com o public, TODAS as outras classes conseguem acessar os métodos.
        if (this.saldo >= valor) {
            this.saldo -= valor;
            this.aplicaTaxa();
            return true;
        }
        return false;
    }

    public void deposita (double valor) {
        if (valor >= 0) {
            this.saldo += valor;
            this.aplicaTaxa();
        }
    }

    public double getRendimento () {
        return this.saldo * 0.1;
    }

    public boolean transfere (double valor, Conta conta) {
        if (this.saca(valor)) {
            conta.saldo += valor;
            this.aplicaTaxa();
            return true;
        }
        return false;
    }

    public String recuperaDadosParaImpressao () {
        String dados;
        dados = "Titular da conta: " + this.titular;
        dados += "\nNumero da conta: " + this.numero;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nData de abertura da conta: " + this.dataAbertura.dataFormatada();
        dados += "\nSaldo: " + this.saldo;
        return dados;
    }

    public double getSaldo () {
        return this.saldo;
    }

    public String getTitular (){
        return this.titular;
    }

    public void setTitular (String titular) {
        this.titular = titular;
    }

    public void setNumeroConta (int numero) {
        this.numero = numero;
    }

    public void setAgencia (String agencia) {
        this.agencia = agencia;
    }

    public void setDataAbertura (Data data) {
        this.dataAbertura = data;
    }

    private void aplicaTaxa () {
        this.saldo -= 0.1;
    }

    public static int getTotalContas () {
        return Conta.totalContas; //Não usamos o "this" pq esse termo refere a um objeto, nomeamos a class direto, com "Conta".
    }
}

//se quiséssemos chamar o método getTotalContas, para imprimir, por exemplo, quantas contas têm,
//falamos syso(Conta.getTotalContas), pois não precisamos de um objeto pra chamá-lo. Por isso o static.