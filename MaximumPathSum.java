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
        int max=0;
        while((s=br.readLine())!=null){
         input.add(s);
        }
        String res[]=input.get(input.size()-1).split(" ");
        int arr[][]=new int[input.size()][res.length];
        int i=0;
        for(String t:input){
            String temp[]=t.split(" ");
            for(int j=0;j<temp.length;j++){
                arr[i][j]=Integer.parseInt(temp[j]);
            }
            i++;
        }
        for(int i1=arr.length-2;i1>=0;i1--){
            for(int j=0;j<arr[i1].length-1;j++){
                arr[i1][j]+=Math.max(arr[i1+1][j],arr[i1+1][j+1]);
            }
        }
        System.out.println(arr[0][0]);
    }
}

