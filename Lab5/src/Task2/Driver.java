package Task2;
import Task1.Student;

import javax.annotation.processing.FilerException;
import java.util.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


public class Driver {
    public static  Vector<Course> courses = new Vector<Course>();
    public static  Vector<Instructor> instructors = new Vector<Instructor>();
    public static  Vector<Textbook>  textbooks = new Vector<Textbook>();
    public  static  String input, login , parol, res,name,sname,title,email,author, isbn,courseTitle;
    public static int department, choose;
    public static  Scanner scan= new Scanner(System.in);
    public  static  void test()
    {
        System.out.println("Choose how to want to logIN" + "\n" + "Press 'a' if you admin" + "\n" + "Press 'u' if you user" + "\n" + "Press exit for EXIT");
        input = scan.next();

        if(input.equals("a"))
        {

               System.out.println("Press your logIN:");
               login = scan.next();
               System.out.println("Press your password:");
               parol = scan.next();
               int hash = parol.hashCode();
               String myHash = hash + "";
               res = login + parol;
               try {
                   FileReader file_out_admin = new FileReader("admin.txt");
                   BufferedReader bf = new BufferedReader(file_out_admin);
                   String lg = bf.readLine();
                   String pr = bf.readLine();
                   if(lg.equals(login) && pr.equals(myHash))
                   {
                       admin(true);
                   }
                   else
                   {
                       System.out.println("WRONG VALUES");

                       test();
                   }

               }
               catch (FileNotFoundException e)
               {
                   System.out.println("file not found");
               }
               catch (IOException e)
               {
                   System.out.println("IO exp");
               }

     }
        if(input.equals("u"))
        {
            user();
        }
        if(input.equals("exit"))
        {
            System.exit(0);
        }
    }
    public static  void user()
    {
             System.out.println("You are LogIN like USER");
             System.out.println("Do you want to view all available courses  " + " \n 1)yes \n 2)no");
             choose = scan.nextInt();
             if(choose == 1 )
             {
                 System.out.println("This is all available courses:");
                 try {
                     FileInputStream file_input = new FileInputStream("course.txt");
                     ObjectInputStream objI = new ObjectInputStream(file_input);
                     Vector<Course> crs = (Vector<Course>)objI.readObject();
                     for(int i= 0;i<crs.size();i++)
                     {
                         System.out.println(i+ 1 + ") " +crs.get(i).courseTitle);
                     }
                     System.out.println("Choose the number of course for view info about this course");
                     choose = scan.nextInt();
                     System.out.println(crs.get(choose - 1).courseTitle + "\nInstructor: " +  crs.get(choose -1).ins.lastName + " " + crs.get(choose -1).ins.firstName + "\nTextbooks : \n" + crs.get(choose - 1).tb.title + "\n");

                 }
                 catch (Exception e)
                 {
                     System.out.println("exp");
                 }
             }
             else {
                 test();
             }


    }
    public static  void admin(boolean fill)
    {


            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            if(fill == true)
            try {
                FileWriter fw = new FileWriter("admin.txt" ,true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(now + " Admin logged into a system");
                bw.close();
            }
            catch (FileNotFoundException e)
            {
                System.out.println("not found");
            }
            catch (IOException e)
            {
                System.out.println("IO");
            }

     System.out.println("You logIN like ADMIN");
         System.out.println("Choose the something");

         System.out.println("1) Add Course" + "\n " +"2) Add Textbook" + "\n" + "3) Add Instructor");
         choose = scan.nextInt();
         switch (choose)
         {
             case 1:
                 try {


                     FileOutputStream file_out_str = new FileOutputStream("course.txt");
                     ObjectOutputStream obj = new ObjectOutputStream(file_out_str);

                     System.out.println("Write the CourseTitle of the course");
                     courseTitle = scan.next();
                     System.out.println("Write the ISBN of the TextBook");
                     isbn = scan.next();
                     System.out.println("Write the title of the TextBook");
                     title = scan.next();
                     System.out.println("Write the author of the TextBook");
                     author = scan.next();
                     Textbook textbook = new Textbook(isbn, author, title);
                     System.out.println("Write the firstName of the Instructor");
                     name = scan.next();
                     System.out.println("Write the secondName of the Instructor");
                     sname = scan.next();
                     System.out.println("Write the department of the Instructor");
                     department = scan.nextInt();
                     System.out.println("Write the email of the Instructor");
                     email = scan.next();
                     Instructor instructor = new Instructor(name, sname, department, email);
                     Course course1 = new Course(courseTitle, textbook, instructor);
                     try {
                         FileWriter fw = new FileWriter("admin.txt" ,true);
                         BufferedWriter bw = new BufferedWriter(fw);
                         bw.newLine();
                         bw.write(now + " Admin added new course "  + courseTitle);
                         bw.newLine();
                         bw.write(now + "Admin added new instructor " + name + sname);
                         bw.newLine();
                         bw.write(now + "Admin added new TextBook " + title);
                         bw.close();

                     }
                     catch (FileNotFoundException e)
                     {
                         System.out.println("not found");
                     }
                     catch (IOException e)
                     {
                         System.out.println("IO");
                     }
                     courses.add(course1);
                     obj.writeObject(courses);
                 }

                 catch (IOException e)
                 {
                     System.out.println("IO");
                 }
                 System.out.println("If you want to add something press 1");
             {
                  choose = scan.nextInt();
                  if(choose == 1 )
                  {
                      admin(false);
                  }
                  else {
                       test();
                  }
             }
                 break;
             case 2:
                 try {
                     FileOutputStream file_out_str = new FileOutputStream("textbook.txt");
                     ObjectOutputStream obj = new ObjectOutputStream(file_out_str);

                     System.out.println("Write the ISBN of the TextBook");
                     isbn = scan.next();
                     System.out.println("Write the title of the TextBook");
                     title = scan.next();
                     System.out.println("Write the author of the TextBook");
                     author = scan.next();
                     Textbook textbook = new Textbook(isbn, author, title);
                     try {
                         FileWriter fw = new FileWriter("admin.txt" ,true);
                         BufferedWriter bw = new BufferedWriter(fw);
                         bw.newLine();
                         bw.write(now + " Admin added new TextBook " + title);
                         bw.close();

                     }
                     catch (FileNotFoundException e)
                     {
                         System.out.println("not found");
                     }
                     catch (IOException e)
                     {
                         System.out.println("IO");
                     }
                     textbooks.add(textbook);
                     obj.writeObject(textbooks);
                 }
                 catch (IOException e)
                 {
                     System.out.println("error");
                 }
                 break;
             case 3:
                 try {

                     FileOutputStream file_out_str = new FileOutputStream("textBook.txt");
                     ObjectOutputStream obj = new ObjectOutputStream(file_out_str);
                     System.out.println("Write the firstName of the Instructor");
                     name = scan.next();
                     System.out.println("Write the secondName of the Instructor");
                     sname = scan.next();
                     System.out.println("Write the department of the Instructor");
                     department = scan.nextInt();
                     System.out.println("Write the email of the Instructor");
                     email = scan.next();
                     try {
                         FileWriter fw = new FileWriter("admin.txt" ,true);
                         BufferedWriter bw = new BufferedWriter(fw);
                         bw.newLine();
                         bw.write( now + " Admin added new Instructor " + title);
                         bw.close();

                     }
                     catch (FileNotFoundException e)
                     {
                         System.out.println("not found");
                     }
                     catch (IOException e)
                     {
                         System.out.println("IO");
                     }
                     Instructor instructor = new Instructor(name, sname, department, email);
                     instructors.add(instructor);
                     obj.writeObject(instructors);
                 }
                 catch (IOException e)
                 {
                     System.out.println("error");
                 }
                 break;
         }

    }
    public  static  void menzhaigoi()
    {
        System.out.println("robit");
    }
    public static  void main(String args[])
    {
         //System.out.println("luffy".hashCode());
         test();
//
    }
}
