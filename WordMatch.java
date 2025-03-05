public class WordMatch {
    private String secret;

    public WordMatch(String word) {
        secret = word;
    }

    public int scoreGuess(String guess) {
        int occurences = 0;
        for (int i = 0; i < secret.length() - guess.length() + 1; i++) {
            if ((secret.substring(i, i + guess.length()).equals(guess))) occurences++;
        }
        return occurences * (int) Math.pow(guess.length(), 2);
    }

    public String findBetterGuess(String guess1, String guess2) {
        if (scoreGuess(guess1) > scoreGuess(guess2)) return guess1;
        else if(scoreGuess(guess2) > scoreGuess(guess1)) return guess2;
        else if(guess1.compareTo(guess2) > 0) return guess1;
        return guess2;
    }


}