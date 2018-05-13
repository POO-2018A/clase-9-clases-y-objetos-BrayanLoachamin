
package archivo;

import java.util.Date;
import java.util.GregorianCalendar;
/**
 *
 * @author BRAYAN LOACHAMIN
 */
public class Archivo {

    private String nombre;
    private String tipo;
    private Date fechaCreacion;
    private String contenido;
    
    public Archivo(String nombre, int año, int mes, int dia){
        this.nombre=nombre;
        GregorianCalendar  calendario = new GregorianCalendar (año, mes, dia);
        fechaCreacion=calendario.getTime();
    }
   
    public Archivo(String nombre, String tipo, int año, int mes, int dia){
        this.nombre=nombre;
        this.tipo=tipo;
        GregorianCalendar  calendario = new GregorianCalendar (año, mes, dia);
        fechaCreacion=calendario.getTime();
    }
    
    public String getNombre(){
		return nombre;
	}
    public String getTipo(){
		return tipo;
	}
    
    public Date getFechaCreacion(){
                return fechaCreacion;
    }
    
    public void setContenido(String contenido){
        this.contenido=contenido;
    }

    public static void main(String[] args) {
        Archivo a1 = new Archivo("Deberes",2017,12,31);
        
        System.out.println("  Ejemplo1");
        System.out.println("Nombre del archivo: "+a1.getNombre());
        System.out.println("Fecha de creacion: "+a1.getFechaCreacion());
        
        Archivo a2 = new Archivo("Talleres",".docx",2017,02,05);
        System.out.println("\n Ejemplo2 ");
        System.out.println("Nombre del archivo: "+a2.getNombre());
        System.out.println("Tipo de archivo: "+a2.getTipo());
        System.out.println("fecha de creacion :" +a2.getFechaCreacion());
           
    }
    
}
