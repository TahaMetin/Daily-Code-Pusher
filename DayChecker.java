import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DayChecker {
    public static void main(String[] args) {
        String bugun,dun="";

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("dd");
        bugun = formatter.format(calendar.getTime());
        System.out.println(bugun);

        try {   // dosya yoksa oluşturur, varsa birşey yapmaz.
            File myObj = new File("yesterday.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        try {  // dosyadan okur
            File myObj = new File("yesterday.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                dun= myReader.nextLine();
                System.out.println(dun);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        if(dun.equals(bugun)){
            System.out.println("Today already code uploaded.");;
        }else{
            try {
                Runtime.
                        getRuntime().
                        exec("cmd /c start \"\" DailyGithubCodePusher.bat");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {  // dosyaya bu günün ayın kaçıncı günü olduğunu yazar
            FileWriter myWriter = new FileWriter("yesterday.txt");
            myWriter.write(bugun);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
