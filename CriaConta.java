package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); 
		primeiraConta.saldo = 200;
		System.out.println("Saldo: R$" + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Saldo: R$" + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Saldo: R$" + segundaConta.saldo);
		
		System.out.println("Primeira Conta tem R$"+ primeiraConta.saldo);
		System.out.println("Segunda Conta tem R$"+ segundaConta.saldo);
		
		 System.out.println(primeiraConta.agencia);
	     System.out.println(primeiraConta.numero);
	} 

}
