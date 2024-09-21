package Generics;

public class Conteudo_Generics {
    //Um tipo genérico é uma classe genérica ou uma interface que é parametrizada em relação a tipos.
    //Exemplo:
    //class ContaGenerico<T extends Number> {
    //    private T valor;
    //    public T getValor() {
    //        return valor;
    //    }
    //    public void setValor(T valor) {
    //        this.valor = valor;
    //    }
    //}
    //O simbulo <> é denominado de "Diamond Operator"
    /*public class Box {
        private Object object;
    
        public void set(Object object) { this.object = object; }
        public Object get() { return object; }
    }*/
    /*
     * Aqui acima foi demonstrado a classe "box" criada com o tipo "objetct"
     * Que no caso é o tipo que está acima do todos os outros tipos, ou seja
     * todos os tipos herdam de Object. Por este motivo, qualquer objeto criado
     * pode instância o "objetct" como qualquer tipo.
     */

    /*public class Box<T> {
	// T representa "Type" (tipo)
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
    }*/
    /*
     * Já aqui acima, se é utilizado o tipo "T" para representar o tipo do
     * objeto criado. Isso faz com que seja limitada a instanças de um tipo
     * mas isso faz com que n ocorram erros de compilação. Pois, na classe anterior,
     * seria necessário fazer um casting para que o objeto rodasse.
     */
    
}
