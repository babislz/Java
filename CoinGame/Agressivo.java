public class Agressivo extends Individuo
{
    //começa confiando até que alguém cometa uma trpaça com ele, a partir desse momento, ele trapaceia 3 vezes e depois volta a confiar.
    void startGameAgressivo() 
    {
        play();
    }

    @Override
    public void win() 
    {
        
    }
}