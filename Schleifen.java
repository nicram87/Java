public  class  Schleifen
{
    public static void main(String[] args)
    {
        int zaehler = 0;
        do
        {
            System.out.println("Hello world");
            zaehler++;
        }
        while (zaehler < 20);

        System.out.println();

        zaehler = 0;
        while (zaehler < 20)
        {
            System.out.println("Hello world");
            zaehler++;
        }

        System.out.println();
        for(int  i = 0; i < 20; i++)
        {
            System.out.println("Hello World");
        }
    }
}
