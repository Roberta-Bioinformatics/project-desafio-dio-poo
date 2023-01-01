import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        // **********************************************************************************************************************
        // Conteudo conteudo = new Curso();
        // Explicação: Tudo que está em conteúdo, está em curso. Porém, nem tudo que está em curso, está em conteudo.
        // *** Conceito de polimorfismo. ***

        // A classe Conteudo é a classe mãe e abstrata, para que se possa evitar a repetição de código.
        // *** Conceito de herança --> classe Conteudo é a classe mãe de curso e mentoria. ***

        // Conteudo conteudo1 = new Mentoria();
        // *** Conceito de polimorfismo --> objeto de diversas formas... pode instanciar mentoria através da classe conteudo
        // porque classe conteudo, é a classe mãe de mentoria. Mas conteudo não é possível dar um new em conteudo,
        // porque é uma classe abstrata. ***
        // **********************************************************************************************************************

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*Para não se tornar repetitivo.
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTeacher = new Dev();
        devTeacher.setNome("Camila");
        devTeacher.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Teacher" + devTeacher.getConteudosInscritos());
        devTeacher.progredir();
        devTeacher.progredir();
        devTeacher.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Teacher" + devTeacher.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Teacher" + devTeacher.getConteudosConcluidos());
        System.out.println("XP: " + devTeacher.calcularTotalXp());
        System.out.println(" ");

        System.out.println("ƸӜƷ (◡‿◡) ¯`•.¸¸.•´´¯`•• .¸¸.•´¯ ƸӜƷ");

        System.out.println(" ");
        Dev devAluno1 = new Dev();
        devAluno1.setNome("Aluno1");
        devAluno1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Aluno_1" + devAluno1.getConteudosInscritos());
        devAluno1.progredir();
        devAluno1.progredir();
        //devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Aluno_1" + devAluno1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Aluno_1" + devAluno1.getConteudosConcluidos());
        System.out.println("XP: " + devAluno1.calcularTotalXp());
        System.out.println(" ");
        System.out.println("ƸӜƷ Gratidão! ƸӜƷ");
    }
}