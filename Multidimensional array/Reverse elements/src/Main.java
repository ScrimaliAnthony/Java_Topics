class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        for (int i = 0; i < twoDimArray.length; i++) {
            int left = 0;
            int right = twoDimArray[i].length - 1;

            while (left < right) {
                int temp = twoDimArray[i][left];
                twoDimArray[i][left] = twoDimArray[i][right];
                twoDimArray[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}