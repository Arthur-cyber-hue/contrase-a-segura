import java.util.Scanner;

public class ContrasenaSegura {

    /**
     Presentado por:
     Carlos Andrés Reyes Figueredo
     Luis Arturo Diaz Torres
     */
    public static boolean esSegura(String password) {
        if (password.length() < 10) {
            return false;
        }
        boolean tieneLetra = false;
        boolean tieneDigito = false;
        boolean tieneSimbolo = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                tieneLetra = true;
            }
            else if (c >= '0' && c <= '9') {
                tieneDigito = true;
            }
            else {
                tieneSimbolo = true;
            }
        }
        return tieneLetra && tieneDigito && tieneSimbolo;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PROGRAMA: VALIDACIÓN DE CONTRASEÑA SEGURA ===");
        System.out.print("Ingrese la contraseña que desea verificar: ");
        String contrasena = scanner.nextLine();

        boolean resultado = esSegura(contrasena);

        System.out.println("\n--- RESULTADO DE LA EVALUACIÓN ---");
        if (resultado) {
            System.out.println("La contraseña \"" + contrasena + "\" es SEGURA.");
        } else {
            System.out.println("La contraseña \"" + contrasena + "\" NO es segura.");
            System.out.println("\nCondiciones requeridas:");
            System.out.println("- Longitud actual: " + contrasena.length() + " (mínimo requerido: 10)");
            System.out.println("- Debe contener al menos una letra, un número y un símbolo.");
        }

        scanner.close();
    }
}