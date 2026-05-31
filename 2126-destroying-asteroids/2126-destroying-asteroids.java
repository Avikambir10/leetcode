class Solution {
    public boolean asteroidsDestroyed(int planet_mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long mass = 0;
        mass += planet_mass;
        for(int asteroid : asteroids){
            if(mass >= asteroid){
                mass += asteroid;
            }else {
                return false;
            }
        }
        return true;      
    }
}