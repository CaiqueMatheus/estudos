public class Contato {
    private String nome;
    private int idade;
    private String telefone;
    private String email;

    public Contato() {
        this.nome = null;
        this.idade = 0;
        this.telefone = null;
        this.email = null;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\n Contato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}' + "\n" ;
    }
}
