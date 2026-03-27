class Solution {
    public boolean doesAliceWin(String s) {
        int a=s.length();
        int c=0;
        
        for(int i=0;i<a;i++){
            char ch=s.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            c++;
                }

            }
        return c>0;
        
    }
}