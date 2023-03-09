public class Main {
    public static void main(String[] args) {

        Funcionario diego = new Gerente();

        diego.setNombre("Diego");
        diego.setDocumento("10025125");
        diego.setSalario(2000);
        Gerente gerente = new Gerente();

        System.out.println(diego.getBonificacion());
        System.out.println(gerente.getBonificacion());

    }
}