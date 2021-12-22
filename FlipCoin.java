class FlipCoin
{
    public static void main(String[] args)
    {
        int loopCount = 1;
        double result;
        int heads = 0;
        while(loopCount <= 10)
        {
            result = Math.random();
            if(result <=0.5)
                System.out.println("Coin is heads.");
            if(result <= 0.5)
                heads = heads++;
            else
                System.out.println("Coin is tails.");
            loopCount = loopCount + 1;
        }
        double per;
	}
}