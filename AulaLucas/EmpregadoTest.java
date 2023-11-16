package heranca;

public class EmpregadoTest {
	public static void main(String args[]) {
		EmpregadoComissionado objeto= new EmpregadoComissionado("Manuel","Chaves", "030.991.091-66" , 23890.4, 0.05);
		System.out.printf("Empregado: %s %s\n", objeto.getPrimeiroNome(), objeto.getUltimoNome());
		System.out.println("CPF: "+ objeto.getCpf());
		System.out.println("Total de Vendas: "+ objeto.getVendasBruta());
		System.out.println("Taxa de comissao: "+ objeto.getPorcentagemComissao());
		System.out.println("Salario: %.2f\n"+ objeto.salario());
	}

}
