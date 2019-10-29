import java.util.*;
import java.io.*;
public class Main
{
 public  static  void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        File file = new File(".//input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String s="";
        List<String> input =new ArrayList<>();
        while((s=br.readLine())!=null){
         input.add(s);
        }
        String res[]=input.get(input.size()-1).split(" ");
        int inputArr[][]=new int[input.size()][res.length];
        int i=0;
        for(String t:input){
            String temp[]=t.split(" ");
            for(int j=0;j<temp.length;j++){
                inputArr[i][j]=Integer.parseInt(temp[j]);
            }
            i++;
        }
        for(int row=inputArr.length-2;row>=0;row--){
            for(int column=0;column<inputArr[row].length-1;column++){
                inputArr[row][column]+=Math.max(inputArr[row+1][column],inputArr[row+1][column+1]);
            }
        }
        System.out.println(inputArr[0][0]);
    }
}

