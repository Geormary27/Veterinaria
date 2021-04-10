import java.util.Date;

public class Empleado extends Persona {
   
    public int numeroDeLegajo;
    public String numeroDeCuil;
    public Date fechaDeingreso;
    public String diasDelTrabajo; //Lunes a Viernes / todos los campos (textos) libres van como String
    public String turnoDetrabajo; //Mañana/Tarde/Noche
    public String cbu;
    public double sueldo;

    public boolean esValidoCBU() {
        if (this.cbu.length()==23) {
            return true;
        }
        return false;
    }




}
