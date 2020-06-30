package recursos.papeis;

public class Pessoa {
    private String nome;
    private String login;

    public Pessoa(String nome, String login) {
        this.nome = nome;
        this.login = login;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
