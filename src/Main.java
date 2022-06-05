import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        String name="yusuf ishak damar";

        File file =new File("C:\\Users\\yusuf\\Desktop\\dosya.txt"); // DOSYA AÇMA İŞLEMİ
        if (!file.exists()){ //
            file.createNewFile();
            System.out.println(file.getName()+" adli dosya acilmistir.");
        }

        FileWriter fileWriter= new FileWriter(file,false); // DOSYA YAZDIRMA İŞLEMİ
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        if (file.exists()){
            bufferedWriter.write(name);
            System.out.println("Dosyaya yazdirildi.");
            bufferedWriter.close();
        }

        FileReader fileReader=new FileReader(file); //DOSYA OKUMA İŞLEMİ
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line;
        if (file.exists()){
            while ((line=bufferedReader.readLine()) !=null){
                System.out.println(line);
            }
        }
    }
}
