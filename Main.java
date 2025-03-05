public class Main {
    public static void main(String[] args) {
        WordMatch game1 = new WordMatch("mississippi");
        System.out.println("Game 1: ");
        System.out.println(game1.scoreGuess("i"));
        System.out.println(game1.scoreGuess("iss"));
        System.out.println(game1.scoreGuess("issipp"));
        System.out.println(game1.scoreGuess("mississippi"));
        WordMatch game2 = new WordMatch("aaaabb");
        System.out.println("Game 2: ");
        System.out.println(game2.scoreGuess("a"));
        System.out.println(game2.scoreGuess("aa"));
        System.out.println(game2.scoreGuess("aaa"));
        System.out.println(game2.scoreGuess("aabb"));
        System.out.println(game2.scoreGuess("c"));
        System.out.println("Game 3: ");
        WordMatch game3 = new WordMatch("concatenation");
        System.out.println(game3.scoreGuess("ten"));
        System.out.println(game3.scoreGuess("nation"));
        System.out.println(game3.findBetterGuess("ten", "nation"));
        System.out.println(game3.scoreGuess("con"));
        System.out.println(game3.scoreGuess("cat"));
        System.out.println(game3.findBetterGuess("con", "cat"));
    }
}