class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int s1=g.length;
        int s2=s.length;
        int l=0,r=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        while(r<s1 && l<s2){
            if(s[l]>=g[r]){
                count+=1;
                l++;r++;
            }
            else if(s[l]<g[r]){
                l++;
            }
        }
        return count;
        
    }
}
