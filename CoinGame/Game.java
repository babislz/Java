import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game 
{
    
    public void game() 
    {
    }

    // public void shuffleList()
    // {
    //     Scanner scanner2 = new Scanner(System.in);
    //     System.out.println("Quantos jogadores você deseja adicionar?: ");
    //     int size = scanner2.nextInt();

    //     ArrayList<Individuo> list = new ArrayList<>(size);
    //     Bondoso b = new Bondoso();
    //     Trapaceiro t = new Trapaceiro();
        
    //     list.add(b);
    //     list.add(t);

    //     Collections.shuffle(list);
    // }

    public void addList()
    {   
        Bondoso bondoso = new Bondoso();
        Trapaceiro trapaceiro = new Trapaceiro();
        Ressentido ressentido = new Ressentido();
        Copiador copiador = new Copiador();
        Agressivo agressivo = new Agressivo();
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos jogadores você deseja adicionar?: ");
        int size = scanner.nextInt();
        
        ArrayList<Individuo> chose = new ArrayList<>(size);
        
        System.out.println("Quantos bondosos?: ");
        int bondososQtd = scanner.nextInt();

        System.out.println("Quantos trapaceiros?: ");
        int trapaceiroQtd = scanner.nextInt();

        System.out.println("Quantos ressentidos?: ");
        int ressentidoQtd = scanner.nextInt();

        System.out.println("Quantos copiadores?: ");
        int copiadorQtd = scanner.nextInt();

        System.out.println("Quantos agressivos?: ");
        int agressivoQtd = scanner.nextInt();
        

        for(int i = 0; i < size; i++)
        {
            int index1 = rand.nextInt(chose.size());
            int index2 = rand.nextInt(chose.size());

            Individuo value1 = chose.get(index1);
            Individuo value2 = chose.get(index2);

            chose.set(index1, value2);
            chose.set(index2, value1);
        }

        // for(int i = 0; i < size; i++)
        // {
        //     System.out.println("Insira o elemento" + (i + 1) + ":");
        //     String type = scanner.nextLine();

        //     if (type.equals("bondoso")) {
        //         chose.add(new Bondoso());
        //     }

        //     if (type.equals("trapaceiro")){
        //         chose.add(new Trapaceiro());
        //     }
            
        //     if (type.equals("ressentido")){
        //         chose.add(new Ressentido());
        //     }   
            
        //     if (type.equals("copiador")){
        //         chose.add(new Copiador());
        //     }
            
        //     if (type.equals("agressivo")){
        //         chose.add(new Agressivo());
        //     }
        // }
    }

    public static void main(String[] args)
    {

    }
}
