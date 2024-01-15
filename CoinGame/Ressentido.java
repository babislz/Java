public class Ressentido extends Individuo
{
    //sempre confia até que alguém faça uma trapaça com ele, a partir desse ponto ele apenas trapaceia
    void startGameRessentido() 
    {
        play();
        coin--;
    }

    @Override
    public void win() 
    {
        
    }
}