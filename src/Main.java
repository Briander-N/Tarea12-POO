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
/*/////////////////////////////////////////////FUNCIONES//////////////////////////////////////////////*/

public void registrarPersona(){
    try{
        System.out.println("\n");
        System.out.println("1.Estudiante");
        System.out.println("2.Docente");
        System.out.println("Selecciona tipo: ");

        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese cedula: ");
        String cedula = sc.nextLine();

        if(cedula.isEmpty()){
            System.out.println("Este campo no puede estar vacio!!");
            return;

        }

        for(Persona p : personas){
            if (p.getCedula().equals(cedula)) {
                System.out.println("Cedula ya registrada.");
                return;
            }
        }

        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();

        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede quedar vacio!.");
            return;
        }

        System.out.println("Ingrese edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        if(tipo == 1){
            System.out.print("Ingrese carrera: ");
            String carrera = sc.nextLine();

            if (carrera.isEmpty()) {
                System.out.println("Campo obligatorio.");
                return;
            }

            Estudiante est = new Estudiante(
                    cedula,
                    nombre,
                    edad,
                    carrera
            );

            personas.add(est);

            System.out.println("Estudiante registrado correctamente.");

        } else if (tipo == 2) {

            System.out.print("Ingrese asignatura: ");
            String asignatura = sc.nextLine();
            if (asignatura.isEmpty()) {
                System.out.println("Campo obligatorio.");
                return;
            }
            Docente doc = new Docente(
                    cedula,
                    nombre,
                    edad,
                    asignatura
            );

            personas.add(doc);
            System.out.println("Docente registrado correctamente.");

        } else {
            System.out.println("Tipo invalido.");
        }

    } catch (Exception e){
        System.out.println("Error al ingresar datos!");
    }
}

/*////////////////////////////////////////////////////////////////////////////////////////////////////*/
/*//////////////////////////////////////////////MOSTRAR///////////////////////////////////////////////*/

public void mostrarRegistros(){
    if (personas.isEmpty()) {

        System.out.println("No existen registros.");
        return;
    }
    System.out.println("\n===== LISTA DE PERSONAS =====");

    for (int i = 0; i < personas.size(); i++) {
        System.out.println("\nRegistro #" + i);
        personas.get(i).mostrarDatos();
        System.out.println("------------------------");
    }
}

/*////////////////////////////////////////////////////////////////////////////////////////////////////*/
/*//////////////////////////////////////////////ACTUALIZAR///////////////////////////////////////////////*/

public void actualizarRegistro(){
    if (personas.isEmpty()) {
        System.out.println("No existen registros.");
        return;
    }
    try{
        mostrarRegistros();
        System.out.print("Ingrese posicion a actualizar: ");
        int pos = sc.nextInt();
        sc.nextLine();
        if (pos < 0 || pos >= personas.size()) {

            System.out.println("Registro no encontrado.");
            return;
        }
        System.out.println("\n1. Estudiante");
        System.out.println("2. Docente");
        System.out.print("Seleccione nuevo tipo: ");
        int tipo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nueva cedula: ");
        String cedula = sc.nextLine();
        System.out.print("Nuevo nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Nueva edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        if (tipo == 1) {
            System.out.print("Nueva carrera: ");
            String carrera = sc.nextLine();
            Estudiante est = new Estudiante(
                    cedula,
                    nombre,
                    edad,
                    carrera
            );

            personas.set(pos, est);

        } else if (tipo == 2) {

            System.out.print("Nueva asignatura: ");
            String asignatura = sc.nextLine();

            Docente doc = new Docente(
                    cedula,
                    nombre,
                    edad,
                    asignatura
            );

            personas.set(pos, doc);

        } else {

            System.out.println("Tipo invalido.");
            return;
        }
        System.out.println("Registro actualizado correctamente.");
    } catch (Exception e) {
        System.out.println("Error al actualizar.");
        sc.nextLine();

    }
}

