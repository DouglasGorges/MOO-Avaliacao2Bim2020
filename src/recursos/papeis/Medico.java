package recursos.papeis;

import recursos.especializacoes.Especializacao;
import recursos.agendas.Agenda;

public class Medico extends Pessoa{
    Agenda agenda;
    Especializacao especializacao;

    public Medico(String nome, String login, Agenda agenda, Especializacao especializacao) {
        super(nome, login);
        this.agenda = agenda;
        this.especializacao = especializacao;
    }

    public Medico() {
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public Especializacao getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(Especializacao especializacao) {
        this.especializacao = especializacao;
    }
}
