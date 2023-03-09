public abstract class Cuenta {
        protected double saldo;
        private int agencia;
        private int numero;
        private Cliente titular = new Cliente();
        private static int total;

    public Cuenta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public abstract void depositar (double valor);

    public boolean retirar (double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            System.out.println("No se pudo retirar");
            return false;
        }

    }

    public boolean transferir (double valor, Cuenta cuenta){
        if (valor <= this.saldo){
            this.retirar(valor);
            cuenta.depositar(valor);
            return true;
        }else{
            System.out.println("No se pudo hacer la transferencia");
            return false;
        }
    }
}
