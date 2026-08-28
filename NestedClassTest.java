class OuterClassOne
{
    OuterClassOne()
    {
        NestedClass nested = new NestedClass();
        nested.simpleMethod();
    }

    static class NestedClass
    {
        public void simpleMethod()
        {
            System.out.println("Nested Instance Method One");
        }
    }
}

class OuterClassTwo
{
    OuterClassTwo()
    {
        NestedClass nested = new NestedClass();
        nested.simpleMethod();
    }

    private static class NestedClass
    {
        public void simpleMethod()
        {
            System.out.println("Nested Instance Method Two");
        }
    }
}

class NestedClassTest
{
    public static void main(String[] args)
    {
        OuterClassOne one = new OuterClassOne();
        OuterClassTwo two = new OuterClassTwo();

        OuterClassOne.NestedClass nested1 = new OuterClassOne.NestedClass();
        nested1.simpleMethod();
        // OuterClassTwo.NestedClass nested2 = new OuterClassTwo.NestedClass();
        // nested2.simpleMethod();
    }
}
