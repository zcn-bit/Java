public class Path {

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        for (int i = 0; i < matrix.length; i++) {
            boolean result = hasPath(matrix, rows, cols, str, 0, new boolean[matrix.length], i % cols, i / cols);
            if (result) {
                return true;
            }
        }
        return false;
    }


    public boolean hasPath(char[] matrix, int rows, int cols, char[] str, int index, boolean[] ifOk, int currentX, int currentY) {
        if (index >= str.length) {
            return true;
        }
        int position = currentY * cols + currentX;

        if (currentX < 0 || currentX >= cols || currentY < 0 || currentY >= rows || ifOk[position] || str[index] != matrix[position]) {
            return false;
        }
        ifOk[position] = true;

        boolean judge = hasPath(matrix, rows, cols, str, index + 1, ifOk, currentX + 1, currentY)
                || hasPath(matrix, rows, cols, str, index + 1, ifOk, currentX - 1, currentY)
                || hasPath(matrix, rows, cols, str, index + 1, ifOk, currentX, currentY + 1)
                || hasPath(matrix, rows, cols, str, index + 1, ifOk, currentX, currentY - 1);

        if (judge) {
            return true;
        } else {
            //在这个递归里改的，就在这里复原
            ifOk[position] = false;
            return false;
        }
    }


}
