package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.Optional;

// A classe Dev pertence ao dominio da aplicação. :)
// Atributos: nome, conteudosInscritos (grupo que conterá os conteúdos que o dev irá se inscrever) e
// conteudosConcluidos (grupo de conteúdos que o dev conseguiu concluir). Importância da herança. :)

// Set de conteudos --> Set<Conteudo>
// LinkedHashSet - quando os cursos forem inscritos, serão salvos e ficarão na ordem. Adicionará elementos únicos. :)
// Adicionar uma vez para um determinado curso e para uma determinada mentoria. :)

// Expresso polimorfismo, porque está instanciando (iniciando) LinkedHashSet através da classe mãe: Set. :)
public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

// Criando os métodos: inscrever - progredir - calcularTotalXp. :)
// Opção void: não terá retorno. :)

// Todos os conteúdos do bootcamp que o dev se inscreveu, para o set de conteudosInscritos. :)
// Exemplo: this.conteudosInscritos - pegando o set de conteudosInscritos e addAll(bootcamp.getConteudos()
// adicionado dentro do set, todos os conteúdos do bootcamp. :)

// Adicionando também os DevsInscritos ao bootcamp, para dizer que estão matriculados,
// com a palavra reservada "this" que passamos como argumento. :)

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

// Para progredir, pegar o conteudo do set de conteudoInscritos e colocar dentro do set de conteudoConcluidos. :)
// Criada a condição para retirar o conteudo dos conteudosInscritos e colocar dentro de conteudosConcluidos. :)

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

// Calculando XP. :)
// Adquirindo cada conteudo dentro do set de conteudosConcluidos, assim como, XP de cada conteudo e somando. :)

    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

// Criados get e set. :)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos (Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = getConteudosInscritos();
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = getConteudosConcluidos();
    }

// Métodos equals e hash porque está utilizando LinkedHashSet. :)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) &&
                Objects.equals(getConteudosInscritos(), dev.getConteudosInscritos()) &&
                Objects.equals(getConteudosConcluidos(), dev.getConteudosConcluidos());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudosInscritos(), getConteudosConcluidos());
    }
}

