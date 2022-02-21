public class AplicacaoTest {
    public static void main(String[] args) {

        Aplicacao aplicacao = new Aplicacao();

        run(aplicacao);
    }

    private static void run(Aplicacao aplicacao) {
        AplicacaoTest appTeste = new AplicacaoTest();

        appTeste.testesQ1(aplicacao);
        appTeste.testesQ2(aplicacao);
    }

    private void testesQ1(Aplicacao aplicacao) {
        System.out.println("Rodando testes questao 1");

        aplicacao.questao1(0);
        aplicacao.questao1(2);
        aplicacao.questao1(5);
        aplicacao.questao1(10);
        aplicacao.questao1(15);
        aplicacao.questao1(25);
        aplicacao.questao1(40);
        aplicacao.questao1(100);
    }

    private void testesQ2(Aplicacao aplicacao){
        System.out.println("Rodando testes questao 2");

        aplicacao.questao2("yar231fa");
        aplicacao.questao2("aaaaaaaaaa");
        aplicacao.questao2("ASDJ192112");
        aplicacao.questao2("a@2A");
        aplicacao.questao2("sj@4Aca");
        aplicacao.questao2("senhaP@dra1");
        aplicacao.questao2("");
        aplicacao.questao2("SENHAgig@nt3");
    }

    private void testesQ3(Aplicacao aplicacao){}

}
