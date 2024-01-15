public abstract class Individuo 
{
    public boolean isDead = false;
    public int coin = 10;
 
    public void dead()
    {
        if(coin == 0)
        {
            isDead = true;
        }
    }

    public void play()
    {
        coin--;
    }

    public abstract void win();
    
}

