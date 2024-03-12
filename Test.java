public class Test {

    private static void Test1 (){
        int i = 13, sum = 0, k =0;

        while(k < i){
            k = k + 1;
            sum = sum + k;
        }

        System.out.println(sum);
    }

    private static void Test2() {
        int a = 0, b = 1, num = 13;

        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        System.out.println(b == num);
    }

    private static void Test3() {
        /*  a) 1, 3, 5, 7, [9] -- Esta sequência consiste em números ímpares consecutivos começando de 1. A lógica para encontrar o próximo número é simplesmente adicionar 2 ao número anterior.

            b) 2, 4, 8, 16, 32, 64, [128] -- Esta sequência parece ser uma progressão geométrica, onde cada número é o dobro do anterior. Para encontrar o próximo número, você multiplica o último número da sequência por 2.

            c) 0, 1, 4, 9, 16, 25, 36, [49] -- Esses números são os quadrados dos números naturais começando de 0. Para encontrar o próximo número, você simplesmente calcula o quadrado do próximo número natural.

            d) 4, 16, 36, 64, [100] -- Esses parecem ser os quadrados de 2, 4, 6, 8. Para encontrar o próximo número, você calcula o quadrado do próximo número par.

            e) 1, 1, 2, 3, 5, 8,[13] -- Esta sequência é a sequência de Fibonacci, onde cada número é a soma dos dois números anteriores. Para encontrar o próximo número, você simplesmente soma os dois últimos números da sequência.

            f) 2,10, 12, 16, 17, 18, 19, [20] --Observando os números, parece que a sequência está adicionando 8, depois 2, depois 4, depois 1, depois 1 novamente, e depois 1. Assim, o próximo número será 19 + 1 = 20.
        */
    }

    private static void Test4() {
        /*
        Eu começo ligando um dos interruptores por um curto período e depois desligo. Em seguida, ligo outro interruptor. Em seguida, faço uma visita à sala das lâmpadas. Agora, analisando as condições das lâmpadas, deduzo que:
            A lâmpada que está desligada, mas ainda emite calor, está conectada ao primeiro interruptor.
            A lâmpada que está acesa está controlada pelo segundo interruptor.
            A lâmpada que está apagada e fria corresponde ao terceiro interruptor.
        Com base nesses resultados, consigo associar cada interruptor à sua lâmpada correspondente, resolvendo o problema usando apenas uma visita à sala das lâmpadas.
         */
        
    }

    private static String Test5(String str) {
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length / 2; i++) {
            char temp = c[i];
            c[i] = c[c.length - 1 - i];
            c[c.length - 1 - i] = temp;
        }
        return new String(c);
    }
    
    public static void main(String[] args) {
        Test1(); // sum = 91
        Test2(); // num = 13 == true

        System.out.println(Test5("Hello World!")); //!dlroW olleH
    }
}