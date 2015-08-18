package MailUtility;

//File Name SendFileEmail.java

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import Zoptusmodule.TC001_Desktop_SignIn_Page;

@SuppressWarnings("unused")
public class JavaMail {

    public void main(String string, String javamail) throws IOException {

	// Recipient's email ID needs to be mentioned.
	String to = "Wajahat.Baig@c.visionstream.com.au";
	// String to = "balaji.m@chembiantech.com";
	// String to = "saivadurai.j@chembiantech.com";

	// Recipient's email ID needs to be mentioned.
	// String to1 = "sekar.n@chembiantech.com";

	// Recipient's email ID needs to be mentioned.
	// String to2 = "karthik.s@chembiantech.com";
	// String to2 = "saivadurai.j@chembiantech.com";

	// Recipient's email ID needs to be mentioned.
	// String to3 = "akalya.t@chembiantech.com";

	// Recipient's email ID needs to be mentioned.
	// String to4 = "kaviya.s@chembiantech.com";

	// Recipient's email ID needs to be mentioned.
	String mailCc1 = "balaji.m@chembiantech.com";
	// String mailCc1 = "sekar.n@chembiantech.com";
	// String mailCc1 = "saivadurai.j@chembiantech.com";

	// Recipient's email ID needs to be mentioned.
	// String mailCc1 = "MurugeshS@sulekha.net";
	String mailCc2 = "sekar.n@chembiantech.com";

	// Recipient's email ID needs to be mentioned.
	// String mailCc1 = "MurugeshS@sulekha.net";
	String mailCc3 = "karthik.s@chembiantech.com";

	// Recipient's email ID needs to be mentioned.
	// String mailCc1 = "MurugeshS@sulekha.net";
	String mailCc4 = "gulsar.p@chembiantech.com";

	// Recipient's email ID needs to be mentioned.
	// String mailCc1 = "MurugeshS@sulekha.net";
	String mailCc5 = "saivadurai.j@chembiantech.com";

	// Sender's email ID needs to be mentioned
	String from = "saivadurai.j@chembiantech.com";

	// Assuming you are sending email from localhost
	// String host = "smtp.gmail.com";
	String host = "192.168.1.100";

	// Get system properties
	Properties props = System.getProperties();

	// Setup mail server
	props.put("mail.smtp.host", "192.168.1.100");
	props.put("mail.smtp.ssl.port", "100");
	props.put("mail.smtp.ssl.class", "javax.net.ssl.SSLSocketFactory");
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.port", "100");

	// Get the default Session object.
	Session session = Session.getInstance(props,
		new javax.mail.Authenticator() {
		    protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(
				"webtest@chintainfo.com", "web_2010_test");
		    }
		});

	try {
	    // Create a default MimeMessage object.
	    MimeMessage message = new MimeMessage(session);

	    // Set From: header field of the header.
	    message.setFrom(new InternetAddress(from));

	    // Set To: header field of the header.
	    /*
	     * message.addRecipient(Message.RecipientType.TO, new
	     * InternetAddress( to));
	     */

	    // Set To1: header field of the header.
	    // message.addRecipient(Message.RecipientType.TO, new
	    // InternetAddress(
	    // to1));

	    // Set To2: header field of the header.
	    // message.addRecipient(Message.RecipientType.TO, new
	    // InternetAddress(
	    // to2));

	    // Set To3: header field of the header.
	    // message.addRecipient(Message.RecipientType.TO, new
	    // InternetAddress(
	    // to3));

	    // Set To4: header field of the header.
	    // message.addRecipient(Message.RecipientType.TO, new
	    // InternetAddress(
	    // to4));

	    // Set Cc: header field of the header.
	    // message.addRecipient(Message.RecipientType.CC, new
	    // InternetAddress(mailCc));

	    /*
	     * // Set Cc1: header field of the header.
	     * message.addRecipient(Message.RecipientType.CC, new
	     * InternetAddress( mailCc1));
	     * 
	     * // Set Cc2: header field of the header.
	     * message.addRecipient(Message.RecipientType.CC, new
	     * InternetAddress( mailCc2));
	     * 
	     * // Set Cc3: header field of the header.
	     * message.addRecipient(Message.RecipientType.CC, new
	     * InternetAddress( mailCc3));
	     * 
	     * // Set Cc4: header field of the header.
	     * message.addRecipient(Message.RecipientType.CC, new
	     * InternetAddress( mailCc4));
	     */
	    // Set Cc5: header field of the header.
	    message.addRecipient(Message.RecipientType.CC, new InternetAddress(
		    mailCc5));

	    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    // get current date time with Date()
	    Date date = new Date();
	    // System.out.println(dateFormat.format(date));

	    // get current date time with Calendar()
	    Calendar cal = Calendar.getInstance();
	    // System.out.println(dateFormat.format(cal.getTime()));

	    // Set Subject: header field
	    message.setSubject("ZOptus Prod Verification Scheduled Automation Test Run Results - "
		    + cal.getTime());

	    // Create the message part
	    BodyPart messageBodyPart = new MimeBodyPart();

	    // Fill the message

	    /*
	     * messageBodyPart .setText(
	     * " Hi Team,\n This is an automated mail regarding ZOptus Production Verification Scheduled Automation Test Run Results. \n \n URL: \n Desktop: https://ss.vspl.net/Zoptus/ \n Mobility: https://ss.vspl.net/ZOWP/ \n \n \n Please check the attached file for ZOptus Automated Test Results and let us know ( If Any issues) \n \n How to View the Report?: \n Steps: \n \t 1.	Unzip the attached test report file \n \t 2.	Click on the Extracted folder\n \t 3.	Click on Intex.html to view the report \n\n Note: Report best Viewed in Firefox. \n\n\n\n Thanks and Regards, \n Testing Team \n Chembian Technology"
	     * );
	     */

	    Exception TC1 = new Exception();
	    TC001_Desktop_SignIn_Page_Exception(TC1);
	    System.out.println(TC1);

	    Exception TC2 = new Exception();
	    TC002_Desktop_Home_Page_Exception(TC2);
	    System.out.println(TC2);

	    Exception TC3 = new Exception();
	    TC003_Desktop_WorkOrder_Page_Exception(TC3);
	    System.out.println(TC3);

	    Exception TC4 = new Exception();
	    TC004_Desktop_Sites_Page_Exception(TC4);
	    System.out.println(TC4);

	    Exception TC5 = new Exception();
	    TC005_Desktop_Commercial_Page_Exception(TC5);
	    System.out.println(TC5);

	    Exception TC6 = new Exception();
	    TC006_Desktop_ProjectManagement_Page_Exception(TC6);
	    System.out.println(TC6);

	    Exception TC7 = new Exception();
	    TC007_Desktop_Maintanence_Page_Excpetion(TC7);
	    System.out.println(TC7);

	    Exception TC8 = new Exception();
	    TC008_Desktop_Reports_Page_Exception(TC8);
	    System.out.println(TC8);

	    Exception TC9 = new Exception();
	    TC009_Desktop_UserProfile_Page_Exception(TC9);
	    System.out.println(TC9);

	    Exception TC10 = new Exception();
	    TC010_Mobility_SignIn_Page_Exception(TC10);
	    System.out.println(TC10);

	    Exception TC11 = new Exception();
	    TC011_Mobility_Dashboard_Page_Exception(TC11);
	    System.out.println(TC11);

	    Exception TC12 = new Exception();
	    TC012_Mobility_WorkDetails_Page_Exception(TC12);
	    System.out.println(TC12);

	    Exception TC13 = new Exception();
	    TC013_Mobility_Documents_Page_Exception(TC13);
	    System.out.println(TC13);

	    Exception TC14 = new Exception();
	    TC014_Mobility_IssueRegister_Page_Exception(TC14);
	    System.out.println(TC14);

	    Exception TC15 = new Exception();
	    TC015_Mobility_WorkMaterials_Page_Exception(TC15);
	    System.out.println(TC15);

	    Exception TC16 = new Exception();
	    TC016_Mobility_WorkMilestones_Page_Exception(TC16);
	    System.out.println(TC16);

	    messageBodyPart
		    .setContent(
			    "Hi Team,<br/> &nbsp; &nbsp; &nbsp; &nbsp; This is an automated mail regarding <b>ZOptus Production Verification Scheduled Automation Test Run Results.</b><br/><br/><b>please check below error details,</b><br></br><table style='width:100%' border=1><tr><td style='color:Black'><b>S.No</b></td><td style='color:Green'><b>Page_Details</b></td><td style='color:Red'><b>Error_Details</b></td></tr><tr><td>1</td>"
				    + "<td>TC001_Desktop_SignIn_Page</td><td style='color:Red'>"
				    + TC1
				    + "</td></tr><tr><td>2</td><td>TC002_Desktop_Home_Page</td><td style='color:Red'>"
				    + TC2
				    + "</td></tr><tr><td>3</td><td>TC003_Desktop_WorkOrder_Page</td><td style='color:Red'>"
				    + TC3
				    + "</td></tr><tr><td>4</td><td>TC004_Desktop_Sites_Page</td><td style='color:Red'>"
				    + TC4
				    + "</td></tr><tr><td>5</td><td>TC005_Desktop_Commercial_Page</td><td style='color:Red'>"
				    + TC5
				    + "</td></tr><tr><td>6</td><td>TC006_Desktop_ProjectManagement_Page</td><td style='color:Red'>"
				    + TC6
				    + "</td></tr><tr><td>7</td><td>TC007_Desktop_Maintanence_Page</td><td style='color:Red'>"
				    + TC7
				    + "</td></tr><tr><td>8</td><td>TC008_Desktop_Reports_Page</td><td style='color:Red'>"
				    + TC8
				    + "</td></tr><tr><td>9</td><td>TC009_Desktop_UserProfile_Page</td><td style='color:Red'>"
				    + TC9
				    + "</td></tr><tr><td>10</td><td>TC010_Mobility_SignIn_Page</td><td style='color:Red'>"
				    + TC10
				    + "</td></tr><tr><td>11</td><td>TC011_Mobility_Dashboard_Page</td><td style='color:Red'>"
				    + TC11
				    + "</td></tr><tr><td>12</td><td>TC012_Mobility_WorkDetails_Page</td><td style='color:Red'>"
				    + TC12
				    + "</td></tr><tr><td>13</td><td>TC013_Mobility_Documents_Page</td><td style='color:Red'>"
				    + TC13
				    + "</td></tr><tr><td>14</td><td>TC014_Mobility_IssueRegister_Page</td><td style='color:Red'>"
				    + TC14
				    + "</td></tr><tr><td>15</td><td>TC015_Mobility_WorkMaterials_Page</td><td style='color:Red'>"
				    + TC15
				    + "</td></tr><tr><td>16</td><td>TC016_Mobility_WorkMilestones_Page</td><td style='color:Red'>"
				    + TC16
				    + "</td></tr></table></br><b>URL:</b><br/><b>Desktop:</b>&nbsp; <a>https://ss.vspl.net/Zoptus/</a><br/><b>Mobility:</b>&nbsp; <a>https://ss.vspl.net/ZOWP/</a><br/><br/>Please check the attached file for ZOptus Automated Test Results and let us know ( If Any issues).<br/><br/><b>How to View the Report?:</b><br/><br/> <b><u>Steps: <br/></u></b><br/>&nbsp; 1.Unzip the attached test report file<br/> &nbsp; 2.Click on the Extracted folder<br/> &nbsp; 3.Click on Intex.html to view the report<b><br/><br/>Note: Report best Viewed in Firefox.</b><br/><br/><br/><br/><br/><p><font size='3' color='black'>Thanks and Regards,<br/>Testing Team<br/></font><font size='3' color='orange'>Chembian</font><font size='3' color='gray'>Technologies Pvt. Ltd., </font></p>",
			    "text/html");

	    /*
	     * messageBodyPart .setContent(
	     * "Hi Team,<br/> &nbsp; &nbsp; &nbsp; &nbsp; This is an automated mail regarding <b>ZOptus Production Verification Scheduled Automation Test Run Results.</b><br/><br/><b>please check below error details,</b><br></br><table style='width:100%' border=1><tr><td style='color:Black'><b>S.No</b></td><td style='color:Green'><b>Page_Details</b></td><td style='color:Red'><b>Error_Details</b></td></tr><tr><td>1</td>    <td>TC001_Desktop_SignIn_Page</td><td style='color:Red'>94</td></tr><tr><td>2</td><td>TC002_Desktop_Home_Page</td><td style='color:Red'>80</td></tr><tr><td>3</td><td>TC003_Desktop_WorkOrder_Page</td><td style='color:Red'>80</td></tr><tr><td>4</td><td>TC004_Desktop_Sites_Page</td><td style='color:Red'>80</td></tr><tr><td>5</td><td>TC005_Desktop_Commercial_Page</td><td style='color:Red'>80</td></tr><tr><td>6</td><td>TC006_Desktop_ProjectManagement_Page</td><td style='color:Red'>80</td></tr><tr><td>7</td><td>TC007_Desktop_Maintanence_Page</td><td style='color:Red'>80</td></tr><tr><td>8</td><td>TC008_Desktop_Reports_Page</td><td style='color:Red'>80</td></tr><tr><td>9</td><td>TC009_Desktop_UserProfile_Page</td><td style='color:Red'>80</td></tr><tr><td>10</td><td>TC010_Mobility_SignIn_Page</td><td style='color:Red'>80</td></tr><tr><td>11</td><td>TC011_Mobility_Dashboard_Page</td><td style='color:Red'>80</td></tr><tr><td>12</td><td>TC012_Mobility_WorkDetails_Page</td><td style='color:Red'>80</td></tr><tr><td>13</td><td>TC013_Mobility_Documents_Page</td><td style='color:Red'>80</td></tr><tr><td>14</td><td>TC014_Mobility_IssueRegister_Page</td><td style='color:Red'>80</td></tr><tr><td>15</td><td>TC015_Mobility_WorkMaterials_Page</td><td style='color:Red'>80</td></tr><tr><td>16</td><td>TC016_Mobility_WorkMilestones_Page</td><td style='color:Red'>80</td></tr></table></br><b>URL:</b><br/><b>Desktop:</b>&nbsp; <a>https://ss.vspl.net/Zoptus/</a><br/><b>Mobility:</b>&nbsp; <a>https://ss.vspl.net/ZOWP/</a><br/><br/>Please check the attached file for ZOptus Automated Test Results and let us know ( If Any issues).<br/><br/><b>How to View the Report?:</b><br/><br/> <b><u>Steps: <br/></u></b><br/>&nbsp; 1.Unzip the attached test report file<br/> &nbsp; 2.Click on the Extracted folder<br/> &nbsp; 3.Click on Intex.html to view the report<b><br/><br/>Note: Report best Viewed in Firefox.</b><br/><br/><br/><br/><br/><p><font size='3' color='black'>Thanks and Regards,<br/>Testing Team<br/></font><font size='3' color='orange'>Chembian</font><font size='3' color='gray'>Technologies Pvt. Ltd., </font></p>"
	     * , "text/html");
	     */

	    // Create a multipar message
	    Multipart multipart = new MimeMultipart();

	    // Set text message part
	    multipart.addBodyPart(messageBodyPart);

	    // Part two is attachment
	    // messageBodyPart = new MimeBodyPart();
	    // String filename = "D:\\XSLT_Reports\\ZOptus_Output.zip";
	    // String filename =
	    // "\\\\CIS20\\XSLT_Reports\\target\\XSLT_Reports\\output\\index.html";
	    // DataSource source = new FileDataSource(filename);
	    // messageBodyPart.setDataHandler(new DataHandler(source));
	    // messageBodyPart.setFileName(filename);
	    // multipart.addBodyPart(messageBodyPart);

	    // Send the complete message parts
	    message.setContent(multipart);

	    // Send message
	    Transport.send(message);
	    System.out.println("Sent Mail to stack holders successfully....");
	} catch (MessagingException mex) {
	    mex.printStackTrace();
	}
    }

    public void TC016_Mobility_WorkMilestones_Page_Exception(Exception e) {
	String TC16 = e.getMessage();
	System.out.println(TC16);

    }

    public void TC015_Mobility_WorkMaterials_Page_Exception(Exception e) {
	String TC15 = e.getMessage();
	System.out.println(TC15);
    }

    public void TC014_Mobility_IssueRegister_Page_Exception(Exception e) {
	String TC14 = e.getMessage();
	System.out.println(TC14);

    }

    public void TC013_Mobility_Documents_Page_Exception(Exception e) {
	String TC13 = e.getMessage();
	System.out.println(TC13);
    }

    public void TC012_Mobility_WorkDetails_Page_Exception(Exception e) {
	String TC12 = e.getMessage();
	System.out.println(TC12);
    }

    public void TC011_Mobility_Dashboard_Page_Exception(Exception e) {
	String TC11 = e.getMessage();
	System.out.println(TC11);

    }

    public void TC010_Mobility_SignIn_Page_Exception(Exception e) {
	String TC10 = e.getMessage();
	System.out.println(TC10);

    }

    public void TC009_Desktop_UserProfile_Page_Exception(Exception e) {
	String TC9 = e.getMessage();
	System.out.println(TC9);

    }

    public void TC008_Desktop_Reports_Page_Exception(Exception e) {
	String TC8 = e.getMessage();
	System.out.println(TC8);

    }

    public void TC007_Desktop_Maintanence_Page_Excpetion(Exception e) {
	String TC7 = e.getMessage();
	System.out.println(TC7);
    }

    public void TC006_Desktop_ProjectManagement_Page_Exception(Exception e) {

	String TC6 = e.getMessage();
	System.out.println(TC6);
    }

    public void TC005_Desktop_Commercial_Page_Exception(Exception e) {
	String TC5 = e.getMessage();
	System.out.println(TC5);
    }

    public void TC004_Desktop_Sites_Page_Exception(Exception e) {
	String TC4 = e.getMessage();
	System.out.println(TC4);
    }

    public void TC003_Desktop_WorkOrder_Page_Exception(Exception e) {
	String TC3 = e.getMessage();
	System.out.println(TC3);
    }

    public void TC002_Desktop_Home_Page_Exception(Exception e) {
	String TC2 = e.getMessage();
	System.out.println(TC2);
    }

    public void TC001_Desktop_SignIn_Page_Exception(Exception e) {
	String TC1 = e.getMessage();
	TC001_Desktop_SignIn_Page TC1EXP = new TC001_Desktop_SignIn_Page();

	System.out.println(TC1);
    }

}
