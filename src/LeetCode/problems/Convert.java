package LeetCode.problems;

/**
 * created by koujx on 2016/1/22.
 * 6. zigzag conversion
 */
public class Convert {
    public String convert(String text, int nRows) {
        String conversion = "";
        if (nRows == 1) conversion = text;
        else {
            int n = nRows - 1;
            for (int i = 1; i <= nRows; i++) {
                int temp1 = i;
                while (temp1 <= text.length()) {
                    conversion += text.charAt(temp1 - 1);
                    int temp2 = temp1 + 2 * nRows - 2 * i;
                    if (i != 1 && i != nRows && temp2 <= text.length()) {
                        conversion += text.charAt(temp2 - 1);
                    }
                    temp1 += 2 * n;
                }
            }
        }
        return conversion;
    }

}
