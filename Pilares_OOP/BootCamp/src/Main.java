import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso_Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso_JS");
        curso2.setDescricao("Descricao Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Curso_Java");
        mentoria.setDescricao("Descricao Curso Java");
        mentoria.setData(LocalDate.now());

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Raphael");
        System.out.println(String.format("Conteudos inscritos %s: %s", dev1.getNome(), dev1.getConteudosInscritos()));

        Dev dev2 = new Dev();
        dev2.setNome("Alice");
        System.out.println(String.format("Conteudos inscritos %s: %s", dev2.getNome(), dev2.getConteudosInscritos()));

        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);
        System.out.println(String.format("Conteudos inscritos %s: %s", dev1.getNome(), dev1.getConteudosInscritos()));
        System.out.println(String.format("Conteudos concluidos %s: %s", dev1.getNome(), dev1.getConteudosConcluidos()));
        System.out.println(String.format("Conteudos concluidos %s: %s", dev2.getNome(), dev2.getConteudosConcluidos()));

        dev1.progredir();
        dev1.progredir();
        System.out.println(String.format("Conteudos inscritos %s: %s", dev1.getNome(), dev1.getConteudosInscritos()));
        System.out.println(String.format("Conteudos concluidos %s: %s", dev1.getNome(), dev1.getConteudosConcluidos()));

        System.out.println(String.format("Total XP %s: %s", dev1.getNome(), dev1.calcularTotalXp()));
        System.out.println(String.format("Total XP %s: %s", dev2.getNome(), dev2.calcularTotalXp()));

    }
}
