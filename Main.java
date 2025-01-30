import cuentas.Cuenta;

public class Main {

    public static void main(String[] args) {
        Cuenta CuentaYousef;
        int variableextraida1 = 600;
        int variableextradida2 = 2000;
        double ingreso = variableextraida1;
        double retiro = variableextradida2;

        CuentaYousef = new Cuenta("Antonio López", "1000-2365-85-1230456789", 2500);
        System.out.println(CuentaYousef.toString());
        System.out.println("\nEl saldo actual es: " + CuentaYousef.getSaldo());

        operativaCuenta2(CuentaYousef, retiro);
        try {
            System.out.println("Ingresamos " + ingreso + " en cuenta");
            CuentaYousef.ingresar(ingreso);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

        System.out.println("El saldo actual es: " + CuentaYousef.getSaldo());
    }

    private static void operativaCuenta2(Cuenta CuentaYousef, double retiro) {
        try {
            System.out.println("Retiramos " + retiro + " en cuenta");
            CuentaYousef.retirar(retiro);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
            //yousef
        }
    }
}
