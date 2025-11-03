class Solution {
    public String getHint(String secret, String guess) {
        
 int bulls = 0, cows = 0;
        HashMap<Character, Integer> secretMap = new HashMap<>();
        HashMap<Character, Integer> guessMap = new HashMap<>();

        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if (s == g) {
                bulls++;
            } else {
                secretMap.put(s, secretMap.getOrDefault(s, 0) + 1);
                guessMap.put(g, guessMap.getOrDefault(g, 0) + 1);
            }
        }

        for (char ch : guessMap.keySet()) {
            if (secretMap.containsKey(ch)) {
                cows += Math.min(secretMap.get(ch), guessMap.get(ch));
            }
        }

        return bulls + "A" + cows + "B";
    }
}