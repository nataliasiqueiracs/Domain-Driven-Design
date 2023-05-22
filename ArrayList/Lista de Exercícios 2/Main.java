package ListaExercicios2;

public class Main {
	public class ContaBancaria {
	    private int numero;
	    private double saldo;
	    private double limite;
	    private String titular;

	    public ContaBancaria(int numero, double saldo, double limite, String titular) {
	        this.numero = numero;
	        this.saldo = saldo;
	        this.limite = limite;
	        this.titular = titular;
	    }

	    public int getNumero() {
	        return numero;
	    }

	    public void setNumero(int numero) {
	        this.numero = numero;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public void setSaldo(double saldo) {
	        this.saldo = saldo;
	    }

	    public double getLimite() {
	        return limite;
	    }

	    public void setLimite(double limite) {
	        this.limite = limite;
	    }

	    public String getTitular() {
	        return titular;
	    }

	    public void setTitular(String titular) {
	        this.titular = titular;
	    }

	    public void depositar(double valor) {
	        saldo += valor;
	    }

	    public void sacar(double valor) {
	        if (valor > saldo + limite) {
	            System.out.println("Não é possível sacar um valor maior do que o limite da conta.");
	        } else {
	            saldo -= valor;
	        }
	    }
	}
}
