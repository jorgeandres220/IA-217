/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author jorgeandres
 */
public class Streams {

    // Aquí se pone la ruta del archivo
    static String fileName = "/Users/jorgeandres/Desktop/words.txt";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //mismosChars("chasing");
        //partePalabra("auto");
        //mismasVocales("aeiou");
    }
    
    // Ejercicio 1: Cuente cuantas palabras, tiene los mismos charas en otras palabras: ejemplo casa esta contenida en carrosa
    public static void mismosChars(String palabra){
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            List<String> result = stream.filter((String line) -> Arrays.asList(line.split("")).containsAll(Arrays.asList(palabra.split("")))).collect(Collectors.toList());
            System.out.println(result.size());

        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    // Ejercicio 2: Cuente cuantas palabras, son parte de otra palabra: ejemplo casa esta en carcasa
    public static void partePalabra(String palabra){
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            List<String> result = stream.filter(line -> line.contains(palabra)).collect(Collectors.toList());
            System.out.println(result.size());

        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    // Ejercicio 3: Cuente cuantas plabras tienen igual sus silabas: ejemplo hola con ola = 2
    public static void mismasVocales(String palabra){
        final String palabra2 = extraerVocales(palabra);
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            List<String> result = stream.filter((String line) -> Arrays.asList((extraerVocales(line)).split("")).containsAll(Arrays.asList(palabra2.split("")))).collect(Collectors.toList());
            System.out.println(result.size());

        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    // Función auxiliar
    public static String extraerVocales(String palabra){
        return palabra.replaceAll("[bcdfghjklmnpqrstvwxyz]", "");
    }
    
}
