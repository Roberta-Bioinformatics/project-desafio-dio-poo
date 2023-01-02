package br.com.dio.desafio.dominio;

// A classe Conteudo foi criada para que se possa implementar os atributos e o método
// calcularXP nas classes filhas, a fim de evitar a repetição de código e deixá-lo mais simples,
// que se relaciona com o conceito de herança. :)

// Criada classe Conteudo - chamada de classe mãe, em que a classe Mentoria e Curso (classes filhas)
// se englobam e que possuem atributos em comum. :)
// Explicação: todos bootcamps irão ter conteúdos. Mentoria e Curso são conteúdos. :)

public abstract class Conteudo {

// O objetivo dessa classe é para ter a possibilidade de iniciar os atributos titulo e descrição
// e de criar o método CalcularXP, para que as classes filhas utilizem os atributos
// e métodos, sendo possível de simplificar o código e evitar repetições. :)

// Criada constante XP_PADRÃO - os conteúdos serão criados com XP_PADRÃO. :)
// Com a palavra reservada "final" que indica como constante. :)

// Opção static - quer dizer que poderá acessar XP_PADRÃO fora da classe Conteudo. :)
// Opção protected - constante XP_PADRÃO, quem terão acesso, serão os(as) filhos(as) de Conteudo. :)
// Se tivesse colocado public - qualquer classe teria acesso e se tivesse colocado private,
// somente a classe Conteudo teria acesso a esse atributo XP_PADRÃO. :)
    protected static final double XP_PADRAO = 10d;

// Criados os atributos. :)
    private String titulo;
    private String descricao;

// Opção abstract significa que as classes filhas extendem da classe Conteudo
// e serão obrigadas a implementar a lógica nesse método. :)
// Classe abstrata - não consegue instanciar, criar conteúdo. :)


    public abstract double calcularXp();


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
