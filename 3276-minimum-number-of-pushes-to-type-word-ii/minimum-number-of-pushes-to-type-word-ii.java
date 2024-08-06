class Solution {
    public int minimumPushes(String word) {
        int totalPresses = 0; 

        char[] sortedWord = word.toCharArray(); 
        sortedWord = sortByFrequency(sortedWord).toCharArray(); 
        int uniqueLetters = 1; 
        int buttonPresses = 1; 
        int openButtons = 8; 
        char previousLetter = sortedWord[0]; 

        for (int i = 0; i < sortedWord.length; i++){
            char currentLetter = sortedWord[i]; 

            if (currentLetter != previousLetter){
                uniqueLetters++; 

                if (uniqueLetters > openButtons){
                    openButtons += 8; 
                    buttonPresses++; 
                }
            }

            previousLetter = currentLetter; 
            totalPresses += buttonPresses;  
        }

        return totalPresses; 
    }

    public String sortByFrequency(char[] charArray){
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : charArray) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> charFrequencyList = new ArrayList<>(frequencyMap.entrySet());

        charFrequencyList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        StringBuilder sortedStringBuilder = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charFrequencyList) {
            char c = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                sortedStringBuilder.append(c);
            }
        }

        return sortedStringBuilder.toString();
    }
}