package recursos.papeis;

import recursos.agendas.Agenda;
import recursos.agendas.Compromisso;

public class Usuario extends Pessoa {
    Compromisso compromisso;

    public Usuario(String nome, String login, Compromisso compromisso) {
        super(nome, login);
        this.compromisso = compromisso;
    }

    public Usuario() {
    }

    public Compromisso getCompromisso() {
        return compromisso;
    }

    public void setCompromisso(Compromisso compromisso) {
        this.compromisso = compromisso;
    }
}
