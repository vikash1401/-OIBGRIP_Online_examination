import java.util.*;
import java.util.HashMap;
public class Main{
        HashMap<String,Integer> data=new HashMap <String,Integer>();
        Scanner sc=new Scanner(System.in);
        public void login(){
            data.put("vikash",121);
            data.put("Tarun",131);
            data.put("Virat",111);
            data.put("Ankit",125);
            data.put("gurav",115);
            System .out.println("********Welcome To Oasis Infobyte******** ");
            System.out.println("Enter Name :");
            String Name=sc.nextLine();
            System.out.println("Enter Rollno :");
            int Rollno=sc.nextInt();
            if (data.containsKey(Name) && data.get(Name)==Rollno){
                System.out.println("Successfully Logged-in!");
                menu();
            }
            else{
                System.out.println("Invalid login!,Try again..");
                login();
            }
        }
        public void menu(){
            System.out.println("\nSelect any one !");
            System.out.println("1.UPDATE Name AND Rollno\n2.START THE EXAM\n3.LOGOUT");
            System.out.println("Enter your option :");
            int op=sc.nextInt();
            switch(op){
                case 1 : data=update();
                    menu();
                    break;
                case 2 : writeExam();
                    menu();
                    break;
                case 3 : System.exit(0);
                    break;
                default: System.out.println("Invalid option!");
            }
        }
        public HashMap<String,Integer> update(){
            System.out.println("UPDATE PROFILE");
            System.out.println("Enter Name : ");
            Scanner in=new Scanner(System.in);
            String uid=in.nextLine();
            if (data.containsKey(uid)){
                System.out.println("Enter new Rollno : ");
                int newpwd=sc.nextInt();
                data.replace(uid,newpwd);
            }
            else{
                System.out.println("Name doesn't exists");
            }
            System.out.println("Profile updated successfully!!");
            return data;
        }
        public void writeExam(){
            long start=System.currentTimeMillis();
            // long end1=start+15*1000;
            long end=start+30*1000;
            int score1=0,score2=0;
            int cnt1=0,cnt2=0;
            char ans;
            System.out.println("Start the exam!");
            // System.out.println("You have just 15 seconds to answer each question in section 1.");
            System.out.println("You have just 30 seconds to answer each question ");
            System.out.println("            correct     wrong ");
            System.out.println("section 1 : 5 marks    -1 mark");
            System.out.println("section 2 : 10 marks   -2 mark ");
            System.out.println(" Best Wishesh for your exam !!");
            while(System.currentTimeMillis()<end){
                System.out.println("\n*****Section 1*****");
                System.out.println("Which statement is true about Java?");
                System.out.println("a.Java is a sequence-dependent programming language\nb. Java is a code dependent programming language\nc. Java is a platform-dependent programming language\nd. Java is a platform-independent programming language");
                System.out.println("Enter your answer:");
                ans=sc.next().charAt(0);
                if(ans=='d'){
                    cnt1+=1;
                    System.out.println("correct answer👍");
                }
                else{
                    System.out.println("wrong answer");
                }
                System.out.println("2.Which one of the following is not a Java feature?");
                System.out.println("a.Object-oriented\nb.Use of pointers\nc.Portable\nd.Dynamic and Extensible");
                System.out.println("Enter your answer:");
                ans=sc.next().charAt(0);
                if(ans=='b'){
                    cnt1+=1;
                    System.out.println("correct answer👍");
                }
                else{
                    System.out.println("wrong answer");
                }
                System.out.println("3.What is the extension of java code files?");
                System.out.println("a. .js\nb. .txt\nc. .class\nd. .java");
                System.out.println("Enter your answer:");
                ans=sc.next().charAt(0);
                if(ans=='d'){
                    cnt1+=1;
                    System.out.println("correct answer👍");
                }
                else{
                    System.out.println("wrong answer");
                }
                System.out.println("4.Which of the following is not an OOPS concept in Java?");
                System.out.println("a.Polymorphism\nb.Inheritance\nc.Compilation\nd.Encapsulation");
                System.out.println("Enter your answer:");
                ans=sc.next().charAt(0);
                if(ans=='c'){
                    cnt1+=1;
                    System.out.println("correct answer👍");
                }
                else{
                    System.out.println("wrong answer");
                }
                System.out.println("5.Which of these are selection statements in Java?");
                System.out.println("a.break\nb.continue\nc.if()\nd.for()");
                System.out.println("Enter your answer:");
                ans=sc.next().charAt(0);
                if(ans=='c'){
                    cnt1+=1;
                    System.out.println("correct answer👍");
                }
                else{
                    System.out.println("wrong answer");
                }
                break;
            }
            while(System.currentTimeMillis()<end){
                System.out.println("\n*****Section 2*****");
                System.out.println("6.Guess the output...");
                System.out.println("public static void main(Sting args[]){\n\tint arr[] = {1, 2, 3, 4, 5};\n\tfor ( int i = 0; i < arr.length - 2; ++i)\n\t\tSystem.out.println(arr[i] + '  ');\n}");
                System.out.println("a.1 2 3 4 5\nb.1 2 3 4\nc.1 2\nd.1 2 3");
                System.out.println("Enter your answer:");
                ans=sc.next().charAt(0);
                if(ans=='d') {
                    score2+=10;
                    cnt2+=1;
                    System.out.println("correct answer👍");
                }
                else{
                    score2-=2;
                    System.out.println("wrong answer");
                }
                System.out.println("7.What will be the output of the following Java program?");
                System.out.println("public static void main(Sting args[]){\n\tdouble x = 2.0, y = 3.0;\n\tdouble z = Math.pow( x, y );\n\tSystem.out.print(z);\n}");
                System.out.println("a. 9.0\nb. 8.0\nc. 4.0\nd. 2.0");
                System.out.println("Enter your answer:");
                ans=sc.next().charAt(0);
                if(ans=='b') {
                    score2+=10;
                    cnt2+=1;
                    System.out.println("correct answer👍");
                }
                else{
                    score2-=2;
                    System.out.println("wrong answer");
                }
                break;
            }
            System.out.println("You have completed the exam!!");
            score1=cnt1*5-((4-cnt1)*1);
            System.out.println("Number of correct answers in section1 :"+cnt1);
            System.out.println("Number of correct answers in section2 :"+cnt2);
            System.out.println("Your score in section1 :"+score1);
            System.out.println("Your score in section2 :"+score2);
            System.out.println("Your total score is :"+(score1+score2));
        }
        public static void main(String[] args){
       Main can=new Main();
            can.login();
        }
    }