class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1)
            return 1;
        StringBuilder sb = new StringBuilder();
        char curC = chars[0];
        int count = 0;

        for (char c : chars) {
            if (curC == c) {
                count++;
                continue;
            }
            sb.append(curC);
            curC = c;
            if (count == 1)
                continue;
            String temp = Integer.toString(count);
            for (char t : temp.toCharArray()) {
                sb.append(t);
            }
            count = 1;
        }
        sb.append(curC);
        if (count != 1) {
            String temp = Integer.toString(count);
            for (char t : temp.toCharArray()) {
                sb.append(t);
            }
        }
        int i = 0;
        for (char c : sb.toString().toCharArray()) {
            chars[i++] = c;
        }

        return sb.toString().toCharArray().length;
    }
}