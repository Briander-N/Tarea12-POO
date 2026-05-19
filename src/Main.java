//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;

Scanner sc =  new Scanner(System.in);
ArrayList<Persona> personas = new ArrayList<>();

void main() {



    int opcion = 0;

    do{
        try{
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Registrar persona");
            System.out.println("2. Mostrar registros");
            System.out.println("3. Actualizar registro");
            System.out.println("4. Eliminar registro");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){
                case 1:
                    registrarPersona();
                    break;

                case 2:
                    mostrarRegistros();
                    break;

                case 3:
                    actualizarRegistro();
                    break;

                case 4:
                    eliminarRegistro();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Error: opcion invalida.");
            }
        } catch (Exception e) {
            System.out.println("Error: debe ingresar solo numeros.");
            sc.nextLine();

        }
    }while(opcion != 5);

}
/*////////////////////////////////////////////////////////////////////////////////////////////////////*/
/*//////////////////////////////////////////////METODOS///////////////////////////////////////////////*/
