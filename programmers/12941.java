import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        
        return IntStream
            .range(0, A.length)
            .map((i) -> A[i] * B[B.length - i - 1])
            .sum();
    }
}
