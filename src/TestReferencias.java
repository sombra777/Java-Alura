public class TestReferencias {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Diego");
        Gerente gerente = new Gerente();
        gerente.setNombre("Jimena");

        funcionario.setSalario(5000);
        gerente.setSalario(20000);
    }
}
