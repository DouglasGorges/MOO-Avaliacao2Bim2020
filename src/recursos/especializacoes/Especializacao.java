package recursos.especializacoes;

import java.util.ArrayList;
import java.util.List;

public class Especializacao {
    String nome;
    String sala;
    List<Equipamento> listaEquipamentos = new ArrayList<>();
    String equipe;

    public Especializacao() {
    }

    public Especializacao(String nome, String sala, List<Equipamento> listaEquipamentos, String equipe) {
        this.nome = nome;
        this.sala = sala;
        this.listaEquipamentos = listaEquipamentos;
        this.equipe = equipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public List<Equipamento> getListaEquipamentos() {
        return listaEquipamentos;
    }

    public void setListaEquipamentos(List<Equipamento> listaEquipamentos) {
        this.listaEquipamentos = listaEquipamentos;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
}
