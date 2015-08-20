package MailUtility;

//File Name SendFileEmail.java

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

@SuppressWarnings("unused")
public class JavaMail_Demo {

    public void TC016_Mobility_WorkMilestones_Page_Exception(Exception e) {
	String TC16 = e.getMessage();
	System.out.println(TC16);
	this.constrtMailbody(TC16, "TC16");
    }

    public void TC015_Mobility_WorkMaterials_Page_Exception(Exception e) {
	String TC15 = e.getMessage();
	System.out.println(TC15);
	this.constrtMailbody(TC15, "TC15");
    }

    public void TC014_Mobility_IssueRegister_Page_Exception(Exception e) {
	String TC14 = e.getMessage();
	System.out.println(TC14);
	this.constrtMailbody(TC14, "TC14");
    }

    public void TC013_Mobility_Documents_Page_Exception(Exception e) {
	String TC13 = e.getMessage();
	System.out.println(TC13);
	this.constrtMailbody(TC13, "TC13");
    }

    public void TC012_Mobility_WorkDetails_Page_Exception(Exception e) {
	String TC12 = e.getMessage();
	System.out.println(TC12);
	this.constrtMailbody(TC12, "TC12");
    }

    public void TC011_Mobility_Dashboard_Page_Exception(Exception e) {
	String TC11 = e.getMessage();
	System.out.println(TC11);
	this.constrtMailbody(TC11, "TC11");
    }

    public void TC010_Mobility_SignIn_Page_Exception(Exception e) {
	String TC10 = e.getMessage();
	System.out.println(TC10);
	this.constrtMailbody(TC10, "TC10");
    }

    public void TC009_Desktop_UserProfile_Page_Exception(Exception e) {
	String TC9 = e.getMessage();
	System.out.println(TC9);
	this.constrtMailbody(TC9, "TC9");
    }

    public void TC008_Desktop_Reports_Page_Exception(Exception e) {
	String TC8 = e.getMessage();
	System.out.println(TC8);
	this.constrtMailbody(TC8, "TC8");
    }

    public void TC007_Desktop_Maintanence_Page_Excpetion(Exception e) {
	String TC7 = e.getMessage();
	System.out.println(TC7);
	this.constrtMailbody(TC7, "TC7");
    }

    public void TC006_Desktop_ProjectManagement_Page_Exception(Exception e) {

	String TC6 = e.getMessage();
	System.out.println(TC6);
	this.constrtMailbody(TC6, "TC6");
    }

    public void TC005_Desktop_Commercial_Page_Exception(Exception e) {
	String TC5 = e.getMessage();
	System.out.println(TC5);
	this.constrtMailbody(TC5, "TC5");
    }

    public void TC004_Desktop_Sites_Page_Exception(Exception e) {
	String TC4 = e.getMessage();
	System.out.println(TC4);
	this.constrtMailbody(TC4, "TC4");
    }

    public void TC003_Desktop_WorkOrder_Page_Exception(Exception e) {
	String TC3 = e.getMessage();
	System.out.println(TC3);
	this.constrtMailbody(TC3, "TC3");
    }

    public void TC002_Desktop_Home_Page_Exception(Exception e) {
	String TC2 = e.getMessage();
	System.out.println(TC2);
	this.constrtMailbody(TC2, "TC2");
    }

    public void TC001_Desktop_SignIn_Page_Exception(Exception e) {
	String TC1 = e.getMessage();
	System.out.println(TC1);
	this.constrtMailbody(TC1, "TC1");
    }

    public void constrtMailbody(String errmsg, String flag) {
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

	    String msgBody = "Hi Team,<br/> &nbsp; &nbsp; &nbsp; &nbsp; This is an automated mail regarding "
		    + "<b>ZOptus Production Verification Scheduled Automation Test Run Results.</b><br/><br/><b>please check below error details,</b><br></br><table style='width:100%' border=1><tr><td style='color:Black'><b>S.No</b></td><td style='color:Green'><b>Page_Details</b></td><td style='color:Red'><b>Error_Details</b></td></tr><tr><td>1</td>"
		    + "<table style='width:100%' border=1><tr><td style='color:Black'><b>S.No</b></td><td style='color:Green'><b>Page_Details</b></td><td style='color:Red'><b>Error_Details</b></td></tr><tr><td>1</td>    <td>TC001_Desktop_SignIn_Page</td><td style='color:Red'>";
	    if (flag != null && flag.equalsIgnoreCase("TC1")) {
		msgBody += "<td>TC001_Desktop_SignIn_Page</td><td style='color:Red'>"
			+ errmsg;
	    } else {
		msgBody += "<td>2</td><td>TC001_Desktop_SignIn_Page</td><td style='color:Red'> No Error";
	    }

	    messageBodyPart.setContent(msgBody, "text/html");

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

}
