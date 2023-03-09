public class SistemaInterno {

    private String clave = "AluraCurso";
    public boolean autentica (FuncionarioAutenticable gerente) {
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if (puedeIniciarSesion){
            System.out.println("Login exitoso");
            return true;
        }else {
            System.out.println("Usuario o Contraseña Incorrectos");
            return false;
        }
    }
}
