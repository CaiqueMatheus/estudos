public class TestandoMetodos {
    public static void main(String[] args) {

        Lista<String> listString = new Lista<>(10);
        Lista<Integer> listInteger = new Lista<>(10);
        Lista<Contato> listaContato = new Lista<>(5);

        listString.adicionarElemento("A");
        listString.adicionarElemento("C");
        listString.adicionarElemento("E");
        listString.adicionarElemento("G");
        listString.adicionarElemento("I");

        System.out.println(listString.contem("K"));

        System.out.println(" \n Exibindo lista de Strings");
        System.out.println(listString);

        listString.adicionarElementoNaPoiscao(1, "B");
        listString.adicionarElementoNaPoiscao(3, "D");
        listString.adicionarElementoNaPoiscao(5, "F");
        listString.adicionarElementoNaPoiscao(7, "H");

        System.out.println(" \n Exibindo lista após adicionar strings em posições antes já ocupadas");
        System.out.println(listString);

        System.out.println("------------------------------------------");

        listInteger.adicionarElemento(1);
        listInteger.adicionarElemento(2);
        listInteger.adicionarElemento(3);
        listInteger.adicionarElemento(4);
        listInteger.adicionarElemento(5);

        System.out.println(" \n Exibindo lista após adicionar inteiros");
        System.out.println(listInteger); // Exibir status atual

        System.out.println(" \n Exibindo tamanho da lista");
        System.out.println(listInteger.tamanho());

        System.out.println(" \n Buscando posição de um elemento");
        System.out.println(listInteger.buscarPosicaoDoElemento(4));

        System.out.println("------------------------------------------");

        Contato pessoa1 = new Contato();
        Contato pessoa2 = new Contato();
        Contato pessoa3 = new Contato();
        Contato pessoa4 = new Contato();

        pessoa1.setNome("João Kleber");
        pessoa1.setIdade(42);
        pessoa1.setTelefone("(11)99999-9999");
        pessoa1.setEmail("example@example.com");

        pessoa2.setNome("Silvio Santos");
        pessoa2.setIdade(67);
        pessoa2.setTelefone("(11)99999-9999");
        pessoa2.setEmail("example@example.com");

        pessoa3.setNome("Xuxa ");
        pessoa3.setIdade(49);
        pessoa3.setTelefone("(11)99999-9999");
        pessoa3.setEmail("example@example.com");

        pessoa4.setNome("Regina Casé");
        pessoa4.setIdade(52);
        pessoa4.setTelefone("(11)99999-9999");
        pessoa4.setEmail("example@example.com");

        listaContato.adicionarElemento(pessoa1);
        listaContato.adicionarElemento(pessoa2);
        listaContato.adicionarElemento(pessoa3);
        listaContato.adicionarElemento(pessoa4);

        System.out.println(" \n Exibindo lista dos contatos adicionados");
        System.out.println(listaContato);

        System.out.println(" \n Buscando contatos na lista");
        System.out.println(listaContato.buscarPosicaoDoElemento(pessoa3));
        System.out.println(listaContato.buscarElementoNaPosicao(1));

        System.out.println(" \n Removendo contato da lista");
        listaContato.removerElemento(2);

        System.out.println(" \n Exibindo lista após exclusão");
        System.out.println(listaContato);
    }
}
