package Aula04;

public class Conta {
	//atributos 
		String titular;
		String numConta;
		String agencia;
		double saldo;

		//poderiam existir metodos operacionais: depositar, sacar dinheiro

		//métodos acessores e modificadores = serve para manipular os dados dos atributos
		public void setTitular(String t){
			titular = t;	
		}

		public String getTitular() {
			return titular;
		}

		public void setNumConta (String nc) {
			numConta = nc;
		}

		public String getnumConta(){
			return numConta;
		}

		public void setAgencia(String a){
			agencia = a;
		}

		public String getAgencia(){
			return agencia;
		}

		public void setSaldo(double s){
			saldo = s;
		}
		public double getSaldo(){
			return saldo
		}


		//vamos testar a nossa classe acima
		public static void main(String[] args) {
			Conta c1 = new Conta ();
			c1.titular = "Nati";
			c1.numConta = "123-0";
			c1.agencia = "001-1";
			c1.saldo = 500;

			System.out.println("Titular: " + c1.titular);
			System.out.println("Conta: " + c1.numConta);
			System.out.println("Agência: " + c1.agencia);
			System.out.println("Saldo: " +c1.saldo);
		}
}
