public class FlourPacker {
    public static boolean canPack(int bigCount, int smalCount, int goal) {
        while (goal != 0) {
            for(int i=bigCount; i>0; i--) {
                if(goal >= 5) goal -=5;
                if(goal == 0) return true;
            }
            for(int j=smalCount; j>0; j--) {
                goal--;
                if(goal == 0) return true;
            }
            return false;
        }
        return true; // goal == 0
    }
}
