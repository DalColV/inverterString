public class reverseString {
    public static void main(String[] args) {
        // String a ser invertida
        String original = "Hello, world!";

        // Chamada do método para inverter a string
        String invertida = inverterString(original);

        // Exibindo o resultado
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }

    // Método para inverter a string
    public static String inverterString(String str) {
        // Convertendo a string para um array de caracteres
        char[] caracteres = str.toCharArray();

        // Invertendo o array de caracteres
        for (int i = 0; i < caracteres.length / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - 1 - i];
            caracteres[caracteres.length - 1 - i] = temp;
        }

        // Construindo uma nova string a partir do array de caracteres invertido
        return new String(caracteres);
    }
}
