import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso_Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(0);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso_JS");
        curso2.setDescricao("Descricao Curso JS");
        curso2.setCargaHoraria(0);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Curso_Java");
        mentoria1.setDescricao("Descricao Curso Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Curso_JS");
        mentoria2.setDescricao("Descricao Curso SJ");
        mentoria2.setData(LocalDate.now());

        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }
}
