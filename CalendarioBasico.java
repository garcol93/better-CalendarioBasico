
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private int ano;
    private int mes;
    private int dia;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        // initialise instance variables
        ano = 1;
        mes = 1;
        dia = 1;
    }

    public void fijarFecha(int nDia , int nMes , int nAnyo)
    {
        dia = nDia;
        mes = nMes;
        ano = nAnyo;    
    }

    public String obtenerFecha()
    { String  d =  dia +"-";
        String  m = mes +"-";
        String  a = ano +"";
        if(dia<10){
            d = "0" + d;}  
        if(mes<10) {   
            m = "0" + m;}
        if(ano<10){    
            a = "0" + a;
        }    
        return d + m + a;
    }

    public void avanzarFecha()
    {
        dia = dia +1;
        if(dia > 30){
            dia = 1;
            mes= mes + 1;
            if (mes > 12){
                mes = 1;
                ano = ano + 1;
        }
        }
    }
}
