/*
Date - 04 July 2019
Author - rpetwal

*/

/*
 ** This class will store the information and score of the players
*/


import java.io.*;

class Information
{
    String filename,name,diff;
    int score;
    Information()
    {
        name = "";
        diff = "";
        score =  0;
    }
    Information(String name,String diff,int score)
    {
        this.name = name;
        this.diff = diff;
        this.score = score;
    }
    
    void save_data()throws IOException
    {
        if(diff.equalsIgnoreCase("Easy"))
            filename = "easy.bin";
        else if(diff.equalsIgnoreCase("Medium"))
            filename = "medium.bin";
        else
            filename = "hard.bin";
        FileWriter fw = new FileWriter(filename,true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println(name+" "+score+"");
        pw.close();
        bw.close();
        fw.close();
    }
    
    String [] retData()throws IOException
    {
        String [] data = new String [6];
        String ename="",mname="",hname="",read,temp;
        int easy=-1,medium=-1,hard=-1,tempscore=0;
        FileReader fr;
        BufferedReader br;
        fr = new FileReader("easy.bin");
        br = new BufferedReader(fr);
        while((read = br.readLine()) != null)
        {
            int index = 0;
            int len = read.length();
            char ch;
            for(int i=0; i<len; i++)
            {
                ch = read.charAt(i);
                if(ch == 32)
                {
                    index = i;
                    break;
                }
            }
            temp = read.substring(0,index);
            tempscore = Integer.parseInt(read.substring(index+1,len));
            if(easy<tempscore)
            {
                easy = tempscore;
                ename = temp;
            }
        }
        br.close();
        fr.close();
        fr = new FileReader("medium.bin");
        br = new BufferedReader(fr);
        while((read = br.readLine()) != null)
        {
            int index = 0;
            int len = read.length();
            char ch;
            for(int i=0; i<len; i++)
            {
                ch = read.charAt(i);
                if(ch ==32)
                {
                    index = i;
                    break;
                }
            }
            temp = read.substring(0,index);
            tempscore = Integer.parseInt(read.substring(index+1,len));
            if(medium < tempscore)
            {
                medium = tempscore;
                mname = temp;
            }
        }
        br.close();
        fr.close();
        fr = new FileReader("hard.bin");
        br = new BufferedReader(fr);
        while((read = br.readLine()) != null)
        {
            int index = 0;
            int len = read.length();
            char ch;
            for(int i=0; i<len; i++)
            {
                ch = read.charAt(i);
                if(ch == 32)
                {
                    index = i;
                    break;
                }
            }
            temp = read.substring(0,index);
            tempscore = Integer.parseInt(read.substring(index+1,len));
            if(hard < tempscore)
            {
                hard = tempscore;
                hname = temp;
            }
        }
        data[0] = ename;
        data[1] = easy+"";
        data[2] = mname;
        data[3] = medium+"";
        data[4] = hname;
        data[5] = hard+"";
        return data;
    }
 /*
    public static void main(String [] args)throws IOException
    {
        Information ob = new Information();
        String [] str = ob.retData();
        for (String str1 : str) {
            System.out.println(str1);
        }
    }
   */ 
}