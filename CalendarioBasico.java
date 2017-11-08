
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private DisplayDosCaracteres ano;
    private DisplayDosCaracteres mes;
    private DisplayDosCaracteres dia;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        // initialise instance variables
        ano = new  DisplayDosCaracteres(100);
        mes = new  DisplayDosCaracteres(13);
        dia = new  DisplayDosCaracteres(31);
    }

    /**
     * Fija fecha introducida
     */
    public void fijarFecha(int nDia , int nMes , int nAno)
    {
        dia.setValorAlmacenado(nDia);
        mes.setValorAlmacenado(nMes);
        ano.setValorAlmacenado(nAno);    
    }

    /**
     * muestra fecha por pantalla
     */
    public String obtenerFecha()
    {
        String fecha;
        fecha = dia.getTextoDelDisplay() + "-" + mes.getTextoDelDisplay() + "-" + ano.getTextoDelDisplay();
        return fecha;
    }

    /**
     * Avanza la fecha en un dia
     */
    public void avanzarFecha()
    {
        {
            dia.incrementaValorAlmacenado();
            if (dia.getValorAlmacenado() == 1){
                mes.incrementaValorAlmacenado();
                if (mes.getValorAlmacenado() == 1){
                    ano.incrementaValorAlmacenado();
                }
            }

        }
    }
}
