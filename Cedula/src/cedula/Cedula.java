package cedula;

/**
 *
 * @author BRAYAN LOACHAMIN
 */
public class Cedula {

    
    private String cedula;
    private String cedulaComp; // almacena la cedula completa despues de verificarla

    Cedula(){}

    
    Cedula(String cedula) {
        
        this.cedula = cedula;
        
    }

    public String getCedula() {

        return cedula;
    }

       public void setCedula(String cedula){
        if (cedulaValida(cedula)){
            this.cedula=cedula;
        }else{
            System.out.println("Cedula no valida");
        }
    }
   
    private boolean cedulaValida(String cedula){

        int coeficientes[]={2,1,2,1,2,1,2,1,2};
        int ced[]={0,0,0,0,0,0,0,0,0};
        int aux=0; //esta variable nos permite usar las operaciones
        int acu=0; //variable acumuladora, acumula la suma de la multiplicacion
                   //de los coeficientes y el numero de cedula 

        for (int i=0;i<9;++i){
            ced[i]=Integer.valueOf(cedula.substring(i,i+1));
        }
        if (ced[0]<0 || ced[0]>2){
            System.out.println("Primer digito de cedula incorrecto");
            return false;
        }
        if (ced[0]==2 && ced[1]>4){
            System.out.println("Segundo digito de cedula incorrecto");
            return false;

        }
        if (ced[2]<0 || ced[2]>5){
            System.out.println("Tercer digito de cedula incorrecto");
            return false;
        }

        for (int i=0;i<9;i++){
            ced[i]=ced[i]*coeficientes[i];
            if(ced[i]>10 || ced[i]==10){
                ced[i]=ced[i]-9;
            }
            acu=acu+ced[i];
            aux=acu;

        }
        System.out.println();
        while (aux%10!=0){
            aux++;
        }
        aux=aux-acu;
        cedula= cedula + Integer.toString(aux);
        cedulaComp=cedula;
        return true;

    }

    public static void main(String[] args){
        Cedula p1= new Cedula();
               
        p1.setCedula("172548000-");
        System.out.println("SU CEDULA COMPLETA ES: "+p1.cedulaComp);

    }
}