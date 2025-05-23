import java.util.ArrayList;
import java.util.List;
public class TokiPonaSpellChecker{
    private List<String> validWords = new ArrayList<String>();
    private List<String> validNameandPlaces = new ArrayList<String>();
    public TokiPonaSpellChecker() 
    {
        String[] words = {  "a", "akesi", "ala", "alasa", "ale", "ali", "anpa", "ante", "anu", "awen",
                "e", "en", "esun", "ijo", "ike", "ilo", "insa", "jaki", "jan", "jelo",
                "jo", "kala", "kalama", "kama", "kasi", "ken", "kepeken", "kili", "kin",
                "kiwen", "ko", "kon", "kule", "kulupu", "kute", "la", "lape", "laso",
                "lawa", "len", "lete", "li", "lili", "linja", "lipu", "loje", "lon",
                "luka", "lukin", "lupa", "ma", "mama", "mani", "meli", "mi", "mije",
                "moku", "moli", "monsi", "mu", "mun", "musi", "mute", "nanpa", "nasa",
                "nasin", "nena", "ni", "nimi", "noka", "o", "oko", "olin", "ona", "open",
                "pakala", "pali", "palisa", "pan", "pana", "pi", "pilin", "pimeja", "pini",
                "pipi", "poka", "poki", "pona", "pu", "sama", "seli", "selo", "seme",
                "sewi", "sijelo", "sike", "sin", "sina", "sinpin", "sitelen", "sona",
                "soweli", "suli", "suno", "supa", "suwi", "tan", "taso", "tawa", "telo",
                "tenpo", "toki", "tomo", "tu", "unpa", "uta", "utala", "walo", "wan",
                "waso", "wawa", "weka", "wile",};
        for (String word : words)
        {
            validWords.add(word);
        }
        String[] NameandPlaces = {"jan Tanka", "jan Eki", "jan Moli ", "jan Luka","jan Kasi","jan Anseto",
                "ma Apeka", "ma Pakasa", "ma Belaru", "ma Pape", "ma Kanata", "ma Tosi", "ma Atisa", 
                "ma Isala", "ma Inuka", "ma Japoni", "ma Kena", "ma Lipija"};
        for (String NameandPlace : NameandPlaces) 
        {
            validNameandPlaces.add(NameandPlace);
        }
    }

    public boolean isSpelledCorrectly(String word)
    {
        String lowerCaseWord = word.toLowerCase();
        if (validWords.contains(lowerCaseWord) || validNameandPlaces.contains(word)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args)
    {
        TokiPonaSpellChecker spellChecker = new TokiPonaSpellChecker();
        String word = "";
        if (spellChecker.isSpelledCorrectly(word)) {
            System.out.println(word + " is spelled correctly");
        } else {
            System.out.println(word + " is spelled incorrectly");
        }
    }

    public void addWord(String word)
    {
        validWords.add(word);
    }

    public void addNameandPlace(String NameandPlace)
    {
        validNameandPlaces.add(NameandPlace);
    }

    public List<String> suggestWords(String prefix) 
    {
        List<String> suggestions = new ArrayList<String>();
        for (String word : validWords) 
        {
            if (word.startsWith(prefix)) 
            {
                suggestions.add(word);
            }
        }
        for (String NameandPlace : validNameandPlaces) 
        {
            if (NameandPlace.startsWith(prefix))
            {
                suggestions.add(NameandPlace);
            }
        }
        return suggestions;
    }

    public boolean isGrammarCorrect(String sentence) 
    {
        String[] words = sentence.split(" ");
        if (words.length < 2 || words.length > 4) 
        {
            return false;
        }
        String subject = words[0];
        String verb = words[1];
        if (!validWords.contains(subject) || !validWords.contains(verb))
        {
            return false;
        }
        if (words.length == 2)
        {
            if (subject.endsWith("o") && !verb.endsWith("e"))
            {
                return false;
            }
            return true;
        } else if (words.length == 3) 
        {
            String object = words[2];
            if (!validWords.contains(object)) 
            {
                return false;
            }
            if (subject.endsWith("o") && !verb.endsWith("e"))
            {
                return false;
            }
            if (verb.endsWith("li") && !object.endsWith("e")) 
            {
                return false;
            }
            if (verb.endsWith("e") && object.endsWith("e"))
            {
                return false;
            }
            return true;
        } else {
            if (words[2].equals("ala"))
            {
                String object = words[3];
                if (!validWords.contains(object))
                {
                    return false;
                }
                if (subject.endsWith("o") && !verb.endsWith("e"))
                {
                    return false;
                }
                if (verb.endsWith("li") && !object.endsWith("e")) 
                {
                    return false;
                }
                if (verb.endsWith("e") && object.endsWith("e"))
                {
                    return false;
                }
                return true;
            } else if (words[2].equals("li"))
            {
                String object = words[3];
                if (!validWords.contains(object))
                {
                    return false;
                }
                if (subject.endsWith("o") && !verb.endsWith("e"))
                {
                    return false;
                }
                if (!verb.endsWith("li"))
                {
                    return false;
                }
                if (!object.endsWith("e"))
                {
                    return false;
                }
                return true;
            } else
            {
                return false;
            }
        }
    }
}