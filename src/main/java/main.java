import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao do curso");
        curso1.setCargaHoraria(20);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao do curso");
        curso2.setCargaHoraria(20);
        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao da mentoria");
        mentoria.setCargaHoraria(LocalDate.now());
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descricao do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev dev1 = new Dev();
        dev1.setNome("Leonardo");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos:" + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudos Concluidos:" + dev1.getConteudosConcluidos());
        System.out.println("Conteudos inscritos:" + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudos Concluidos:" + dev1.getConteudosConcluidos());
        System.out.println("Conteudos inscritos:" + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calcularXp());


        System.out.println("-----------------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos:" + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos:" + dev2.getConteudosConcluidos());

    }
}
