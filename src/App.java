
public class App {
    public static void main(String[] args) throws Exception {
        
        //en este caso creo la variable local "michi" (variables local 
        //son variables sueltas que se usan para hacer cosas)
        //de tipo Paciente
        //le asigno nombre michi (michi es una 
        //variable local)


        // CLINICA VETERINARIA //

        ClinicaVeterinaria vete = new ClinicaVeterinaria();
        vete.nombre = "Pupis";

        // GATOS //

        Paciente michi = new Paciente();  
        // Lo amarillo es LA CLASE 
        //Esto es instanciar, ES UN OBJETO NUEVO
        // A PARTIR DE UNA CLASE
        // POR ESO EL NEW
        michi.nombre = "Mabel";
        michi.especie = "gati";
    

        vete.ingresar(michi);


        Paciente minina = new Paciente();
        //MININA SOLA es el nombre de la referencia minina
        //minina.nombre es el nombre de minina
        minina.nombre = "Minina";
        minina.especie = "gati";
    

        vete.ingresar(minina);


        Paciente agatha = new Paciente();
        agatha.nombre = "Agatha";
        agatha.especie = "gati"; 


        vete.ingresar(agatha);


        // PERRO // 

        Paciente perrito = new Paciente();
        perrito.nombre = "Rubencio";
        perrito.especie = "perrito";


        vete.ingresar(perrito);


        Paciente catrina = new Paciente();
        catrina.nombre = "Catrina";
        catrina.especie = "perrito";


        vete.ingresar(catrina);


        Paciente otelo = new Paciente();
        otelo.nombre = "Otelo";
        otelo.especie = "perrito";


        vete.ingresar(otelo);


        //Cuando no se instancia, al ejecutar se rompe el programa
        //generando un NullPointerException 
        //Es un error de ejecuccion o de semantica 

        // CLIENTE - Dueño // 

        Cliente dueño1 = new Cliente();
        dueño1.nombre = "Pedro";
        michi.dueño = dueño1;
        dueño1.direccion = "Av. Jujuy 5000";

        Cliente dueño2 = new Cliente();
        dueño2.nombre = "Teresa";
        minina.dueño = dueño2; 
        dueño2.direccion = "Los Magallanes 1508";

        Cliente dueño3 = new Cliente ();
        dueño3.nombre = "María";
        agatha.dueño = dueño3;
        dueño3.direccion = "Juncal 7409";

        Cliente dueño4 = new Cliente ();
        dueño4.nombre = "Juan";
        perrito.dueño = dueño4;
        dueño4.direccion = "Venezuela 4050";

        Cliente dueño5 = new Cliente ();
        dueño5.nombre = "Geormary";
        catrina.dueño = dueño5;
        dueño5.direccion = "Beruti 7000";

        Cliente dueño6 = new Cliente ();
        dueño6.nombre = "Dalij";
        otelo.dueño = dueño6; 
        dueño6.direccion = "Beruti 7500";

        // MEDICAMENTOS PARA GATOS // 

        
        Medicamento medica = new Medicamento();
        medica.nombre = "Inflavet";
        medica.tipo = "Antiinflamatorio";

        vete.ingresar(medica);

        Medicamento comfortis = new Medicamento();
        comfortis.nombre = "Comfortis";
        comfortis.tipo = "Mata Pulgas";

        vete.ingresar(comfortis);

        Medicamento frontline = new Medicamento();
        frontline.nombre = "Frontline Plus";
        frontline.tipo = "Antiparasitario";   
        
        vete.ingresar(frontline);


        // MEDICAMENTOS PARA PERROS //
    

        Medicamento albendazol = new Medicamento();
        albendazol.nombre = "Albendazol";
        albendazol.tipo = "Antiparasitario";

        vete.ingresar(medica);

        Medicamento bravecto = new Medicamento();
        bravecto.nombre = "Bravecto";
        bravecto.tipo = "Protector de infecciones";

        vete.ingresar(medica);

        Medicamento doxicilina = new Medicamento();
        doxicilina.nombre = "Doxicilina";
        doxicilina.tipo = "Antibiótico";

        vete.ingresar(medica);


        // IMPRIMIR //


        System.out.println(" ");
        System.out.println("* LISTA DE PACIENTES FELINOS *");
        System.out.println(" ");

        System.out.println("El nombre del primer paciente es: " +michi.nombre);
        System.out.println("Nombre del dueño: " +michi.dueño.nombre+ " / Dirección: "+dueño1.direccion);
        System.out.println("Medicamento a proporcionar al paciente: " +medica.nombre+ " antiinflamatorio");
        System.out.println(" ");

        System.out.println("El nombre del segundo paciente es: " +minina.nombre);
        System.out.println("Nombre del dueño: "+minina.dueño.nombre+ " / Dirección: "+dueño2.direccion);
        System.out.println("Medicamento a proporcionar al paciente: " +comfortis.nombre+ " mata pulgas");
        System.out.println(" ");

        System.out.println("El nombre del tercer paciente es: "+agatha.nombre);
        System.out.println("Nombre del dueño: "+agatha.dueño.nombre+ " / Dirección: "+dueño3.direccion);
        System.out.println("Medicamento a proporcionar al paciente: "+frontline.nombre+ " antiparasitario");

        System.out.println(" ");
        System.out.println("* LISTA DE PACIENTES CANINOS *");
        System.out.println(" ");

        System.out.println("El nombre del cuarto paciente es: "+perrito.nombre);
        System.out.println("Nombre del dueño: "+perrito.dueño.nombre+ " / Dirección: "+dueño4.direccion);
        System.out.println("Medicamento a proporcionar al paciente: "+albendazol.nombre+ " antiparasitario");
        System.out.println(" ");

        System.out.println("El nombre del quinto paciente es: "+catrina.nombre);
        System.out.println("Nombre del dueño: "+catrina.dueño.nombre+ " / Dirección: "+dueño5.direccion);
        System.out.println("Medicamento a proporcionar al paciente: "+bravecto.nombre+ " protector de infecciones");
        System.out.println(" ");

        System.out.println("El nombre del sexto paciente es: "+otelo.nombre);
        System.out.println("Nombre del dueño: "+otelo.dueño.nombre+ " / Dirección: "+dueño6.direccion);
        System.out.println("Medicamento a proporcionar al paciente: "+doxicilina.nombre+ " antibiótico");
        System.out.println(" ");


        //agatha.dueño.generarPalabraSecreta(); 

        
        





    }





}
