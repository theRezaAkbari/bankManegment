package File;

import java.io.*;
import java.util.Scanner;

public class FileManegment {
    public void informationWrite(String info,String filePath) throws IOException {
        FileWriter fw=new FileWriter(filePath,true);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        pw.println(info);
        pw.close();
    }
    public boolean loginBanks(String userName,String paswword,String bank,String useDelimiter,String filePath){
        String currentLine;
        String data[];
        try {
            FileReader fr=new FileReader(filePath);
            BufferedReader bf=new BufferedReader(fr);
            while ((currentLine=bf.readLine()) !=null){
                data=currentLine.split(useDelimiter);
                if(data[2].equals(userName) && data[3].equals(paswword) && data[4].equals(bank)){

                    return true;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean login(String userName,String paswword,String useDelimiter,String filePath){
        String currentLine;
        String data[];
        try {
            FileReader fr=new FileReader(filePath);
            BufferedReader bf=new BufferedReader(fr);
            while ((currentLine=bf.readLine()) !=null){
                data=currentLine.split(useDelimiter);
                if(data[2].equals(userName) && data[3].equals(paswword)){

                    return true;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

}
