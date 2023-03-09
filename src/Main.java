public class Main {
    public static void main(String[] args) {

        Funcionario diego = new Funcionario();

        diego.setNombre("Diego");
        diego.setDocumento("10025125");
        diego.setSalario(2000);
        Gerente gerente = new Gerente();
        gerente.setSalario(6000);

        System.out.println(diego.getBonificacion());
        System.out.println(gerente.getBonificacion());

    }
}