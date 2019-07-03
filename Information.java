/*
Date - 02 July 2019
Author - rpetwal

*/

/*
  *This class will store the player information on a external file
  *Information include player name and score
*/

import java.io.*;

class Information extends Class1
{
    String filename;
    String pl;
    int hss;
    void run()
    {
        new Class1();
        if(diff.equals("Easy"))
            filename = "easy.bin";
        else if(diff.equals("Medium"))
            filename = "medium.bin";
        else
            filename = "hard.bin";
    }
    void saveAll()throws IOException
    {
        String hs;
        hs = highscore+"";
        FileWriter fw = new FileWriter(filename,true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println(name+" "+hs);
    }
    void readInfo()throws IOException
    {
        String read;
        String name1,name2="";
        int score,hscore=0;
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        while((read = br.readLine())!= null)
        {
            int len = read.length();
            int bk = 0;
            for(int i=0; i<len; i++)
            {
                if(read.charAt(i) == 32)
                {
                    bk = i;
                    break;
                }
            }
            name1 = read.substring(0,bk);
            score = Integer.parseInt(read.substring(bk+1,len));
            if(score > hscore)
            {
                hscore = score;
                name2 = name1;
            }
        }
        pl = name2;
        hss = hscore;
    }
}