class Solution {

    int convertToDayNum(String date) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        int total = day;

        for (int i = 0; i < month - 1; i++)
            total += days[i];
        return total;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int allicearrival = convertToDayNum(arriveAlice);
        int allicedpt = convertToDayNum(leaveAlice);

        int bobarrival = convertToDayNum(arriveBob);
        int bobdpt = convertToDayNum(leaveBob);

        int laterArrival = Math.max(allicearrival, bobarrival);
        int earlierdpt = Math.min(allicedpt, bobdpt);

        if (earlierdpt < laterArrival)
            return 0;
        return earlierdpt - laterArrival + 1;
    }
}