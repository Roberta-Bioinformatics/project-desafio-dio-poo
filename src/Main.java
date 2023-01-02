import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

// A classe Main é a classe em que será executado o programa. ^.^

// Modificadores de acesso: ^.^
// private: somente essa classe tem acesso direto ao atributo. :)
// protect: somente essa classe e as classes filhas tem acesso ao atributo :)
// public: por default(se não especificar), qualquer classe que necessitará do atributo, terá acesso. :)

// Conceito de abstração: adquirindo um problema, um alvo, especificando dentro do programa,
// através das classes e instanciando / criando, através dos objetos. :)

public class Main {
    public static void main(String[] args) {

// A partir da palavra "new" é que instanciamos o objeto. :)
// Analogia: A classe é como se fosse a planta de uma casa e o objeto é realmente a casa construída. :)
// Método set - atribuindo valores aos atributos. :)


// Foram criadas as classes Curso e Mentoria, assim como, os objetos dessas classes a partir da classe Main. :)
// Conceito de encapsulamento: foram encapsulados os atributos. :)

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

/* *******************************************************************************************************************
*** Conceito de polimorfismo. ***
----------------------------------
Exemplo: Conteudo conteudo = new Curso();
Explicação: Tudo que está em Conteudo, está em Curso. Porém, nem tudo que está em Curso, está em Conteudo. :)

*** Conceito de herança ***
----------------------------
A classe Conteudo é a classe mãe e abstrata, para que se possa evitar a repetição de código. :)
Classe Conteudo é a classe mãe de Curso e Mentoria. :)

*** Conceito de polimorfismo ***
---------------------------------
Exemplo: Conteudo conteudo1 = new Mentoria();
Explicação:  Polimorfismo - objeto de diversas formas... pode instanciar Mentoria através da classe Conteudo
porque classe Conteudo, é a classe mãe de Mentoria. Mas Conteudo não é possível dar um new em conteudo,
porque Conteudo é uma classe abstrata. :)
********************************************************************************************************************** */

// Criando mentoria de fato, instanciando com a palavra "new". :)
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");

// Chamando a classe LocalDate e atribuindo a data de criação da mentoria, quando for criado o objeto. :)
        mentoria.setData(LocalDate.now());
        /* Comentado esse bloco, para não se tornar repetitivo. :)
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


// Instanciando o bootcamp e criando dois devs para ser possível de se inscreverem no bootcamp. :)
// Atributos do objeto bootcamp: nome, descrição e o set de conteudos. :)
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");

// Colocando os conteudos dentro do bootcamp. :)
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

// Criando os devs. :)
// Necessitamos inserir aqui, apenas o nome, porque quando progredir, serão colocados
// os conteudosConcluidos e quando inscritos, serão colocados os conteudoInscritos,
// a partir do bootcamp em que se inscreveram. :)

        Dev devTeacher = new Dev();
// Instanciando o dev. :)
        devTeacher.setNome("Teacher");

// Dev se inscrevendo no bootcamp. :)
        devTeacher.inscreverBootcamp(bootcamp);

// Imprimindo os conteudosInscritos. :)
        System.out.println("Conteúdos Inscritos Teacher" + devTeacher.getConteudosInscritos());

// Concluiu o conteudo. Temos três conteudos. :)
        devTeacher.progredir();
        devTeacher.progredir();
        devTeacher.progredir();
        System.out.println("-");

// Depois que concluir, imprimindo os conteudosInscritos e conteudosConcluidos. :)
        System.out.println("Conteúdos Inscritos Teacher" + devTeacher.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Teacher" + devTeacher.getConteudosConcluidos());

// Imprimindo o valor de XP. :)
        System.out.println("XP: " + devTeacher.calcularTotalXp());
        System.out.println(" ");

        System.out.println("ƸӜƷ (◡‿◡) ¯`•.¸¸.•´´¯`•• .¸¸.•´¯ ƸӜƷ");

        System.out.println(" ");
        Dev devAluno1 = new Dev();

// Instanciando o outro dev. :)
        devAluno1.setNome("Aluno1");

// Dev se inscrevendo no bootcamp. :)
        devAluno1.inscreverBootcamp(bootcamp);

// Imprimindo os conteudosInscritos. :)
        System.out.println("Conteúdos Inscritos Aluno_1" + devAluno1.getConteudosInscritos());

// Concluiu o conteudo. Temos três conteudos. :)
        devAluno1.progredir();
        devAluno1.progredir();
        //devJoao.progredir();

        System.out.println("-");

// Depois que concluir, imprimindo os conteudosInscritos e conteudosConcluidos. :)
        System.out.println("Conteúdos Inscritos Aluno_1" + devAluno1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Aluno_1" + devAluno1.getConteudosConcluidos());

// Imprimindo o valor de XP. :)
        System.out.println("XP: " + devAluno1.calcularTotalXp());
        System.out.println(" ");
        System.out.println("ƸӜƷ Muita gratidão! ƸӜƷ");
    }
}