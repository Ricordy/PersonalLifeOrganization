import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.List;


public class Storager {
    

    File file;
    List<String[]> readed;
    List<String[]> toWrite;
    BufferedReader csvReader;
    PrintWriter csvWriter;

    public Storager(){

    }



    public List<String[]> readFromFile() {

        try {
            csvReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = csvReader.readLine()) != null) {
                readed.add(line.split(","));
            }

            return readed;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("unable to read file: " + file.getName());
            // TODO: handle exception
        }

        return null;
    }

    public List<String[]> readFromFile(String path) {

        try {
            csvReader = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = csvReader.readLine()) != null) {
                readed.add(line.split(","));
            }

            return readed;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("unable to read file: " + path);
            // TODO: handle exception
        }

        return null;

        
    }


    public void writeOnFile(List<String[]> toAdd){

        try {
            toAdd.forEach((line) -> {
                csvWriter.write(prepareStringToCsv(line));

            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("error mfunction writeOnFile");
        }


    }






    private String prepareStringToCsv(String[] toPrepare){
        String finalS = "";
        
        for (String palavra:toPrepare){
            finalS += "," + palavra;
        }

        StringBuilder helper = new StringBuilder(finalS);
        helper.deleteCharAt(0);
        finalS = helper.toString();


        return finalS;
    }









    //Setters and getters

    public File getFile() {
        return file;
    }
    public List<String[]> getReaded() {
        return readed;
    }
    public List<String[]> getToWrite() {
        return toWrite;
    }
    public void setFile(File file) {
        this.file = file;
    }
    public void setReaded(List<String[]> readed) {
        this.readed = readed;
    }
    public void setToWrite(List<String[]> toWrite) {
        this.toWrite = toWrite;
    }
    public void setFileByPath(String path) {
        file = new File(path);
    }


}
