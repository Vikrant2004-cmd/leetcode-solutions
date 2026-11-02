
class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length())
            return s;

        List<StringBuilder> rows = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0;
        int direction = 1;

        for (int i = 0; i < s.length(); i++) {

            rows.get(currentRow).append(s.charAt(i));

            if (currentRow == 0) {
                direction = 1;
            }
            else if (currentRow == numRows - 1) {
                direction = -1;
            }

            currentRow += direction;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            result.append(rows.get(i));
        }

        return result.toString();
    }
}
