class Solution {
    static int solve(int bt[] ) {
    // code here
    int n=bt.length;
    Arrays.sort(bt);
    int wt=0,ct=0;
    for(int i=0;i<n;i++){
        wt+=ct;
        ct+=bt[i];
    }
    return wt/n;

  }
}
