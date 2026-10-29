
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    //构造方法，接受传入的数组
    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] ++;
    }

    public boolean hasDayWithoutBirds() {
        for (int count: birdsPerDay){
            if (count == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;

        int limit = Math.min(numberOfDays, birdsPerDay.length);
        
        for (int i = 0; i < limit; i++){
            total = total + birdsPerDay[i];
        }
        return total;
    }

    public int getBusyDays() {
        int sum = 0;

        for ( int i = 0; i < birdsPerDay.length; i++){
            if (birdsPerDay[i] > 4) {
                sum ++;
            }
        }

        return sum;
    }
}
