package org.example;

/*

-- Descripción del Problema --
Desarrollar una clase en Java llamada TextCompressor que implemente un método para comprimir una cadena de texto.
La compresión debe consistir en transformar secuencias de caracteres repetidos en un solo carácter seguido por el
número de repeticiones.

-- Detalles del Desafío --
Método compress: Este método aceptará una cadena de texto y devolverá una nueva cadena comprimida.

-- Ejemplo: --
Entrada: "aaabbcddd"
Salida: "a3b2cd3"
Consideraciones:

-- Observaciones --
Si una secuencia de caracteres tiene solo una repetición (como 'c' en el ejemplo), simplemente se incluye el carácter sin el número.
La compresión solo se aplica a letras del alfabeto; otros caracteres se dejan como están.
El método debe manejar cadenas vacías y nulas adecuadamente.
*/

public class TextCompressor {

    public String compress(String input) {
        if (input == null || input.isEmpty()) return "";
        if (input.length() == 1) return input;

        StringBuilder result = new StringBuilder();
        char lastCharacter = input.charAt(0);
        int counter = 1;

        for (int i = 1; i < input.length(); i++) {
            char thisChar = input.charAt(i);
            boolean isLetter = String.valueOf(thisChar).matches("[a-z]");
            if (lastCharacter == thisChar && isLetter) {
                counter++;
            } else {
                result.append(lastCharacter);
                if (counter > 1) {
                    result.append(counter);
                }
                lastCharacter = input.charAt(i);
                counter = 1;
            }
        }

        result.append(lastCharacter);
        if (counter > 1) {
            result.append(counter);
        }

        return result.toString();
    }
}
