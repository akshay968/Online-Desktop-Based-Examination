/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import com.google.protobuf.DescriptorProtos;
import java.awt.Color;
import project.connection_provider;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import project.student_score;
/**
 *
 * @author SridharKotha
 */
public class test extends javax.swing.JFrame {

 public String questionid="1";
 public String answer="1";
 public int min=0;
 public int sec=0;
 public  int marks=0;
 public int maxmarks;
 public int  maximarksall=0;
 public int good=0;
 public int tough=0;
 public int complex=0;
 public String rollnumber;
 public void note_answer(String sb){
String student_answer="";
if(jRadioButton1.isSelected())
{
student_answer=jRadioButton1.getText();

}
if(jRadioButton2.isSelected())
{
student_answer=jRadioButton2.getText();

}
if(jRadioButton3.isSelected())
{
student_answer=jRadioButton3.getText();

}
if(jRadioButton4.isSelected())
{
student_answer=jRadioButton4.getText();

}
//if(student_answer.equals(answer))
//{
// marks=marks+maxmarks;  
//}

//if(questionid=="10")
//{
//    jButton1.setVisible(false);
//    
//}
try {
          Connection con= connection_provider.con_db();
            Statement s=con.createStatement();
            String marks1=String.valueOf(marks);
        if(questionid=="1")
        {  s.executeUpdate("update student_detail set q1='"+student_answer+"' where rollno='"+rollnumber+"'");
      if(sb=="save") 
  jButton3.setBackground(Color.GREEN);
 if(sb=="mfr")
     jButton3.setBackground(Color.blue );
 
        } // JOptionPane.showConfirmDialog(null, marks1);
           if(questionid=="2")
           { s.executeUpdate("update student_detail set q2='"+student_answer+"' where rollno='"+rollnumber+"'");
           if(sb=="save") 
  jButton4.setBackground(Color.GREEN);
 if(sb=="mfr")
     jButton4.setBackground(Color.blue );
           }if(questionid=="3")
           { s.executeUpdate("update student_detail set q3='"+student_answer+"' where rollno='"+rollnumber+"'");
           if(sb=="save") 
  jButton5.setBackground(Color.GREEN);
 if(sb=="mfr")
     jButton5.setBackground(Color.blue );
           } if(questionid=="4")
           { s.executeUpdate("update student_detail set q4='"+student_answer+"' where rollno='"+rollnumber+"'");
                            if(sb=="save") 
  jButton6.setBackground(Color.GREEN);
 if(sb=="mfr")
     jButton6.setBackground(Color.blue );

           }  if(questionid=="5")
           {  s.executeUpdate("update student_detail set q5='"+student_answer+"' where rollno='"+rollnumber+"'");
            if(sb=="save") 
  jButton7.setBackground(Color.GREEN);
 if(sb=="mfr")
     jButton7.setBackground(Color.blue );
           }   if(questionid=="6")
           { s.executeUpdate("update student_detail set q6='"+student_answer+"' where rollno='"+rollnumber+"'");
            if(sb=="save") 
  jButton8.setBackground(Color.GREEN);
 if(sb=="mfr")
     jButton8.setBackground(Color.blue );
           }    if(questionid=="7")
           { s.executeUpdate("update student_detail set q7='"+student_answer+"' where rollno='"+rollnumber+"'");
            if(sb=="save") 
  jButton9.setBackground(Color.GREEN);
 if(sb=="mfr")
     jButton9.setBackground(Color.blue );
           }     if(questionid=="8")
           {   s.executeUpdate("update student_detail set q8='"+student_answer+"' where rollno='"+rollnumber+"'");
            if(sb=="save") 
  jButton10.setBackground(Color.GREEN);
 if(sb=="mfr")
     jButton10.setBackground(Color.blue );
           }      if(questionid=="9")
           {  s.executeUpdate("update student_detail set q9='"+student_answer+"' where rollno='"+rollnumber+"'");
            if(sb=="save") 
  jButton11.setBackground(Color.GREEN);
 if(sb=="mfr")
     jButton11.setBackground(Color.blue );
           }       if(questionid=="10")
           { s.executeUpdate("update student_detail set q10='"+student_answer+"' where rollno='"+rollnumber+"'");
            if(sb=="save") 
  jButton12.setBackground(Color.GREEN);
 if(sb=="mfr")
     jButton12.setBackground(Color.blue );
           }} catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
     }

 }
 public void question_display(String qid)
 {
 jRadioButton1.setSelected(false);
jRadioButton2.setSelected(false);
jRadioButton3.setSelected(false);
jRadioButton4.setSelected(false);
     String o1="",o2="",o3="",o4="";
  



    // System.out.println(qid);
     questionid =qid;
  try {
            Connection con= connection_provider.con_db();
            Statement s=con.createStatement();
           
                ResultSet rs1=s.executeQuery("select *from question_table where id='"+qid+"'");
                while(rs1.next())
                {
                  jLabel16.setText(rs1.getString(1));
                  jLabel17.setText(rs1.getString(2));
                  jRadioButton1.setText(rs1.getString(3));
                  jRadioButton2.setText(rs1.getString(4));
                  jRadioButton3.setText(rs1.getString(5));
                   jRadioButton4.setText(rs1.getString(6));
                   o1=jRadioButton1.getText();
                      o2=jRadioButton2.getText();
                         o3=jRadioButton3.getText();
                            o4=jRadioButton4.getText();
                    //jLabel19.setText(rs1.getString(8));
//                     jLabel21.setText(rs1.getString(9));
                  answer=rs1.getString(7);
                   maxmarks=rs1.getInt(8);
                   
                        jLabel19.setText(rs1.getString(8));
//                        String level=rs1.getString(9);
//                        if(level=="good")
//                        {
//                        good+=maxmarks;
//                        }
//                        if(level=="tough")
//                        {
//                          tough+=maxmarks;
//                        }
//                        if(level=="complex")
//                        {
//                         complex+=maxmarks;
//                        }
                        jLabel21.setText(rs1.getString(9));
                     
                }
                String resp="abstract";
                     try{ ResultSet rs=s.executeQuery("select *from student_detail where rollno='"+rollnumber+"'");
                if(qid=="1")
                while(rs.next())
                {
                 resp=rs.getString(8);
                }
                if(qid=="2")
                while(rs.next())
                {
                 resp=rs.getString(9);
                }
                if(qid=="3")
                while(rs.next())
                {
                 resp=rs.getString(10);
                }
                if(qid=="4")
                while(rs.next())
                {
                 resp=rs.getString(11);
                }
                if(qid=="5")
                while(rs.next())
                {
                 resp=rs.getString(12);
                }
                if(qid=="6")
                while(rs.next())
                {
                 resp=rs.getString(13);
                }
                if(qid=="7")
                while(rs.next())
                {
                 resp=rs.getString(14);
                }
                if(qid=="8")
                while(rs.next())
                {
                 resp=rs.getString(15);
                }
                if(qid=="9")
                while(rs.next())
                {
                 resp=rs.getString(16);
                }
                if(qid=="10")
                while(rs.next())
                {
                 resp=rs.getString(17);
                }
                
                System.out.println(o4);
                 System.out.println(o4);
                 System.out.println(resp.equals(o4));
                if(resp.equals(o1))
                {
                    System.out.println("o1");
                jRadioButton1.setSelected(true);
                }
                if(resp.equals(o2))
                {
                    System.out.println("o2");
                jRadioButton2.setSelected(true);
                }
                if(resp.equals(o3))
                {
                    System.out.println("o3");
                jRadioButton3.setSelected(true);
                }
                if(resp.equals(o4))
                {System.out.println("o4");
                jRadioButton4.setSelected(true);
                }
                     }
                     catch(Exception e){
                     }
         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
 }
 public void correction()
 {
     
     String rollno= jLabel10.getText();
   
     try {
          Connection con= connection_provider.con_db();
            Statement s=con.createStatement();
            String marks1=String.valueOf(marks);
            System.out.println("addition");
            s.executeUpdate("update student_detail set marks='"+marks1+"' where rollno='"+rollno+"'");
            JOptionPane.showConfirmDialog(null, marks1);
            
             time.stop();
        setVisible(false);
        float t0=  (float)(0.8*good+0.25*tough+0.1*complex);
         System.out.println(good+"   "+tough+"   "+complex+"   ");
        String verdict;
        if(marks>=t0)
        {
          verdict="Pass";
        }
        else
            verdict="Fail";
      
      new scorecard(rollnumber,maximarksall,t0,marks,verdict).setVisible(true);
          
     } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
     }
 }
 {
 
 }
    /**
     * Creates new form test
     */
 Timer time;
    public test(String rollno) {
        initComponents();
        jLabel10.setText(rollno);rollnumber=rollno;
        
        SimpleDateFormat dformat =new SimpleDateFormat("dd-MM-yyyy");
        Date date =new Date();
        jLabel3.setText(dformat.format(date));
        // first question and student details
        try {
            Connection con= connection_provider.con_db();
            Statement s=con.createStatement();
            ResultSet rs=s.executeQuery("select *from student_detail where rollno='"+rollno+"'");
            while(rs.next())
            {
            jLabel12.setText(rs.getString(1));
            }
                ResultSet rs1=s.executeQuery("select *from question_table where id='"+questionid+"'");
                while(rs1.next())
                {
                  jLabel16.setText(rs1.getString(1));
                  jLabel17.setText(rs1.getString(2));
                  jRadioButton1.setText(rs1.getString(3));
                  jRadioButton2.setText(rs1.getString(4));
                  jRadioButton3.setText(rs1.getString(5));
                  jRadioButton4.setText(rs1.getString(6));
                 
                          answer=rs1.getString(7);
                   maxmarks=rs1.getInt(8);
                        jLabel19.setText(rs1.getString(8));
                        jLabel21.setText(rs1.getString(9));
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        //timer
        setLocationRelativeTo(this);
        time =new Timer(1000,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              jLabel8.setText(String.valueOf(sec));
              jLabel7.setText(String.valueOf(min));
            
            
            if(sec==59)
        {
               sec=0;
            min++;
            if(min==10)
        {
          time.stop();
            note_answer("save");
         // submit();
          
        }
          
        } 
            
            
             sec++;
            }
        });
        time.start();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Date");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 10, 39, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 118, 36));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Total Time");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 10, 87, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("10 Min");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Timer Taken");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 42, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("00");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 42, 25, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("00");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 42, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 257, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Roll No");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 48, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 171, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Total Questions :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("10");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Current Question Id");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText(" 00");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Max Marks");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("jLabel19");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Level :");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("jLabel21");

        jButton3.setText("1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("2");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("3");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("4");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("5");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("6");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("7");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("8");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("9");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("10");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addGap(5, 5, 5))
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton9)
                                            .addComponent(jButton10)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 64, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("jLabel17");

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton4.setText("jRadioButton4");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton13.setText("Save");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Mark for Review");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton14)
                        .addGap(42, 42, 42)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(599, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jRadioButton1)
                        .addGap(29, 29, 29)
                        .addComponent(jRadioButton2)
                        .addGap(33, 33, 33)
                        .addComponent(jRadioButton3)
                        .addGap(28, 28, 28)
                        .addComponent(jRadioButton4)
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 192, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    public void marking(String sa,String a,String lvl,int  maximarks)
    {    System.out.println(lvl);
                        if(lvl.equals("Good"))
                        {
                        good+=maximarks;
                        }
                        if(lvl.equals("Tough"))
                        {
                          tough+=maximarks;
                        }
                        if(lvl.equals("Complex"))
                        {
                         complex+=maximarks;
                        }
                  if(sa.equals(a))
                      marks+=maximarks;
                  maximarksall+=maximarks;
                        
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
           String x="";
           String q1r=null,q2r = null,q3r=null,q4r=null,q5r=null,q6r=null,q7r=null,q8r=null,q9r=null,q10r=null;
           try { Connection con= connection_provider.con_db();
            Statement s=con.createStatement();
            ResultSet rs=s.executeQuery("select *from student_detail where rollno='"+rollnumber+"'");
               while(rs.next()){
            q1r=rs.getString(8);
            q2r=rs.getString(9);
            q3r=rs.getString(10);
            q4r=rs.getString(11);
            q5r=rs.getString(12);
            q6r=rs.getString(13);
            q7r=rs.getString(14);
            q8r=rs.getString(15);
            q9r=rs.getString(16);
            q10r=rs.getString(17);
               }
            
            
            
            
            
        } catch (Exception e) {
            
              JOptionPane.showMessageDialog(null, e);
        }
           
            try {
                x="1";
                Connection con= connection_provider.con_db();
            Statement s=con.createStatement();
              
           
              ResultSet rs1=s.executeQuery("select *from question_table where id='"+x+"'");
            
               
           while(rs1.next()){
           String a= rs1.getString(7);
            String level=rs1.getString(9);
             int maximarks=rs1.getInt(8);
                marking(q1r,a,level, maximarks);
                System.out.println("marks"+ marks);
          } }catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
              
          }  try {
              Connection con= connection_provider.con_db();
            Statement s=con.createStatement();
              x="2";
              
              ResultSet rs1=s.executeQuery("select *from question_table where id='"+x+"'");
            
             
          while(rs1.next()){
           String a= rs1.getString(7);
            String level=rs1.getString(9);
             int maximarks=rs1.getInt(8);
                marking(q2r,a,level, maximarks);
                System.out.println("marks"+ marks);}
          } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
          }
            try {x="3";
          
            Connection con= connection_provider.con_db();
            Statement s=con.createStatement();
              ResultSet rs1=s.executeQuery("select *from question_table where id='"+x+"'");
               
                while(rs1.next()){
           String a= rs1.getString(7);
            String level=rs1.getString(9);
             int maximarks=rs1.getInt(8);
                marking(q3r,a,level, maximarks);
                System.out.println("marks"+ marks);
          }} catch (Exception e) {
              
          }
              try {x="4";
              Connection con= connection_provider.con_db();
            Statement s=con.createStatement();
              
              ResultSet rs1=s.executeQuery("select *from question_table where id='"+x+"'");
            
                while(rs1.next()){
           String a= rs1.getString(7);
            String level=rs1.getString(9);
             int maximarks=rs1.getInt(8);
                marking(q4r,a,level, maximarks);
                System.out.println("marks"+ marks);
          } }catch (Exception e) {
              
          }
                try {x="5";
                Connection con= connection_provider.con_db();
            Statement s=con.createStatement();
                     
              ResultSet rs1=s.executeQuery("select *from question_table where id='"+x+"'");
            
               
            while(rs1.next()){
           String a= rs1.getString(7);
            String level=rs1.getString(9);
             int maximarks=rs1.getInt(8);
                marking(q5r,a,level, maximarks);
                System.out.println("marks"+ marks);
            }} catch (Exception e) {
               System.out.println("q1");
          }
                  try {x="6";
                  Connection con= connection_provider.con_db();
            Statement s=con.createStatement();
                  
              ResultSet rs1=s.executeQuery("select *from question_table where id='"+x+"'");
            while(rs1.next()){
           String a= rs1.getString(7);
            String level=rs1.getString(9);
             int maximarks=rs1.getInt(8);
                marking(q6r,a,level, maximarks);
                System.out.println("marks"+ marks);
          }} catch (Exception e) {
               System.out.println("q1");
          }
                    try {x="7";
                    Connection con= connection_provider.con_db();
            Statement s=con.createStatement();
                   
              ResultSet rs1=s.executeQuery("select *from question_table where id='"+x+"'");
            
               while(rs1.next()){
           String a= rs1.getString(7);
            String level=rs1.getString(9);
             int maximarks=rs1.getInt(8);
                marking(q7r,a,level, maximarks);
                System.out.println("marks"+ marks);
          } }catch (Exception e) {
              
          }
                      try {
                          Connection con= connection_provider.con_db();
            Statement s=con.createStatement();
                          x="8";
                       
              ResultSet rs1=s.executeQuery("select *from question_table where id='"+x+"'");
            while(rs1.next()){
           String a= rs1.getString(7);
            String level=rs1.getString(9);
             int maximarks=rs1.getInt(8);
                marking(q8r,a,level, maximarks);
                System.out.println("marks"+ marks);
          }} catch (Exception e) {
              
          }
                        
                          try { x="9";
                          Connection con= connection_provider.con_db();
            Statement s=con.createStatement();
              ResultSet rs1=s.executeQuery("select *from question_table where id='"+x+"'");
            while(rs1.next()){
           String a= rs1.getString(7);
            String level=rs1.getString(9);
             int maximarks=rs1.getInt(8);
                marking(q9r,a,level, maximarks);
                System.out.println("marks"+ marks);
          }} catch (Exception e) {
              
          }
                            try {
                                Connection con= connection_provider.con_db();
            Statement s=con.createStatement();x="10";
                              
              ResultSet rs1=s.executeQuery("select *from question_table where id='"+x+"'");
            
             while(rs1.next()){
           String a= rs1.getString(7);
            String level=rs1.getString(9);
             int maximarks=rs1.getInt(8);
                marking(q10r,a,level, maximarks);
                System.out.println("marks"+ marks);
          } }catch (Exception e) {
              
          }
          
          System.out.println(marks);
          System.out.println("correction");
  
      

// 
      
      correction();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
if(jRadioButton1.isSelected())   
{
jRadioButton2.setSelected(false);
jRadioButton3.setSelected(false);
jRadioButton4.setSelected(false);
}// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
      if(jRadioButton2.isSelected())   
{
jRadioButton1.setSelected(false);
jRadioButton3.setSelected(false);
jRadioButton4.setSelected(false);
}  // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
      if(jRadioButton3.isSelected())   
{
jRadioButton2.setSelected(false);
jRadioButton1.setSelected(false);
jRadioButton4.setSelected(false);
}  // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        if(jRadioButton4.isSelected()){
jRadioButton2.setSelected(false);
jRadioButton3.setSelected(false);
jRadioButton1.setSelected(false);
}
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        note_answer("mfr");
//         if(questionid!="10")
//{  char c;
//c=questionid.charAt(0);
//   if(c =='9')
//   {
//       question_display("10");
//   }
//   
//   else {
//     c=(char) ((char) c+1);
//       question_display(String.valueOf(c));
//   }
//}
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if(!(jRadioButton1.isSelected()||jRadioButton2.isSelected()||jRadioButton3.isSelected()||jRadioButton4.isSelected()))
        {
        JOptionPane.showMessageDialog(null,"select an option to Save ?");
        
        }
        note_answer("save");
//    if(questionid!="10")
//{  char c;
//c=questionid.charAt(0);
//   if(c =='9')
//   {
//       question_display("10");
//   }
//   
//   else {
//     c=(char) ((char) c+1);
//       question_display(String.valueOf(c));
//   }
//}
   // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        question_display("1");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       question_display("2");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
question_display("3");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
question_display("4");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
question_display("5");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
question_display("6");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
question_display("7");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       question_display("8"); // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
question_display("9");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
question_display("10");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
