package br.com.dio.desafio.dominio;

import java.time.LocalDate;

// A classe Mentoria pertence ao dominio da aplicação. :)
// Atributos: título, descrição e data que será lançada a mentoria. :)
// Método: calcularXP. :)

// Modificadores de acesso: ^.^
// private: somente essa classe tem acesso direto ao atributo. :)
// protect: somente essa classe e as classes filhas tem acesso ao atributo. :)
// public: por default(se não especificar), qualquer classe que necessitará do atributo, terá acesso. :)

// A classe Mentoria extende da classe Conteudo. Ou seja, a classe Mentoria é filha da classe Conteudo. :)
// Tudo que temos em conteúdo, iremos ter em Mentoria, mas nem tudo que temos em Mentoria, teremos em Conteúdo. :)


public class Mentoria extends Conteudo{
    // private String titulo;
    // private String descricao; (comentado, pois já contém titulo e descrição na classe mãe). :)

// Classe LocalDate é uma das classes do Java, que é possível trabalhar com datas. :)
    private LocalDate data;

// Quando criar uma mentoria vai pegar o XP_PADRÃO e adicionar por exemplo 20. Então, quando chamar o método
// calcularXP, o XP da mentoria irá ser XP_PADRÃO + 20. :)

    @Override
    public double calcularXp() {

        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    //public String getTitulo() {return titulo;}

    //public void setTitulo(String titulo) {this.titulo = titulo//}

    //public String getDescricao() {return descricao;}

    //public void setDescricao(String descricao) {this.descricao = descricao;}


// Para trabalhar com os atributos, inicia-se os métodos get e set. :)
    public LocalDate getData() {

        return data;
    }

    public void setData(LocalDate data) {

        this.data = data;
    }

// Método toString para imprimir, verificar se tudo ficou de acordo. :)
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + getData() +
                '}';
    }
}
