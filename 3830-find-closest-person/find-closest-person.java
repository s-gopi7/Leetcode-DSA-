class Solution {
    public int findClosest(int x, int y, int z) {
        int first_person=Math.abs(z-x);
        int second_person=Math.abs(z-y);
        if(first_person==second_person){
            return 0;
        }
        else if(first_person>second_person){
            return 2;
        }
        else{
            return 1;
        }
        
    }
}