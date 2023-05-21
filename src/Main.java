import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] words = {"hey","aeo","mu","ooo","artro"};
        int left = 0;
        int right = 4;

        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int res = 0;

        for (int i = left; i <= right; i++) {
            if (vowels.contains(words[i].charAt(0)) &&
                    vowels.contains(words[i].charAt(words[i].length() - 1)))
                res++;
        }
        System.out.println(res);
    }
}