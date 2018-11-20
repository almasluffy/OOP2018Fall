package Task1;

import  java.util.*;
import  java.io.*;
import java.util.RandomAccess;
import java.util.StringTokenizer;

public class Test {
    static   void  f()
    {
        ArrayList<Student> myStudents = new  ArrayList<Student>();
        int best = 0;
        String winner = "";
        try {
            FileReader in_file = new FileReader("input.txt");
            FileWriter out_file = new FileWriter("output.txt",false);


           BufferedReader bf = new BufferedReader(in_file);
           BufferedWriter bw = new BufferedWriter(out_file);


           String line = bf.readLine();

            while(line != null)
            {
                //System.out.println(line);
                String[] ss = line.split(" ");

                Student std = new Student(ss[0],ss[1],Integer.parseInt(ss[2]));
                myStudents.add(std);
                line = bf.readLine();
            }
            for(int i = 0;i<myStudents.size();i++) {
                if(best < myStudents.get(i).points)
                {
                    best = myStudents.get(i).points;
                }
            }

            for(int i = 0;i<myStudents.size();i++) {
                if (myStudents.get(i).points >= best - 10) {
                    bw.write(i + 1  + ") " + myStudents.get(i).firstname + " " + myStudents.get(i).lastname  + " - 'A'");
                }
                else  if (myStudents.get(i).points >= best - 20) {
                    bw.write(i + 1  + ") " +myStudents.get(i).firstname + " " + myStudents.get(i).lastname + " - 'B'");
                }
                else if (myStudents.get(i).points >= best - 30) {
                    bw.write(i + 1  + ") " +myStudents.get(i).firstname + " " + myStudents.get(i).lastname + " - 'C'");
                }
                else if (myStudents.get(i).points >= best - 40) {
                    bw.write(i + 1  + ") " +myStudents.get(i).firstname + " " + myStudents.get(i).lastname  + " - 'D' ");
                }
                else {
                    bw.write(i + 1  + ") " +myStudents.get(i).firstname + " " + myStudents.get(i).lastname + " - 'F'");
                }
                bw.newLine();
            }
            bf.close();
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e)
        {
            System.out.println("error");
        }
}

    static  void f2()
    {
        ArrayList<Student> myStudents = new  ArrayList<Student>();

        int sum = 0;
        String winner = "";
        try {
            FileReader in_file = new FileReader("input.txt");

            FileWriter out_file2 = new FileWriter("output.txt", true);

            BufferedReader bf = new BufferedReader(in_file);
            BufferedWriter bw2 = new BufferedWriter(out_file2);

            String line = bf.readLine();

            while(line != null)
            {
                //System.out.println(line);
                String[] ss = line.split(" ");

                Student std = new Student(ss[0],ss[1],Integer.parseInt(ss[2]));
                myStudents.add(std);
                line = bf.readLine();
            }
            int max = myStudents.get(0).points;
            int min = myStudents.get(0).points;
            for(int i = 1;i<myStudents.size();i++) {
                if(max < myStudents.get(i).points)
                {
                    max = myStudents.get(i).points;

                }
                if(min > myStudents.get(i).points)
                {
                    min = myStudents.get(i).points;
                }
                sum+=myStudents.get(i).points;
            }
            int avg = sum/(myStudents.size());
            bw2.newLine();
            bw2.write("Average - " + avg);
            bw2.newLine();
            bw2.write("Maximum - " + max);
            bw2.newLine();
            bw2.write("Minimum - " + min);
            bw2.newLine();
            bf.close();
            bw2.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e)
        {
            System.out.println("error");
        }
    }
    public static  void main(String args[])
    {
        f();
        f2();
    }
}

