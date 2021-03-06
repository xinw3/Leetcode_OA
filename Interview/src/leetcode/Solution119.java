import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        Integer[] result =  new Integer[rowIndex + 1];
        Arrays.fill(result, 0);
        result[0] = 1;
        for(int i = 1; i < rowIndex + 1; i++)
            for(int j = i; j >= 1; j--)
                result[j] += result[j - 1];
        return Arrays.asList(result);
    }
    public static void main(String[] args) {
        Solution119 s = new Solution119();
        List<Integer> list = s.getRow(2);
        for (Integer l : list) {
            System.out.println(l);
        }
    }
}