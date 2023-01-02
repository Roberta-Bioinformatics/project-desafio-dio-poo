package br.com.dio.desafio.dominio;

// A classe Curso pertence ao dominio da aplicação. :)
// Atributos: título, descrição e carga horária. :)
// Método: calcularXP. :)

// Modificadores de acesso: ^.^
// private: somente essa classe tem acesso direto ao atributo. :)
// protect: somente essa classe e as classes filhas tem acesso ao atributo. :)
// public: por default(se não especificar), qualquer classe que necessitará do atributo, terá acesso. :)


public class Curso extends Conteudo{
    // private String titulo;
    // private String descricao;
    private int cargaHoraria;

// Ao concluir o curso, iremos pegar o XP_PADRÃO e multiplicar pela cargaHorária. :)
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    //public String getTitulo() {return titulo;}

    //public void setTitulo(String titulo) {this.titulo = titulo;}

    //public String getDescricao() {return descricao;}

    //public void setDescricao(String descricao) {this.descricao = descricao;}

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

// Método toString para imprimir, verificar, se tudo ficou de acordo. :)
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + getCargaHoraria() +
                '}';
    }
}
