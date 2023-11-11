import java.util.*;
import java.io.*;
import java.nio.file.Files;


public class Auto_Backup {

	public static void main() {
		
		
		
		//+++++++++++++++//
		//+++VARIABLES+++//
		//+++++++++++++++//
		
		String STANDARD_ANDROID_ROOT_FILE_PATH="";
		String STANDARD_WINDOWS_ROOT_FILE_PATH="";
		String DETECTED_OPERATING_SYSTEM="";
		String OPERATING_SYSTEM_PATH="";
		
		String AI_MAIN_FOLDER_DIRECTORY="";
		String WORK_ORDER_FILE_DIRECTORY="";
		String HELP_FILE_DIRECTORY="";
		
		String AI_BACKUP_FOLDER_DIRECTORY="";
		String AI_BACKUP_COUNT_FILE_DIRECTORY="";
		String IS_AI_BACKUP_FOLDER_MISSING="";
		String IS_THE_AI_MISSING_RESOURCES="";
		String IS_AI_BACKUP_FILE_COUNTER_MISSING="";
		String OLD_AI_BACKUP_COUNT_STRING="";
		String AI_UPDATED_BACKUP_COUNT_STRING="";
		String NEW_BACKUP_FOLDER_NAME="";
		String SOURCE_FILE_DIRECTORY="";
		String DESTINATION_FILE_DIRECTORY="";
		
		
		int AI_OLD_BACKUP_COUNT=0;
		int AI_UPDATED_BACKUP_COUNT=0;
		
		//++++++++++++++++++++++++++//
		//+++END OF ALL VARIABLES+++//
		//++++++++++++++++++++++++++//
		
		
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
		
		
		//++++++++++++++++++++++//
		//+++GET OS FILE PATH+++//
		//++++++++++++++++++++++//
		
		STANDARD_ANDROID_ROOT_FILE_PATH="/sdcard/";
		STANDARD_WINDOWS_ROOT_FILE_PATH="C:/";
		
		File STANDARD_ANDROID_ROOT_FILE_PATH_FILE=new File(STANDARD_ANDROID_ROOT_FILE_PATH);
		File STANDARD_WINDOWS_ROOT_FILE_PATH_FILE=new File(STANDARD_WINDOWS_ROOT_FILE_PATH);
		
		
		
		if (STANDARD_ANDROID_ROOT_FILE_PATH_FILE.exists()) {
			DETECTED_OPERATING_SYSTEM="ANDROID";
			OPERATING_SYSTEM_PATH=STANDARD_ANDROID_ROOT_FILE_PATH;
		}
		//+++END OF CONDITION+++//
		
		
		
		if (STANDARD_WINDOWS_ROOT_FILE_PATH_FILE.exists()) {
			DETECTED_OPERATING_SYSTEM="WINDOWS";
			OPERATING_SYSTEM_PATH=STANDARD_WINDOWS_ROOT_FILE_PATH;
		}
		//+++END OF CONDITION+++//
		
		
		
		//+++++++++++++++++++++++++++++++++//
		//+++END OF GETTING OS FILE PATH+++//
		//+++++++++++++++++++++++++++++++++//
		
		
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
		
		
		
		//+++IMPORTANT. SET YOUR BACKUP PATH MANUALLY+++//
		
		AI_MAIN_FOLDER_DIRECTORY=OPERATING_SYSTEM_PATH+"AI MODEL ASSETS/";
		
		
		File AI_MAIN_FOLDER_DIRECTORY_FILE=new File(AI_MAIN_FOLDER_DIRECTORY);
		
		
		
		
		
		
		AI_BACKUP_FOLDER_DIRECTORY=AI_MAIN_FOLDER_DIRECTORY+"BACKUPS/";
		AI_BACKUP_COUNT_FILE_DIRECTORY=AI_BACKUP_FOLDER_DIRECTORY+"COUNT.TXT";
		
		File AI_BACKUP_FOLDER_DIRECTORY_FILE=new File (AI_BACKUP_FOLDER_DIRECTORY);
		File AI_BACKUP_COUNT_FILE_DIRECTORY_FILE=new File (AI_BACKUP_COUNT_FILE_DIRECTORY);
		
		
		
		
		if (AI_BACKUP_FOLDER_DIRECTORY_FILE.exists()) {} else {
			IS_AI_BACKUP_FOLDER_MISSING="YES";
			IS_THE_AI_MISSING_RESOURCES="YES";
		}
		//+++END OF ELSE CONDITION+++//
		
		
		
		if (AI_BACKUP_COUNT_FILE_DIRECTORY_FILE.exists()) {} else {
			IS_AI_BACKUP_FILE_COUNTER_MISSING="YES";
			IS_THE_AI_MISSING_RESOURCES="YES";
		}
		//+++END OF ELSE CONDITION+++//
		
		
		
		//+++CREATE MISSING ASSETS+++//
		if (IS_AI_BACKUP_FOLDER_MISSING.equalsIgnoreCase("YES") || IS_AI_BACKUP_FILE_COUNTER_MISSING.equalsIgnoreCase("YES")) {
			
			
			//+++CREATE BACKUP FOLDER+++//
			AI_BACKUP_FOLDER_DIRECTORY_FILE.mkdirs();
			
			
			try {
				FileWriter FILE_WRITER=new FileWriter(AI_BACKUP_COUNT_FILE_DIRECTORY);
				FILE_WRITER.write("0");
				FILE_WRITER.close();
			}

			catch (IOException e) {}
			
			
		}
		//+++END OF CONDITION+++//
		
		
		
		
		
		//+++GET CURRENT BACKUP NUMBER+++//
		File getOldBackupNumber=new File(AI_BACKUP_COUNT_FILE_DIRECTORY);
		try {
		Scanner myReader8=new Scanner (getOldBackupNumber);
		while (myReader8.hasNextLine()) {
			OLD_AI_BACKUP_COUNT_STRING=myReader8.nextLine();
		}
		myReader8.close();
		} catch (FileNotFoundException e) {}
		//+++END OF FILE READING+++//
		
		
		
		
		
		
		//+++UPDATE VALUE+++//
		AI_OLD_BACKUP_COUNT=Integer.parseInt(OLD_AI_BACKUP_COUNT_STRING);
		AI_UPDATED_BACKUP_COUNT=AI_OLD_BACKUP_COUNT+1;
		AI_UPDATED_BACKUP_COUNT_STRING=String.valueOf(AI_UPDATED_BACKUP_COUNT);
		
		
		//+++SAVE UPDATED VALUE+++//
		try {
			FileWriter FILE_WRITER=new FileWriter(AI_BACKUP_COUNT_FILE_DIRECTORY);
			FILE_WRITER.write(AI_UPDATED_BACKUP_COUNT_STRING);
			FILE_WRITER.close();
		}

		catch (IOException e) {}
		
		
		
		
		
		//+++SET BACKUP FOLDER NAME+++//
		NEW_BACKUP_FOLDER_NAME="BACKUP "+AI_UPDATED_BACKUP_COUNT_STRING;
		
		//+++CREATE DIRECTORY+++//
		File LATEST_BACKUP_FOLDER_FILE=new File(AI_BACKUP_FOLDER_DIRECTORY+NEW_BACKUP_FOLDER_NAME+"/");
		LATEST_BACKUP_FOLDER_FILE.mkdir();
		
		
		//+++BACKUP JAVA FILE+++//
		SOURCE_FILE_DIRECTORY="YOUR CUSTOM PATH";
		DESTINATION_FILE_DIRECTORY=AI_BACKUP_FOLDER_DIRECTORY+NEW_BACKUP_FOLDER_NAME+"/AI_BACKUP_MAIN.JAVA";
		
		File SOURCE_CODE_FILE=new File(SOURCE_FILE_DIRECTORY);
		File BACKUP_FILE=new File(DESTINATION_FILE_DIRECTORY);
		
		
		try {
		Files.copy(SOURCE_CODE_FILE.toPath(), BACKUP_FILE.toPath());
		}
		
		catch (IOException e) {}	
		
		
		
		
		
		
				//+++BACKUP JAVA FILE+++//
				SOURCE_FILE_DIRECTORY="YOUR CUSTOM PATH";
				DESTINATION_FILE_DIRECTORY=AI_BACKUP_FOLDER_DIRECTORY+NEW_BACKUP_FOLDER_NAME+"/AI_BACKUP_AUTO_BACKUP.JAVA";
				
				SOURCE_CODE_FILE=new File(SOURCE_FILE_DIRECTORY);
				BACKUP_FILE=new File(DESTINATION_FILE_DIRECTORY);
				
				
				try {
				Files.copy(SOURCE_CODE_FILE.toPath(), BACKUP_FILE.toPath());
				}
				
				catch (IOException e) {}	
				
		
		
		
		
		
		
		
				//+++BACKUP JAVA FILE+++//
				SOURCE_FILE_DIRECTORY="YOUR CUSTOM PATH";
				DESTINATION_FILE_DIRECTORY=AI_BACKUP_FOLDER_DIRECTORY+NEW_BACKUP_FOLDER_NAME+"/AI_BACKUP_PROCESS_WORK_ORDER.JAVA";
				
				SOURCE_CODE_FILE=new File(SOURCE_FILE_DIRECTORY);
				BACKUP_FILE=new File(DESTINATION_FILE_DIRECTORY);
				
				
				try {
				Files.copy(SOURCE_CODE_FILE.toPath(), BACKUP_FILE.toPath());
				}
				
				catch (IOException e) {}	
				
		
		
		
		
		
		
		
		
		

	}

}
