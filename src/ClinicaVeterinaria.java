import java.util.*;

public class ClinicaVeterinaria {
    
    public String nombre;
    public String cuit; // identificador fiscal
    public String telefono; 
    public String email; 

    //Es un atributo de tipo "Lista".
    //van siempre en PLURAL
    //Y se declara:
    //public List<Tipo> nombreVariablePlural; 
    //adicionalmente van a agregar = new ArrayList<>(); para que sea
    //una lista VACIA, es decir una lista con 0 elementos
    // el <> ess el operador Diamante/Diamond

    public List<Paciente> pacientes = new ArrayList<>();
    public int capacidadMaxima = 20; //Asigna un valor por defecto

   

    // Paciente paciente (de derecha a izquierda es parametro y nombre del parametro)
    
    public boolean hacerRevision(Paciente paciente){  

        //Nombre del parametro que es PACIENTE y tipo de
        //Parametro es PACIENTE
        //devuelve true si el paciente paso bien la revision
        //si no, false.

        System.out.println("Revisando al paciente "+paciente.nombre); 
        return true; 

    }


    //Esto seria una ACCION
    //devuelve true si lo pudo ingresar
    //false si no
    public boolean ingresar(Paciente paciente){
    
        //Size es un metodo

        if (this.pacientes.size() <  this.capacidadMaxima){
            this.pacientes.add(paciente);
            return true;
        }

        return false;

    }

    public void imprimirListadoPacientes(){

        System.out.println("   ");
        System.out.println("*LISTA DE PACIENTES*");
        System.out.println("  ");

        //for each paciente en pacientes
        //es un ciclo for especial
        //que permite iterar / recorrer listas
        //asignando a una variable antes del : el valor
        //de cada elemento.


        // tipo -> Paciente / variable -> paciente / pacientes que hay
        for (Paciente paciente : pacientes) {

            //Imprimo el atributo nombre del paciente
            System.out.println("Paciente Ingresado: "+paciente.nombre);

            System.out.println("***************************************");
            System.out.println("   ");
        }

        
    }


    //////////////////////////////////////    MEDICAMENTOS    //////////////////////////////////////


    public List <Medicamento> medicamentos = new ArrayList<>();
    public int capacidadInventario = 1000;

       //Controlar cantidad de medicamentos 

       public boolean controlarInventario(Medicamento medicamento){
        System.out.println("Realizando inventario" +medicamento.nombre);
        return true;
    } 


    public boolean ingresar(Medicamento medicamento){

        if (this.medicamentos.size() < this.capacidadInventario){
            this.medicamentos.add(medicamento);
            return true;
        }
        return false;
    } 
    
    public void imprimirListadoMedicamentos(){

        System.out.println(" ");
        System.out.println("*LISTA DE MEDICAMENTOS*");
        System.out.println("  ");
        
        //for each paciente en pacientes
        //es un ciclo for especial
        //que permite iterar / recorrer listas
        //asignando a una variable antes del : el valor
        //de cada elemento.


        // tipo -> Paciente / variable -> paciente / pacientes que hay
        for (Medicamento medicamento : medicamentos) {

            //Imprimo el atributo nombre del paciente
            System.out.println("Medicamento Ingresado: "+medicamento.nombre);
            
            System.out.println("***************************************");
            System.out.println("   ");
        }

        

        
    }
    

}
