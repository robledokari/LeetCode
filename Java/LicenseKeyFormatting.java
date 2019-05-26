// 482. License Key Formatting

class Solution {
    public String licenseKeyFormatting(String S, int K) {
       
        StringBuilder sb = new StringBuilder();
        int i = S.length()-1;
        int k = 0;
        while(i>=0){
            char c = S.charAt(i);
            if(c!='-'){
                if(k<K)
                {
                    sb.append(c);
                    k++;
                }else
                {
                    k=0;
                    sb.append('-');
                    sb.append(c);
                    k++; //don't forget to do k++ because the previous line
                }   
            }
            i--;
        }
        return sb.reverse().toString().toUpperCase();
        
    }
}
