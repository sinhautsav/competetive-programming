package online.topcoder;

/**
 * Author: Utsav Sinha of House Sinha. First of his name. King In The East.
 * Reviewed By:
 * Project: TopCoder
 * Created On : 7/25/18
 * Organisation: CustomerXPs Software Private Limited
 */
public class ZigZag {

    public int longestZigZag(int[] sequence){
        if(sequence == null) return 0;
        if(sequence.length == 1) return 1;
        int[] differences = new int[sequence.length];
        for(int i = 0; i < sequence.length - 1; i++){ differences[i] = sequence[i] - sequence[i+1]; }
        int length = 1;
        for (int i = 1; i < differences.length; i++) {}
        return  0;

    }

    public static void main(String[] args) {
        ZigZag zigZag = new ZigZag();
        zigZag.longestZigZag(new int[]{ 1, 7, 4, 9, 2, 5 });
    }
}
