import java.util.*;

public class WordBreakProblem {

    // Function to check if the word can be segmented into dictionary words
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string to check:");
        String s = scanner.nextLine();

        System.out.println("Enter the number of words in the dictionary:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<String> wordDict = new ArrayList<>();
        System.out.println("Enter the words in the dictionary:");
        for (int i = 0; i < n; i++) {
            wordDict.add(scanner.nextLine());
        }

        boolean result = wordBreak(s, wordDict);
        if (result) {
            System.out.println("The string can be segmented into dictionary words.");
        } else {
            System.out.println("The string cannot be segmented into dictionary words.");
        }

        scanner.close();
    }
}