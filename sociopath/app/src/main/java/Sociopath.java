import java.util.List;

public class Sociopath {

    public int findTheSociopath (int groupSize, List<int []> likeList) {

        if (groupSize <= 0) return -1;

        int[] given = new int[groupSize + 1];
        int[] received = new int[groupSize + 1];

        for (int[] p : likeList) {
            if (p[0] <= 0 || p[0] > groupSize || p[1] <= 0 || p[1] > groupSize) {
                return -1;
            }
            given[p[0]]++;
            received[p[1]]++;
        }

        for (int i = 1; i <= groupSize; i++) {
            if (given[i] == 0 && received[i] == groupSize - 1) {
                return i;
            }
        }
        return -1;
    }
}
