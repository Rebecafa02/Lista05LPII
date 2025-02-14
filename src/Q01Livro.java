//Questão 01 da lista 05

public class Q01Livro {

    private String titulo;
    private String autores;
    private int edicao;
    private int ano;

    public Q01Livro(String titulo, String autores, int edicao, int ano) {
        this.titulo = titulo;
        this.autores = autores;
        this.edicao = edicao;
        this.ano = ano;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutores(){
        return autores;
    }

    public void setAutores(String autores){
        this.autores = autores;
    }

    public int getEdicao(){
        return edicao;
    }

    public void setEdicao(int edicao){
        this.edicao = edicao;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String toString(){
        return "Livro [titulo: " + titulo + ", autores: " + autores +
                ", edição: " + edicao + ", ano: " + ano + "] \n";
    }
}
