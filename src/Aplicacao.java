import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aplicacao {

    /**
     *
     * @param entrada -> Inteiro que representa a quantidade de andares na árvore de *
     *
     * Esse método resolve a questão dos asteriscos e espaços vazios
     * Utiliza tres iterações para percorrer e escrever os caracters na tela
     *
     */
    public void questao1(int entrada) {
        int i = 0;

        while(i < entrada) {
            int contadorAsterisco = 0;
            int contadorVazio = 0;

            while(contadorVazio < (entrada - (i+1))) {
                System.out.print(" ");
                contadorVazio++;
            }

            while(contadorAsterisco < (i+1)) {
                System.out.print("*");
                contadorAsterisco++;
            }

            System.out.print("\n");
            i++;
        }
    }

    public void questao2(String senha) {
        List<String> chars = preencheLista();
        int contadorRegras = 0;
        boolean contemEspecial = false;
        boolean contemMaiusculo = false;
        boolean contemMinusculo = false;
        boolean contemNumero = false;


        if(senha.length() >= 6 ) {
            contadorRegras++;
        }

        for (int i = 0; i < senha.length(); i++) {
            char letra = senha.charAt(i);

            if(!contemEspecial && chars.contains(String.valueOf(letra))) {
                contemEspecial = true;
                contadorRegras++;
                break;
            }

            if(!contemMaiusculo && Character.isUpperCase(letra)) {
                contemMaiusculo = true;
                contadorRegras++;
            }

            if(!contemMinusculo && Character.isLowerCase(letra)) {
                contemMinusculo = true;
                contadorRegras++;
            }

            if(!contemNumero && Character.isDigit(letra)) {
                contemNumero = true;
                contadorRegras++;
            }
        }

        int resultado = 0;

        if(senha.length() >= 6)
            resultado = (5 - contadorRegras);
        else resultado = (6 - senha.length()) ;

        System.out.println(resultado);
    }

    /**
     * Metodo auxiliar para retornar uma lista de caracteres especiais
     * Afim de limpar o metodo que está a resolucao da questao
     * @return
     */
    private static ArrayList<String> preencheLista() {
        ArrayList<String> a = new ArrayList<>();

        a.add("!");
        a.add("@");
        a.add("#");
        a.add("$");
        a.add("%");
        a.add("^");
        a.add("&");
        a.add("*");
        a.add("(");
        a.add(")");
        a.add("-");
        a.add("+");

        return a;
    }

    private static void questao3(String palavra) {
        int qtdSubstrings = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char letraAtual = palavra.charAt(i);
            int j = i;

            while (j < palavra.length()) {
                if(letraAtual == palavra.charAt(j)) {
                    qtdSubstrings++;
                    boolean sequencia = true;
                    int contadorI = i;
                    int contadorJ = j;

                    StringBuilder seq1 = new StringBuilder();
                    StringBuilder seq2 = new StringBuilder();

                    while (sequencia) {
                        if(contadorI+1 < palavra.length() && contadorJ+1 < palavra.length()) {
                            seq1.append(palavra.charAt(i)).append(palavra.charAt(contadorI));
                            seq2.append(palavra.charAt(j)).append(palavra.charAt(contadorJ));

                            contadorI++;
                            contadorJ++;

                            String sequenciaInicialOrdenada = converteStringOrdenada(seq1);
                            String sequenciaAnagramaOrdenada = converteStringOrdenada(seq2);

                            if(!sequenciaInicialOrdenada.equals(sequenciaAnagramaOrdenada)) {
                                sequencia = false;
                                break;
                            }

                            qtdSubstrings++;
                        }
                    }
                }
                j++;
            }
        }

        System.out.println(qtdSubstrings);
    }

    private static String converteStringOrdenada(StringBuilder palavraDesordenada) {
        char[] chars = palavraDesordenada.toString().toCharArray();
        Arrays.sort(chars);

        return new String(chars);
    }
}
