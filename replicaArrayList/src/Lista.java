import java.lang.reflect.Array;

public class Lista<T> {

    private T[]elementos;
    private int tamanho;

    /**
     *  Para instanciar um vetor genérico, faremos um macete.
     *
     *  O método 01 - É o método que vou usar, mas vou deixar um método
     *  secundário caso tenham interesse.
     *
     *  O método 02 - API Reflection
     *
     * */

    // Método 01
    public Lista(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    // Método 02
    public Lista(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }


    public int tamanho(){
        return this.tamanho;
    }

    public T buscar(int posicao){
        return this.buscarElementoNaPosicao(posicao);
    }

    public T buscarElementoNaPosicao(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int buscarPosicaoDoElemento(T elemento){
        for (int i = 0; i < tamanho; i++) {
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }return -1;
    }

    public boolean contem(T elemento){
        return buscarPosicaoDoElemento(elemento) > -1;
    }

    public boolean adicionarElemento(T elemento){

        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adicionarElementoNaPoiscao(int posicao, T elemento){

        this.aumentaCapacidade();

        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = tamanho; i >= posicao ; i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return false;
    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
            for (int i = 0; i < tamanho ; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int ultimoIndice(T elemento){

        for (int i = this.tamanho -1; i >= 0 ; i--) {
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        } return -1;
    }

    public void removerElemento(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < tamanho -1 ; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    public void removerElemento(T elemento){
        int pos = this.buscarPosicaoDoElemento(elemento);
        if (pos> -1){
            this.removerElemento(pos);
        }
    }

    public void removerTodosOsElementos(){
        this.tamanho = 0;
    }



    @Override
    public String toString() {

        //TODO - Devolver em formato JSON

        StringBuilder s = new StringBuilder();
        s.append("Arrays: {");

        for (int i = 0; i < this.tamanho -1 ; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("}");

        return s.toString();
    }
}
