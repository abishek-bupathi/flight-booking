import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

class FlightTicketBooking {
    // start attributes
    public static Scanner obj=new Scanner(System.in);

    final static int C1=5,C2=10,C3=20;

    static int  ifltcl,ifltdet,j,g,con,nfs,bc,xc,ec,y;
    int age;
    String name,gender;

    static double cost=0;
    static String jdate,date,flightname,fr,t,phno;
    static int h[]= new int[nfs];
    static String fltdet[][]={
            {"Chennai","Bangalore","Delhi","Mumbai","Kolkata ","Cochin"},
            {"EK 151","EK 172","EK 199","EK 120","EK 210","EK 135"},
            {"6:00","15:30","10:00","20:00","17:30","13:00"},
            {"8500","10000","9000","11000","9500","10500"}
    };
    static String fltcl[]={"Bussiness Class","Executive Class","Economy Class"};

    // end attributes
    // start methods
    static void welcome(){
        System.out.println("\t"+" "+"\t");
        System.out.println("\t"+" "+"\t");
        System.out.println("\t"+" "+"\t");
        System.out.println("\t"+" "+"\t");
        System.out.println("\t"+"\t"+"\t"+"-------------------------------------"+"\t");
        System.out.println("\t"+"\t"+"\t"+"WELCOME TO JATAYU AIRTICKET BOOKING"+"\t");
        System.out.println("\t"+"---------------------------------------------------------------------"+"\t");
        System.out.println("\t"+"\t"+"\t"+"    "+"BOOK AIRTICKETS AT YOUR EASE");

        System.out.println("\t"+"---------------------------------------------------------------------"+"\t");

    }

    static void fromto(){

        System.out.println("\t"+"FLIGHTS ARE AVAILABLE FROM :"+"\t");
        for(int y=0;y<3;y++){
            System.out.println("\t"+" "+"\t");
            System.out.printf("\t"+"%d   -  %-25s%d   -  %s\t\n",y+1,fltdet[0][y],y+4,fltdet[0][y+3]);

        }
        System.out.println("\t"+" "+"\t");
        System.out.println("\t"+" "+"\t");

        System.out.print("\t"+"DEPATURE FROM : ");
        ifltdet=obj.nextInt()-1;
        if(ifltdet<0 || ifltdet>5 ){
            System.out.println("\t"+"PLEASE ENTER THE CORRECT CHOICE "+"\t");
            System.out.println("\t"+"-------------------------------------"+"\t");
            fromto();
        }
        System.out.println("\t"+" "+"\t");
        System.out.println("\t"+" "+"\t");


        flightname= fltdet[1][ifltdet];
        fr = fltdet[0][ifltdet];
        t = "Dubai";
        cost = Double.parseDouble(fltdet[3][ifltdet]);
        System.out.println("\t"+"-------------------------------------"+"\t");
    }

    static void getdate()
    {
        int d=0,m=0,y=0;
        System.out.println("\t"+"ENTER DATE OF JOURNEY (dd/mm/yy)"+"\t");
        System.out.println("\t"+" "+"\t");
        System.out.print("\t"+"Date  (dd) : "); d = obj.nextInt();

        System.out.println("\t"+" "+"\t");

        System.out.print("\t"+"MONTH (mm) : "); m = obj.nextInt();
        System.out.println("\t"+" "+"\t");

        System.out.print("\t"+"YEAR (yy)  : "); y = obj.nextInt();
        jdate = Integer.toString(d)+ Integer.toString(m)+ Integer.toString(y);
        date = Integer.toString(d)+ "/" +Integer.toString(m) + "/" + Integer.toString(y);
    }

    static void ccl(){
        System.out.println("\t"+" "+"\t");
        for(int i=0;i<=2;i++){
            System.out.printf("\t %d - %s\t\n",i+1,fltcl[i]);

        }
        System.out.println("\t"+" "+"\t");
        System.out.print("\t"+"CLASS : ");
        ifltcl=obj.nextInt();
        ifltcl=ifltcl-1;

        if(ifltcl<0 || ifltcl>2 ){
            System.out.println("\t"+"PLEASE ENTER THE CORRECT CHOICE "+"\t");
            System.out.println("\t"+"-------------------------------------"+"\t");
            ccl();
        }
        System.out.println("\t"+"-------------------------------------"+"\t");


    }

    void input(String s)
    {


        System.out.println("\t"+" "+"\t");

        System.out.print("\tPLEASE ENTER THE DETAILS OF "+s +" PASSENGER \n");
        System.out.println("\t"+" "+"\t");
        System.out.print("\t"+"NAME         :   ");
        name=obj.next();
        System.out.println("\t"+" "+"\t");

        System.out.print("\t"+"AGE          :   ");
        age =obj.nextInt();
        System.out.println("\t"+" "+"\t");

        System.out.print("\t"+"GENDER (m/f) :   ");
        gender=obj.next();
        System.out.println("\t"+" "+"\t");

        System.out.print("\t"+"PHONE NUMBER :   ");
        phno=obj.next();
        System.out.println("\t"+" "+"\t");
        System.out.println("\t"+"-------------------------------------"+"\t");
    }

    static void address(){

        System.out.println("");
        System.out.println("");

        System.out.println("\t"+"PLEASE GIVE THE ADDRESS TO WHICH THE TICKET HAS TO BE DELIVERED");
        System.out.println("");
        System.out.print("\t"+"NAME     :  ");
        String name=obj.next();
        System.out.println("");
        System.out.print("\t"+"ADDRESS  :  ");

        System.out.print("");
        String address=obj.next();
        System.out.print("\t"+"            ");

        address=obj.next();
        System.out.print("\t"+"            ");
        address=obj.next();
        System.out.print("\t"+"            ");
        address=obj.next();
        System.out.println("");
        System.out.print("\t"+"            ");
        address=obj.next();
    }


    static void confirm(){

        System.out.println("\t"+" "+"\t");

        int c;
        System.out.println("\t"+"-------------------------------------"+"\t");
        System.out.println("\t"+"PROCEED ?"+"\t");
        System.out.println("\t"+" "+"\t");
        System.out.println("\t"+"1 - YES"+"\t");
        System.out.println("\t"+"2 - NO "+"\t");
        System.out.println("\t"+"");
        System.out.print("\t"+"");
        c=obj.nextInt();

        switch(c)
        {
            case 1:
                con=1;
                break;

            case 2:
                con=2;
                break;

            default:
                System.out.println("\t"+"ENTER THE CORRECT CHOICE"+"\t");
                confirm();

        }  }

    void display(){

        JFrame f =new JFrame("TICKET"+" - "+name);
        JTextArea a= new JTextArea();
        a.setEditable(false);

        a.setForeground(Color.orange);
        a.setBackground(Color.darkGray);
        a.setFont(new Font("Tempus Sans ITC",Font.BOLD,20));

        a.append("   "+"-------------------------------------------------------------------------------------------"+"   \n");
        a.append("");
        a.append("                                      > "+"EMIRATES AIRLINES <"+"\n");
        a.append("\t"+"    "+" "+"\n");
        a.append("           "+fltcl[ifltcl]+"                                      "+flightname+"\n");
        a.append(" "+"\n");

        a.append("         "+"Name : "+name +"                     "+"Gender : "+gender + "                     "+ "Age : "+age+"\n");
        a.append("  \n");

        a.append("       "+"From : "+fr+ "                        "+"To : "+t+"\n");
        a.append("   "+"\n");
        a.append("       "+"Depature : "+date+"       "+fltdet[2][ifltdet]+"\n");
        a.append("         "+"\n");
        a.append("                             "+"Please arrive 35 minutes before depature"+"\n");

        a.append("   "+"-------------------------------------------------------------------------------------------"+"   \n");


        f.add(a);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(720,480);
        f.setVisible(true);

    }

    static void exit(){
        System.out.println("\t"+"HAVE A HAPPY JOURNEY");
    }

    static void savefreeseats() throws IOException
    {
        String fname = flightname+"-"+jdate+".air";
        DataOutputStream bynFile = new DataOutputStream(new FileOutputStream(fname));
        bynFile.writeInt(bc);
        bynFile.writeInt(xc);
        bynFile.writeInt(ec);
        bynFile.close();

    }

    static void loadfreeseats() throws IOException
    {
        String fname = flightname+"-"+jdate+".air";
        DataInputStream bynFile = new DataInputStream(new FileInputStream(fname));
        bc = bynFile.readInt();
        xc = bynFile.readInt();
        ec = bynFile.readInt();
        bynFile.close();
    }

    void Savedetail() throws IOException
    {
        Formatter fmtFile = new Formatter(new FileOutputStream("passengers.air",true));
        fmtFile.format("%s,%s,%s,%d,%s,%s\n",date,flightname,name,age,gender,phno);
        fmtFile.close();
    }
    // end methods

    public static void main(String args[])
    {

        double costtotal;

        welcome();
        fromto();
        ccl();
        getdate();

        try{
            loadfreeseats();
        }catch(IOException e){}

        System.out.println("\t"+"-------------------------------------"+"\t");
        System.out.print("\t"+"ENTER NUMBER OF TICKETS :  ");
        nfs=obj.nextInt();
        System.out.println("\t"+"-------------------------------------"+"\t");
        if (nfs<=5){

            int reqseats=0;

            switch(ifltcl)
            {
                case 1:
                    reqseats = C1-(bc+nfs);
                    break;
                case 2:
                    reqseats = C2-(xc+nfs);
                    break;
                case 3:
                    reqseats = C3-(ec+nfs);
                    break;
            }

            if (reqseats>=0)
            {
                FlightTicketBooking t[]= new FlightTicketBooking[nfs];
                String plc[] = {"1st","2nd","3rd","4th","5th"};

                for( j=0;j<nfs;j++)
                {
                    t[j] = new FlightTicketBooking();
                    if(nfs==1)t[j].input("");
                    else
                        t[j].input(plc[j]);
                }
                address();
                costtotal =cost*nfs;
                System.out.println("\t"+"CHARGES  =  "+costtotal);
                System.out.println("");
                confirm();

                switch(con)
                {
                    case 1:
                        try{
                            switch(ifltcl)
                            {
                                case 1:
                                    bc=bc+nfs;
                                    break;
                                case 2:
                                    xc=xc+nfs;
                                    break;
                                case 3:
                                    ec=ec+nfs;
                                    break;
                            }
                            savefreeseats();
                            for( j=0;j<nfs;j++)
                            {

                                t[j].Savedetail();


                            }
                        }
                        catch(IOException e)
                        {
                            e.printStackTrace();
                        }

                        switch(nfs)
                        {
                            case 5: t[4].display();
                            case 4: t[3].display();
                            case 3: t[2].display();
                            case 2: t[1].display();
                            case 1: t[0].display();
                                System.out.println("");
                                System.out.println("\t"+"PLEASE KEEP THE CASH READY, OUR AGENT WILL SOON BE THERE ");
                                System.out.println("\t"+"TO DELIVER YOUR TICKETS");

                                System.out.println("");
                                System.out.println("\t"+"WE LOOK FORWARD TO HAVING YOU ONBOARD");
                                System.out.println("\t"+"-------------------------------------"+"\t");

                                System.out.println("\t"+"THANK YOU");
                                System.out.println("\t"+"----------"+"\t");

                        }
                        break;
                    case 2:
                        System.out.println("\t"+"-------------------------------------"+"\t");
                        System.out.println("\t"+"THANK YOU");
                        System.out.println("\t"+"----------"+"\t");
                        break;
                }
            }
            else
            {
                System.out.println("\t"+"SORRY,SEATS ARE NOT AVAILABLE PLEASE CHOOSE ANOTHER DATE");
            }}
        else        System.out.println("\t"+"SORRY,ONLY 5 TICKETS CAN BE BOOKED AT ONCE");
    }
} 