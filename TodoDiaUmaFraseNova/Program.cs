using System.IO.Compression;

namespace TodoDiaUmaFraseNova;
public class Program
{
    public static void Main()
    {
        // List for this music lyrics which will be shown
        string[] lyrics = new string[]
        {
            "Não tenho equilíbrio",
            "Não quero cair",
            "Queria esse talento",
            "Gostaria de fugir",
            "\nNão aguento mais",
            "Suportar essa pressão",
            "É um grande desafio",
            "Controlar minha emoção",
            "\nChegou a hora de me libertar",
            "Isso só depende de mim",
            "Se me dedicar vou ficar",
            "\nNo topo do mundo",
            "Onde verei tudo bem de perto",
            "Quase o céu poder tocar",
            "\nNo topo do mundo",
            "Meus sonhos vindo ao meu encontro",
            "Terei asas pra voar",
            "\nNo topo do mundo",
            "(No topo do mundo)",
            "\nNão vou desanimar",
            "Eu vou fazer o certo",
            "Mesmo que eu tente",
            "Uma hora eu acerto",
            "\nNada é muito fácil",
            "Busco a solução",
            "Mas não penso em derrota",
            "Pois é forte o meu coração",
            "\nChegou a hora de me libertar",
            "Isso só depende de mim",
            "Se me dedicar vou ficar",
            "\nNo topo do mundo",
            "Onde verei tudo bem de perto (de perto)",
            "Quase o céu poder tocar",
            "\nNo topo do mundo",
            "Meus sonhos vindo ao meu encontro",
            "Terei asas pra voar",
            "\nNo topo do mundo",
            "\nMais uma vez",
            "Mais uma vez",
            "O meu sonho (o meu sonho)",
            "Vou alcançar",
            "\nPosso sentir",
            "Vou chegar",
            "Alto vou subir",
            "(subir)",
            "No no topo do mundo",
            "Onde verei tudo bem de perto",
            "Quase o céu poder tocar",
            "\nNo topo do mundo",
            "Meus sonhos vindo ao meu encontro",
            "Terei asas pra voar",
            "\nNo topo do mundo",
            "Onde verei tudo bem de perto",
            "Quase o céu poder tocar",
            "\nNo topo do mundo",
            "Meus sonhos vindo ao meu encontro",
            "Terei asas pra voar",
            "\nNo topo do mundo"
        };
        
        //verificar que dia é hoje, comparar com a data inicial
        DateTime initialDate = new DateTime(2020, 09, 16);
        DateTime todayDate = DateTime.Now;

        //Se hoje é o primeiro dia da modificação, escrever a primeira letra da música. Quero verificar quantos dias se passáram
        TimeSpan daysPassed = todayDate - initialDate;
        int countingDays = daysPassed.Days;
        /* Anotação didática, .iggnore:
            Mas como faço ele acessar apenas a frase do dia? Se cada frase do dia é um desses vetores, então como acessar eles?

            A lógica para acessar o local do array por uma variável
            int x = 0;
            string z = lyrics[x];
            Console.WriteLine(z);
        */
        for (int i = 0; i <= countingDays; i++)
        {
            if (i >= lyrics.Length)
            {
                Console.WriteLine("Você chegou ao fim da música.");
                break;
            }
            Console.WriteLine($"{i} - {lyrics[i]}");

        }

        /* TODO:
            - Lógica para mostrar em um arquivo.
        */
    }
}