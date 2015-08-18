package MailUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.testng.Reporter;

public class ZipFile {

    public void main(String arg[]) throws IOException {
	String dirpath = "\\\\CIS20\\XSLT_Reports\\Error_Screenshots";
	String ZipName = "\\\\CIS20\\XSLT_Reports\\XSLT\\Error_Screenshots.zip";
	ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(ZipName));
	zipdirectory(dirpath, zos);
	zos.close();
    }

    public void zipdirectory(String dirpath, ZipOutputStream zos)
	    throws IOException {
	File f = new File(dirpath);
	if (f.exists()) {

	    String[] flist = f.list();
	    for (int i = 0; i < flist.length; i++) {
		File ff = new File(f, flist[i]);
		if (ff.isDirectory()) {
		    zipdirectory(ff.getPath(), zos);
		    continue;
		}
		String filepath = ff.getPath();
		ZipEntry entries = new ZipEntry(filepath);
		zos.putNextEntry(entries);
		FileInputStream fis = new FileInputStream(ff);
		int buffersize = 1024;
		byte[] buffer = new byte[buffersize];
		int count;
		while ((count = fis.read(buffer)) != -1) {
		    zos.write(buffer, 0, count);
		}
		fis.close();
	    }
	} else {
	    Reporter.log("Error Screenshots Folder is not available");
	    System.out.println("Error Screenshots Folder is not available");
	}
    }

}