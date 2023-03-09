public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario diego = new Funcionario();
        diego.setNombre("Diego");
        diego.setSalario(2000);

        Gerente jimena = new Gerente();
        jimena.setSalario(3000);

        Contador alexis = new Contador();
        alexis.setSalario(5000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();
        controlBonificacion.registrarSalario(diego);
        controlBonificacion.registrarSalario(jimena);
        controlBonificacion.registrarSalario(alexis);

    }
}
