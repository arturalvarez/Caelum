import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Tributavel;

public class TestaTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100.0);
		System.out.println("1 " + cc.getValorImposto());
		
		//testando polimorfismo;
		Tributavel t = cc;
		System.out.println("2 " + t.getValorImposto());
		System.out.println("3 " + cc.getSaldo());
	}
}
