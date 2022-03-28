public class funcs {
    public static double[][] multiplyByMatrix(double[][] matrix1, double[][] matrix2) {
        int m1ColLength = matrix1[0].length;
        int m2RowLength = matrix2.length;
        if(m1ColLength != m2RowLength) return null;
        int mRRowLength = matrix1.length;
        System.out.println(matrix1.length);
        int mRColLength = matrix2[0].length;
        System.out.println(matrix2[0].length);
        double[][] matrix3 = new double[mRRowLength][mRColLength];
        System.out.println(mRRowLength);
        System.out.println(mRColLength);
        System.out.println(m1ColLength);
        for(int row = 0; row < mRRowLength; row++) {
            for(int column = 0; column < mRColLength; column++) {
                for(int column2 = 0; column2 < m1ColLength; column2++) {
                    matrix3[row][column] += matrix1[row][column2] * matrix2[column2][column];
                }
            }
        }
        return matrix3;
    }
    public static String toString(double[][] matrix) {
        String result= "";
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                result += String.format("%11.2f", matrix[i][j]);
            }
            result += "\n";
        }
        return result;
    }
}
