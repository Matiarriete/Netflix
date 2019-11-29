package Back;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FechaDAO implements IFechaDAO {

    public boolean verificarMes(int mes) {
        
        if(mes >= 1 && mes <=12)
            return true;
        else
            return false;
    }

    @Override
    public boolean verificarAnio(int anio) {
        Calendar c = Calendar.getInstance();
        int fAnio = c.get(Calendar.YEAR) - 2000;
        if(anio < fAnio || anio > fAnio + 25)
            return false;
        else
            return true;
    }

}
