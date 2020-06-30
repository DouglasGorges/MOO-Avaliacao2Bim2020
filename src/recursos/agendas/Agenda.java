package recursos.agendas;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Compromisso> listaVagas = new ArrayList<Compromisso>();
    List<Compromisso> listaOcupadas = new ArrayList<Compromisso>();
    Compromisso compromisso;

    public Agenda(List<Compromisso> listaVagas, List<Compromisso> listaOcupadas, Compromisso compromisso) {
        this.listaVagas = listaVagas;
        this.listaOcupadas = listaOcupadas;
        this.compromisso = compromisso;
    }

    public Agenda() {
    }

    public Compromisso getCompromisso() {
        return compromisso;
    }

    private Boolean estaOcupado(Compromisso compromisso){
        for(Compromisso vaga : listaVagas)
            if(vaga.getInicio() == compromisso.getInicio() && vaga.getFim() == compromisso.getFim())
                return false;
        return true;
    }

    private void removerVagaAgenda(Compromisso compromisso){
        List<Compromisso> listaAtualizada = new ArrayList<>();

        for(Compromisso vaga : listaVagas)
            if(!(vaga.getInicio() == compromisso.getInicio()) && !(vaga.getFim() == compromisso.getFim()))
                listaAtualizada.add(vaga);

        setListaVagas(listaAtualizada);
    }

    public void setCompromisso(Compromisso compromisso) {
        if(!estaOcupado(compromisso)) {
            removerVagaAgenda(compromisso);
            this.compromisso = compromisso;
        }
    }

    public List<Compromisso> getListaVagas() {
        return listaVagas;
    }

    public void setListaVagas(List<Compromisso> listaVagas) {
        this.listaVagas = listaVagas;
    }

    public List<Compromisso> getListaOcupadas() {
        return listaOcupadas;
    }

    public void setListaOcupadas(List<Compromisso> listaOcupadas) {
        this.listaOcupadas = listaOcupadas;
    }
}
