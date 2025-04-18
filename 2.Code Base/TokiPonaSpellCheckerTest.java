import java.util.List;
public class TokiPonaSpellCheckerTest {
    public static void main(String[] args) {
        TokiPonaSpellChecker spellChecker = new TokiPonaSpellChecker();
        System.out.println("valid words:");
        System.out.println("akesi: " + spellChecker.isSpelledCorrectly("akesi"));
        System.out.println("soweli: " + spellChecker.isSpelledCorrectly("soweli"));
        System.out.println("pimeja: " + spellChecker.isSpelledCorrectly("pimeja"));
        System.out.println("Testing invalid words:");
        System.out.println("haha: " + spellChecker.isSpelledCorrectly("haha"));
        System.out.println("abc: " + spellChecker.isSpelledCorrectly("abc"));
        System.out.println("sussex: " + spellChecker.isSpelledCorrectly("sussex"));

        System.out.println("valid names and place:");
        System.out.println("jan Tanka: " + spellChecker.isSpelledCorrectly("jan Tanka"));
        System.out.println("jan Eki: " + spellChecker.isSpelledCorrectly("jan Eki"));
        System.out.println("ma Japoni: " + spellChecker.isSpelledCorrectly("ma Japoni"));

        System.out.println("invalid names and place:");
        System.out.println("Duncan: " + spellChecker.isSpelledCorrectly("Duncan"));
        System.out.println("Eric: " + spellChecker.isSpelledCorrectly("Eric"));
        System.out.println("USA: " + spellChecker.isSpelledCorrectly("USA"));
        System.out.println("Testing suggestion for prefix:");

        List<String> suggestions = spellChecker.suggestWords("m");
        System.out.println("Suggestions for prefix 'm': " + suggestions);

        System.out.println("Testing grammar correctness:");
        String sentence1 = "i love icecream";
        String sentence2 = "meli li pali  ilo";
        String sentence3 = "soweli li lukin e moku";
        System.out.println(sentence1 + " is grammatically correct: " + spellChecker.isGrammarCorrect(sentence1));
        System.out.println(sentence2 + " is grammatically correct: " + spellChecker.isGrammarCorrect(sentence2));
        System.out.println(sentence3 + " is grammatically correct: " + spellChecker.isGrammarCorrect(sentence3));
    } 
}