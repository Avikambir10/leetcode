class Solution {
public:
    int minimumBoxes(vector<int>& apple, vector<int>& capacity) {
        sort(capacity.begin(),capacity.end(),greater<int>());
        int sum = 0;
        int cnt = 1;
        for(int i=0;i<apple.size();i++){
            sum += apple[i];
        }
        for(int i = 0 ;i < capacity.size() ;i++) {
            int rem = sum - capacity[i];
            sum = rem;
            if(rem == 0 || rem < 0 ){
                break;
            }
            cnt++;
        }

        return cnt;

    } 
};