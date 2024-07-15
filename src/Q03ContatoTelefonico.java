public class Q03ContatoTelefonico {
    //constantes para fins de indicação de categorias de contatos
    public static final int FAMILIAR = 0;
    public static final int PROFISSIONAL = 1;
    public static final int OUTROS = 2;

    //atributos
    private String nome;
    private String sobrenome;
    private String email;
    private int codigoPais;
    private String telefone;
    private int categoria;

    public Q03ContatoTelefonico(String nome, String sobrenome, String email,
                                int codigoPais, String telefone, int categoria) throws IllegalArgumentException{
        if (categoria != FAMILIAR && categoria != PROFISSIONAL && categoria != OUTROS) {
            throw new IllegalArgumentException("Categoria de contato inválido!");
        }
        //this.variavelGlobal = variavel do método
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.codigoPais = codigoPais;
        this.telefone = telefone;
        this.categoria = categoria;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return  sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getCodigoPais(){
        return codigoPais;
    }

    public void setCodigoPais(int codigoPais){
        this.codigoPais = codigoPais;
    }

    public String getTelefone(){
        return  telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String toString(){
        return "Contato telefonico: [nome: " + nome + ", sobrenome: " + sobrenome + ", email: " + email
                + ", \n codigo do País: " + codigoPais + ", telefone: " + telefone + ", categoria: " + categoria + "] \n";
    }
}
