public class Conta{
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -=  valor;
			return true;
		}
		else{
			return false;
		}	
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
		
	}
	
	public int getNumero() {
		return this.numero;
		
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("n�o poder valor menor ou igual a zero");
			return;
		}
		this.numero = numero;
		
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("n�o pode valor menor ou igual a zero");
			return;
			}
		this.agencia = agencia;
		
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
}