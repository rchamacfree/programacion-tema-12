
package rcm12;

/**
 *
 * @author rchamac
 */
public class MovilPrepago_v3 {
    
 public long numeroMovil;
    private float costeEstablecLlamada;
    private float costeMinutoLlamada ;
    private float costeConsumoMB;
    private float saldo;

public MovilPrepago_v3 (long nM, float cEL, float cML, float cMB, float s) {
    numeroMovil = nM;
    costeEstablecLlamada = cEL;
    costeMinutoLlamada = cML;
    costeConsumoMB = cMB;
    saldo =s;
}    
public void efectuarLlamada (int segundos) {
      saldo  -= Math.round((costeEstablecLlamada +
                            costeMinutoLlamada /60f * segundos) * 100f)/100f; 
      if (saldo < 0) saldo = 0;
}
public void navegar (int mb) {
      saldo -= Math.round(costeConsumoMB* mb * 100f) / 100f;
      if (saldo < 0) saldo = 0;
}
public boolean recargar (int importe) {
      if (importe % 5 == 0) {
         saldo += importe;
         return true;
      }
      else return false;
}
public float consultarSaldo () {
      return saldo;
}

    public void setCosteEstablecLlamada(float costeEstablecLlamada) {
        this.costeEstablecLlamada = costeEstablecLlamada;
    }

    public void setCosteMinutoLlamada(float costeMinutoLlamada) {
        this.costeMinutoLlamada = costeMinutoLlamada;
    }


} //fin clase
