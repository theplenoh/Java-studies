class prob13_2_1
{
    public static void addOneDArr(int[] arr, int add)
    {
        for(int i=0; i<arr.length; i++)
            arr[i]+=add;
    }
    public static void addTwoDArr(int[][] arr, int add)
    {
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                arr[i][j]+=add;
    }
    public static void main(String[] args)
    {
        int[][] arr = {
            {17}, 
            {1, 2, 3}, 
            {4, 5}, 
            {6, 7, 8, 9}
        };

        addTwoDArr(arr, 1);

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println("");
        }
    }
}
