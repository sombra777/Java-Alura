public class TestGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNombre("Pedro");
        gerente.setSalario(5000);
        gerente.setTipo(1);
        gerente.setClave("AluraCurso");

        System.out.println(gerente.iniciarSesion("AluraCurso"));
    }
}
