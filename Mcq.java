/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package texttospeech;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class Mcq extends Frame implements ActionListener {
    int index=0;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    Label l1,l2;
    Checkbox c1,c2,c3,c4;
    CheckboxGroup cbg;
        String[] q=new String[10];
        String[] op1=new String[10];
        String[] op2=new String[10];
        String[] op3=new String[10];
        String[] op4=new String[10];
        String[] ans=new String[10];
        int c=0;
    Mcq(){
        l1=new Label("Questions");
        b1=new Button("1"); 
        b2=new Button("2"); 
        b3=new Button("3"); 
        b4=new Button("4"); 
        b5=new Button("5"); 
        b6=new Button("6"); 
        b7=new Button("7"); 
        b8=new Button("8"); 
        b9=new Button("9"); 
        b10=new Button("10"); 
        b11=new Button("Previous");
        b12=new Button("Next");
        b13=new Button("Answer");
        b14=new Button("Submit");
        l2=new Label("Options");
        cbg=new CheckboxGroup();
        c1=new Checkbox("A",cbg,false);
        c2=new Checkbox("B",cbg,false);
        c3=new Checkbox("C",cbg,false);
        c4=new Checkbox("D",cbg,false);
        add(l1);
        add(b1);  
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(l2);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
      
        setLayout(null);
        l1.setBounds(100,70,1000,30);
        b1.setBounds(100,110,80,30);
        b2.setBounds(200,110,80,30);
        b3.setBounds(300,110,80,30);
        b4.setBounds(400,110,80,30);
        b5.setBounds(500,110,80,30);
        b6.setBounds(600,110,80,30);
        b7.setBounds(700,110,80,30);
        b8.setBounds(800,110,80,30);
        b9.setBounds(900,110,80,30);
        b10.setBounds(1000,110,80,30);
        l2.setBounds(100,150,80,30);
        c1.setBounds(100,190,1000,30);
        c2.setBounds(100,230,1000,30);
        c3.setBounds(100,270,1000,30);
        c4.setBounds(100,310,1000,30);
        b11.setBounds(100,350,80,30);
        b12.setBounds(200,350,80,30);
        b13.setBounds(300,350,80,30);
        b14.setBounds(400,350,80,30);      
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this); 
        b13.addActionListener(this);
        b14.addActionListener(this);
       
        int i=0;  
try{
FileReader fr=new FileReader("C:\\Users\\Administrator\\Desktop\\JAVAT\\FileHandling\\Questions.txt");
BufferedReader br=new BufferedReader(fr);
String s;
while((s=br.readLine())!=null){
String[] y=s.split(",");
q[i]=y[0];
op1[i]=y[1];
op2[i]=y[2];
op3[i]=y[3];
op4[i]=y[4];
ans[i]=y[5];
i++;
}
}
catch(Exception ex){
System.out.println(ex);
}
    }
    void speak(String m){
              System.setProperty("freetts.voices","com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory"); 
       Voice voice = VoiceManager.getInstance().getVoice("kevin16");
       
            if(voice!=null)
       {
           voice.allocate();
            boolean status = voice.speak(m);
           System.out.println("Status: "+status);
           voice.deallocate();
       }
       else
       {
           System.out.println("Error in getting Voices");
       }
    }
    
    public void actionPerformed(ActionEvent e){
if(e.getSource()==b1){
    index=0;
    String m="Question 1 is"+q[index]+"Option 1 is"+op1[index]+"option 2 is"+op2[index]+"option 3 is"+op3[index]+"option 4 is"+op4[index]+"what is your answer?";

l1.setText(q[0]);
c1.setLabel(op1[0]);
c2.setLabel(op2[0]);
c3.setLabel(op3[0]);
c4.setLabel(op4[0]);
speak(m);
}
if(e.getSource()==b2){
index=1;
 String m="Question 2 is"+q[index]+"Option 1 is"+op1[index]+"option 2 is"+op2[index]+"option 3 is"+op3[index]+"option 4 is"+op4[index]+"what is your answer?";
l1.setText(q[1]);
c1.setLabel(op1[1]);
c2.setLabel(op2[1]);
c3.setLabel(op3[1]);
c4.setLabel(op4[1]);
speak(m);
}
if(e.getSource()==b3){
index=2;
 String m="Question 3 is"+q[index]+"Option 1 is"+op1[index]+"option 2 is"+op2[index]+"option 3 is"+op3[index]+"option 4 is"+op4[index]+"what is your answer?";
l1.setText(q[2]);
c1.setLabel(op1[2]);
c2.setLabel(op2[2]);
c3.setLabel(op3[2]);
c4.setLabel(op4[2]);
speak(m);
}
if(e.getSource()==b4){
index=3;
 String m="Question 4 is"+q[index]+"Option 1 is"+op1[index]+"option 2 is"+op2[index]+"option 3 is"+op3[index]+"option 4 is"+op4[index]+"what is your answer?";
l1.setText(q[3]);
c1.setLabel(op1[3]);
c2.setLabel(op2[3]);
c3.setLabel(op3[3]);
c4.setLabel(op4[3]);
speak(m);
}
if(e.getSource()==b5){
index=4;
 String m="Question 5 is"+q[index]+"Option 1 is"+op1[index]+"option 2 is"+op2[index]+"option 3 is"+op3[index]+"option 4 is"+op4[index]+"what is your answer?";
l1.setText(q[4]);
c1.setLabel(op1[4]);
c2.setLabel(op2[4]);
c3.setLabel(op3[4]);
c4.setLabel(op4[4]);
speak(m);
}
if(e.getSource()==b6){
index=5;
 String m="Question 6 is"+q[index]+"Option 1 is"+op1[index]+"option 2 is"+op2[index]+"option 3 is"+op3[index]+"option 4 is"+op4[index]+"what is your answer?";
l1.setText(q[5]);
c1.setLabel(op1[5]);
c2.setLabel(op2[5]);
c3.setLabel(op3[5]);
c4.setLabel(op4[5]);
speak(m);
}
if(e.getSource()==b7){
index=6;
 String m="Question 7 is"+q[index]+"Option 1 is"+op1[index]+"option 2 is"+op2[index]+"option 3 is"+op3[index]+"option 4 is"+op4[index]+"what is your answer?";
l1.setText(q[6]);
c1.setLabel(op1[6]);
c2.setLabel(op2[6]);
c3.setLabel(op3[6]);
c4.setLabel(op4[6]);
speak(m);
}
if(e.getSource()==b8){
index=7;
 String m="Question 8 is"+q[index]+"Option 1 is"+op1[index]+"option 2 is"+op2[index]+"option 3 is"+op3[index]+"option 4 is"+op4[index]+"what is your answer?";
l1.setText(q[7]);
c1.setLabel(op1[7]);
c2.setLabel(op2[7]);
c3.setLabel(op3[7]);
c4.setLabel(op4[7]);
speak(m);
}
if(e.getSource()==b9){
index=8;
 String m="Question 9 is"+q[index]+"Option 1 is"+op1[index]+"option 2 is"+op2[index]+"option 3 is"+op3[index]+"option 4 is"+op4[index]+"what is your answer?";
l1.setText(q[8]);
c1.setLabel(op1[8]);
c2.setLabel(op2[8]);
c3.setLabel(op3[8]);
c4.setLabel(op4[8]);
speak(m);
}
if(e.getSource()==b10){
index=9;
 String m="Question 10 is"+q[index]+"Option 1 is"+op1[index]+"option 2 is"+op2[index]+"option 3 is"+op3[index]+"option 4 is"+op4[index]+"what is your answer?";
l1.setText(q[9]);
c1.setLabel(op1[9]);
c2.setLabel(op2[9]);
c3.setLabel(op3[9]);
c4.setLabel(op4[9]);
speak(m);
}
if(e.getSource()==b11){
    speak("previous question");
index=index-1;
String m="Question "+(index+1)+" is"+q[index]+"Option "+(index+1)+"is"+op1[index]+"option 2 is"+op2[index]+"option 3 is"+op3[index]+"option 4 is"+op4[index]+"what is your answer?";
l1.setText(q[index]);
c1.setLabel(op1[index]);
c2.setLabel(op2[index]);
c3.setLabel(op3[index]);
c4.setLabel(op4[index]);
speak(m);
}
if(e.getSource()==b12){
    speak("next question");
index=index+1;
String m="Question "+(index+1)+" is"+q[index]+"Option "+(index+1)+"is"+op1[index]+"option 2 is"+op2[index]+"option 3 is"+op3[index]+"option 4 is"+op4[index]+"what is your answer?";
l1.setText(q[index]);
c1.setLabel(op1[index]);
c2.setLabel(op2[index]);
c3.setLabel(op3[index]);
c4.setLabel(op4[index]);
speak(m);
}
if(e.getSource()==b13){
String p="";
if(c1.getState()){
p=c1.getLabel();
}
else if(c2.getState()){
p=c2.getLabel();
}
else if(c3.getState()){
p=c3.getLabel();
}
else{
p=c4.getLabel();
}
if(p.equals(ans[index])){
c++;
}
speak("answer submitted");
JOptionPane.showMessageDialog(b13, "Answer Submitted");

}
if(e.getSource()==b14){
    speak("marks obtained are"+c);
JOptionPane.showMessageDialog(b14, "Total marks:"+c);

}
}
    
    public static void main(String[] args) throws Exception{
        Mcq m=new Mcq();
        m.setVisible(true);
        m.setSize(1500,1500);
    }
    
    
    
}