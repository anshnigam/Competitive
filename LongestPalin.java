class LongestPalin{
    public String longestPalindrome(String s){
        boolean[][] P = new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            P[i][i] = true;
            P[i][i+1] = (s.charAt(i) == s.charAt(i+1)) ;
        }
            
        for(int i=0;i<s.length()-2;i++){
            for(int j=i+2;j<s.length();j++){
                P[i][j] = P[i+1][j-1] && (s.charAt(i) == s.charAt(j))  ;
            }
        }
        int im=0,jm=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(P[i][j] && ((jm-im+1)<(j-i+1))){
                    jm = j;
                    im = i;
                }
            }
        }
        return s.substring(im,jm+1);
    }
}