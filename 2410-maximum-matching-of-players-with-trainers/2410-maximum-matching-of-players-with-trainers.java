class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int Tp =0;
        int Pp=0;
        Arrays.sort(trainers);
        Arrays.sort(players);
        int count =0;
        while(Pp!=players.length && Tp!=trainers.length){
            if(players[Pp]<=trainers[Tp]){
                count++;
                Tp++;
                Pp++;
            }
            else{
                Tp++;
            }
        }
        
    return count;

    }
}