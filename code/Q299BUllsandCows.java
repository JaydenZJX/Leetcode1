public class Solution{
    public String getHint(String secret, String guess){
        int[] count = new int[10];
        int bull = 0;
        int cow  = 0;

        for(int i = 0; i < guess.length();i++){
            int a = secret.charAt(i)-'0';
            int b = guess.charAt(i)-'0';

            if(a==b){
                bull++;
            }else{
            if(count[a] < 0) cow++;
            if(count[b] > 0) cow++;

            count[a]++;
            count[b]--;
            }
        }
        return bull+"A"+cow+"B";
    }
}
public class Solution{
    public String getHint(String secret, String guess){
        int bull = 0;
        int cow  = 0;
        boolean[] checkedSecret = new boolean[secret.length()];
        boolean[] checkedGuess = new boolean[guess.length()];
        for(int i = 0;i < guess.length();i++){
            int s = secret.charAt(i)-'0';
            int g = guess.charAt(i)-'0';
            if(s == g){
                bull++;
                checkedSecret[i] = true;
                checkedGuess[i] = true;
            }
        }
        for(int i = 0; i < guess.length(); i++) {
                for(int j = 0; j < guess.length(); j++) {
                    if(!checkedGuess[j]&& !checkedSecret[i]){
                        if(secret.charAt(i) == guess.charAt(j)){
                            checkedSecret[i] = true;
                            checkedGuess[j] = true;
                            cow++;
                        }
                    }
                }
        }

        return bull+"A"+cow+"B";
    }
}
