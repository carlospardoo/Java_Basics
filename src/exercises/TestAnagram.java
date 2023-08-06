package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static java.util.Map.Entry;

public class TestAnagram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    public static boolean isAnagram(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        Map<Character, Integer> aFrequencies = getFrequencies(a);
        Map<Character, Integer> bFrequencies = getFrequencies(b);

        Map<Character, Integer> mainCompare;
        Map<Character, Integer> auxCompare;

        if(aFrequencies.size() > bFrequencies.size()){
            mainCompare = aFrequencies;
            auxCompare = bFrequencies;
        }
        else {
            mainCompare = bFrequencies;
            auxCompare = aFrequencies;
        }

        for(Entry<Character, Integer> current : mainCompare.entrySet()){
            if(auxCompare.get(current.getKey()) == null){
                return false;
            } else if (auxCompare.get(current.getKey()) != current.getValue()) {
                return false;
            }
        }
        return true;
    }

    public static Map<Character, Integer> getFrequencies(String word){
        Map<Character, Integer> characters = new HashMap<>();

        for(char current : word.toCharArray()){
            if(!hasCharacter(current, characters)){
                characters.put(current, 1);
            }
            else{
                characters.put( current, characters.get(current) + 1 );
            }
        }

        return characters;
    }

    public static boolean hasCharacter(char character, Map<Character, Integer> characters){

        boolean hasCharacter = false;

        for(Entry<Character, Integer> c : characters.entrySet()){
            if(c.getKey() == character){
                hasCharacter = true;
                break;
            }
        }
        return hasCharacter;
    }

}
