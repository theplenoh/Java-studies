class prob4_1_2
{
    public static void main(String[] args)
    {
        int num1=0, num2=0;
        boolean result;

        result = (num2+=10)>0 && (num1+=10)<0;
        System.out.println("result="+result);
        System.out.println("num1="+num1+", num2="+num2);

        result = (num2+=10)>0 || (num1+=10)>0;
        System.out.println("result="+result);
        System.out.println("num1="+num1+", num2="+num2);
    }
}
