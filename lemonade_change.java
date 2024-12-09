class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f=0,t=0,tw=0;
        long n=bills.length;
        for(int i=0;i<n;i++){
            if(bills[i]==5){
                f+=1;
            }
            else if(bills[i]==10){
                if(f>=1){
                    t+=1;
                    f-=1;
                }
                else{
                    return false;
                }
            }
            else{
                if(t>=1 && f>=1){
                    t-=1;
                    f-=1;
                }
                else if(f>=3){
                    f-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
        
    }
}
