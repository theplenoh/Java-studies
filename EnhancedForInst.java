class Number
{
    public int num;
    public Number(int num) { this.num = num; }
    public int getNum() { return num; }
}

class EnhancedForInst
{
    public static void main(String[] args)
    {
        Number[] arr = new Number[] {
            new Number(2), 
            new Number(4), 
            new Number(8)
        };

        for(Number each : arr)
            each.num++;

        for(Number each : arr)
            System.out.print(each.getNum() + " ");

        System.out.println("");
        for(Number each : arr)
        {
            each = new Number(5);
            each.num += 2;
            System.out.print(each.getNum()+" ");
        }

        System.out.println("");
        for(Number each : arr)
            System.out.print(each.getNum()+" ");
    }
}
