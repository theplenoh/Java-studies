class prob13_2_2
{
    public static void rotateRows(int[][] arr)
    {
        int[] lastRow = arr[arr.length - 1];

        for(int i = arr.length - 1; i > 0; i--)
        {
            arr[i] = arr[i - 1];
        }

        arr[0] = lastRow;

    }

    public static void main(String[] args)
    {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotateRows(arr);
        rotateRows(arr);

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
