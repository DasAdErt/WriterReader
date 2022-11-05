import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("word.txt", false))
        {
            String firstText = "1 часть программы.\n";
            writer.write(firstText);

            //была попытка, но я её провалил и не смог додуматься.

            String secondText = "Конец 1 части программы.\n";
            writer.write(secondText);


            String threeText = "2 часть программы.\n";
            writer.write(threeText);

            String fourText = "\nЯ помню чудное мгновенье:\n" +
                    "Передо мной явилась ты,\n" +
                    "Как мимолетное виденье,\n" +
                    "Как гений чистой красоты.\n";
            writer.write(fourText);

            writer.append('\n');
            writer.append("Делал: Студент КИ-25 Ткачёв Михаил Валерьевич");

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileReader reader = new FileReader("word.txt"))
        {
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}