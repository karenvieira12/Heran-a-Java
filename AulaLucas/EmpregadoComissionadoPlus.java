public class EmpregadoComissionado Plus extends Empregado Comissionado { 
  private double salarioBase;

  public EmpregadoComissionado Plus (double salario, String primeiroNome, 
          String ultimo Nome, String CPF, 
          double vendabruto, double taxa) {
          super (primeiro Nome, ultimoNome, CPF, vendabruto, taxa);
        set SalarioBase (salario);
   }
public void setSalarioBase (double salario) {
  salarioBase (salario < 0.0)70.0: salario;
}
public double getSalarioBase () {
  return salarioBase;
}
Override

public double Salario () { //sobrescrevendo o metodo da superclasse
  return salarioBase + (super.getTaxaComissao() * super.getVendaBruta()); 
}

}
