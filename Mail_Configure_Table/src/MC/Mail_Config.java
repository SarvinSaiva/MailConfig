package MC;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MailUtility.JavaMail;
import MailUtility.ZipFile;

public class Mail_Config {

    @Test
    public static void Sent_Mail() throws IOException, InterruptedException {

	ZipFile ZF = new ZipFile();
	ZF.main(null);
	Thread.sleep(10000);
	JavaMail JavaMail = new JavaMail();
	JavaMail.constrtMailbody("", "");
	Reporter.log("Zip and Mail has sent successfully to all stack holders...");

	/*
	 * ATUReports.add("Mail Sent Successfully...", LogAs.PASSED, new
	 * CaptureScreen(ScreenshotOf.DESKTOP));
	 */}

    @BeforeTest
    public void bft() {

    }

    @AfterTest
    public void aft() {

    }
}