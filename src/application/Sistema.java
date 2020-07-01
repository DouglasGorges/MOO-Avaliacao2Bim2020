package application;

import recursos.agendas.Agenda;
import recursos.agendas.Compromisso;
import recursos.especializacoes.Equipamento;
import recursos.especializacoes.Especializacao;
import recursos.papeis.Atendente;
import recursos.papeis.Medico;
import recursos.papeis.Usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sistema {
    public static void main(String[] args) {

        System.out.println("*****************************************");
        System.out.println("** Bem-Vindo ao Sistema de Agendamento **");
        System.out.println("*****************************************");
        System.out.println("");
        System.out.println("O que voce deseja fazer:");
        System.out.println("1 - Login no Sistema");
        System.out.println("2 - Cadastrar novo medico");
        System.out.println("3 - Cadastrat novo atendente");
        System.out.println("4 - Cadastrar novo usuario");
        

        System.out.println("Por favor, digite seu login: ");
        //TODO Capturar o login



        List<Equipamento> listaEquipamentos = new ArrayList<>();
        Equipamento equipamento1 = new Equipamento();
        equipamento1.setNome("Estetoscopio");
        listaEquipamentos.add(equipamento1);
        Equipamento equipamento2 = new Equipamento();
        equipamento2.setNome("Bisturi");
        listaEquipamentos.add(equipamento2);

        Especializacao especializacao = new Especializacao();
        especializacao.setNome("Cardiologista");
        especializacao.setEquipe("Equipe Dois");
        especializacao.setSala("Sala Um");
        especializacao.setListaEquipamentos(listaEquipamentos);

        List<Compromisso> listaVagas = new ArrayList<>();
        Compromisso date1 = new Compromisso();
        date1.setInicio(new Date());
        date1.setFim(new Date());
        listaVagas.add(date1);
        Compromisso date2 = new Compromisso();
        date2.setInicio(new Date());
        date2.setFim(new Date());
        listaVagas.add(date2);

        Compromisso compromisso = new Compromisso();
        compromisso.setInicio(new Date());
        compromisso.setFim(new Date());

        Agenda agenda = new Agenda();
        agenda.setListaVagas(listaVagas);
        agenda.setCompromisso(compromisso);

        Medico medico = new Medico();
        medico.setNome("Md. John");
        medico.setLogin("john.connor");
        medico.setAgenda(agenda);
        medico.setEspecializacao(especializacao);

        Atendente atendente = new Atendente();
        atendente.setNome("Mr. Peter");
        atendente.setLogin("peter.parker");

        Usuario usuario = new Usuario();
        usuario.setNome("Sir Marcus");
        usuario.setLogin("marcus.oddel");
        usuario.setCompromisso(compromisso);

    }
}
