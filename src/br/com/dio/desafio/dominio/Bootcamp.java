package br.com.dio.desafio.dominio;

import java.time.LocalDate;
// import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

// A classe Bootcamp pertence ao dominio da aplicação. :)
// Atributos: nome, descrição, dataInicial (é a data atual que instancia o objeto bootcamp),
// dataFinal (data inicial + 45 dias). :)

// Classes de domínio: Bootcamp, Dev e Conteudo (classe mãe que terá as classes Cursos e Mentoria). :)

// Opção "final" - para dizer que não poderá alterar a data. :)
public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);

// Estamos trabalhando com polimorfismo, iniciou o HashSet a partir de um Set. :)

// Criou-se um Set de Devs (Set>Dev>)- pois não poderia ter devs repetidos, cada pessoa é única. :)
// HashSet - a ordem dos devs inscritos no bootcamp é irrelevante. :)
// Criado um Set de conteúdos (Set<Conteudo>) - que serão cursos e mentoria que fazem parte do bootcamp,
// com LinkedHashSet, pois a ordem dos conteúdos adicionados no bootcamp possuem importância. :)

    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();


// Criados get e set. :)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

// Métodos equals e hash porque está utilizando LinkedHashSet. :)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(getNome(), bootcamp.nome) && Objects.equals(getDescricao(), bootcamp.descricao) &&
                Objects.equals(getDataInicial(), bootcamp.dataInicial) && Objects.equals(getDataFinal(), bootcamp.dataFinal) &&
                Objects.equals(getDevsInscritos(), bootcamp.devsInscritos) && Objects.equals(getConteudos(), bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(),
                getDataInicial(), getDataFinal(),
                getDevsInscritos(), getConteudos());
    }
}
