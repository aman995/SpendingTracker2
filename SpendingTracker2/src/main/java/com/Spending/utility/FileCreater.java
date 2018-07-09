
/*
package com.Spending.utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.apache.tools.ant.util.FileUtils;

import com.google.common.io.Files;

public class FileCreater {

private static FileCreater  filecreater = new FileCreater();	
	
private FileCreater() {}

public static FileCreater getInstance() {
		
return filecreater;
	
} 	
	
	
public void CopyScreenShotToDestination(File Source, String filename)throws IOException {
	String Destination =(ConfigFileReader.getInstance().ScreenShotPath()+filename+".png");
	Files.copy( Source.toPath()   , Destination,StandardCopyOption.REPLACE_EXISTING);
	
}
}
*/