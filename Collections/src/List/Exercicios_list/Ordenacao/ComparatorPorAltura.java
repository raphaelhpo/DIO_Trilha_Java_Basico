package List.Exercicios_list.Ordenacao;

public class ComparatorPorAltura {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

}
