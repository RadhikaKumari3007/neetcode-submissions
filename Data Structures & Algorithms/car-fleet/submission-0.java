class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        
        // Sort indices by position descending (closest to target first)
        Arrays.sort(idx, (a, b) -> position[b] - position[a]);
        
        int fleets = 0;
        double prevTime = 0; // time of the fleet immediately ahead
        
        for (int i = 0; i < n; i++) {
            int p = position[idx[i]];
            int s = speed[idx[i]];
            double time = (double) (target - p) / s;
            
            // If this car takes longer than the car(fleet) ahead of it,
            // it can't catch up -> forms a new fleet
            if (time > prevTime) {
                fleets++;
                prevTime = time;
            }
            // else it merges into the fleet ahead (prevTime stays the same)
        }
        
        return fleets;
    }
}