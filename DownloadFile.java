import java.io.*;
import java.net.*;
import java.util.Date;

class DownloadFile
{
	public static void main(String args[])
	{
		try
		{
			int ch;
			URL u=new URL("https://mrcet.com/downloads/digital_notes/IT/JAVA%20PROGRAMMING.pdf");
			URLConnection uc=u.openConnection();
			System.out.println("Date: "+new Date(uc.getDate()));
			System.out.println("Expires: "+uc.getExpiration());
			System.out.println("Content-Type: "+uc.getContentType());
			int len=uc.getContentLength();
			System.out.println("Content Length: "+len);
			if(len>0)
			{
				FileOutputStream out=new FileOutputStream("Java_Text.pdf");
				System.out.println("Please wait a moment.");
				InputStream in=uc.getInputStream();
				ch=in.read();
				System.out.println("Downloading...");
				int i=0;
				while(ch!=-1 && i<len)
				{
					out.write(ch);
					ch=in.read();
					i++;
				}
				in.close();
				out.close();
				System.out.println("Downloaded!");
			}
			else
			{
				System.out.println("Content Not Found :(");
			}
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}
}