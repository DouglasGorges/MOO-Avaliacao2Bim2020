package recursos.agendas;

import recursos.papeis.Medico;
import recursos.papeis.Usuario;

import java.util.Date;

public class Compromisso {
    Date inicio;
    Date fim;

    public Compromisso() {
    }

    public Compromisso(Date inicio, Date fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }
}
