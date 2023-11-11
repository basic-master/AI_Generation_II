

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
//+++ARTIFICIAL INTELLIGENCE INNOVATIONS - BY EMILE DOMINIQUE+++//
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//


//+++LIBRARIES+++//
import java.util.*;
import java.io.*;
import java.time.LocalTime.*;
import java.time.LocalDate.*;
import java.io.FileWriter.*;
import java.io.IOException.*;
import java.nio.file.*;
import java.time.*;
import java.text.*;
import java.time.format.*;
import java.awt.*;
//---------------//












//++++++++++++++++++++++++++++//
//+++START OF PROGRAM CLASS+++//
//++++++++++++++++++++++++++++//
public class Main
{
	public static void main(String[] args) {
	
		
		//+++++++++++++++++++//
		//+++ALL VARIABLES+++//
		//+++++++++++++++++++//
		
		
		//+++PROGRAM SETTINGS+++//
		String VERSION="5C";
		String WORK_MODE="ON";
		String AUTO_BACKUP_SOURCE_CODE="OFF";
		//+++++++++++++++++++++++//
		
		
		//++++WORK SCHEDULE - 24 HOUR TIME+++//
		int WORK_SHIFT_START_HOUR=18;
		int WORK_SHIFT_START_MINUTE=42;

		int WORK_SHIFT_END_HOUR=18;
		int WORK_SHIFT_END_MINUTE=50;
		
		String DAYS_TO_WORK="Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday";
		String DAYS_TO_WORK_UPPERCASE=DAYS_TO_WORK.toUpperCase();
		//++++++++++++++++++++//
		
		
		
		
		
		
		
		String DAY_OF_THE_WEEK="";
		String HOURS_TO_WORK="";
		String AM_I_AUTHORIZED_TO_BEGIN_WORK="";
		String AM_I_AUTHORIZED_TO_BEGIN_LEARNING="";
		String SWITCH="";
		String TIME_TYPE="";
		String EVENING_OR_MORNING="";
		
		String TIME_STRING="";
		String TIME_HOUR_STRING="";
		String TIME_MINUTE_STRING="";
		
		String IS_TODAY_A_WORK_DAY="";
		String SHIFT_START_DETECTION="";
		
		String IS_TODAYS_WORKING_SHIFT_OVER="";
		String DOES_THE_WORKING_SHIFT_HAVE_YET_TO_START="";
		String HAS_THE_WORKING_SHIFT_ENDED="";
		
		String IMPROVE_VISUALS_1_STRING="";
		
		int TOTAL_LINES_IN_WORK_ORDER_FILE=0;
		int WORK_ORDER_DATA_FROM_FILE_LENGTH=0;
		
		int IS_TODAYS_WORKING_SHIFT_OVER_KEY=0;
		
		int DAY=0;
		char ENTER=10;
		
		int TIME_HOUR_NUMBER=0;
		int TIME_MINUTE_NUMBER=0;
		
		int ACTIVATION_KEY_1=0;
		int ACTIVATION_KEY_2=0;
		int ACTIVATION_KEY_3=0;
		int ACTIVATION_KEY_4=0;
		int ACTIVATION_KEY_5=0;
		
		int WORKING_ACTIVATION_KEY_1=0;
		int WORKING_ACTIVATION_KEY_2=0;
		int WORKING_ACTIVATION_KEY_3=0;
		int WORKING_ACTIVATION_KEY_4=0;
		int WORKING_ACTIVATION_KEY_5=0;
			
		//++++++++++++++++++++++++++//
		//+++END OF ALL VARIABLES+++//
		//++++++++++++++++++++++++++//
		
		
		
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//	
		
		
		
	
	
		//++++++++++//
		//+++MENU+++//
		//++++++++++//
		
		System.out.println("++++++++++++++++++++++");
		System.out.println("+AI GENERATION II v"+VERSION+"+");
		System.out.println("++++++++++++++++++++++");
		System.out.println();
		
		//+++++++++++++++++//
		//+++END OF MENU+++//
		//+++++++++++++++++//
	
		
		
		
		
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	
		
	
	
	
		//+++++++++++++++++//
		//+++AUTO BACKUP+++//
		//+++++++++++++++++//
		
		if (AUTO_BACKUP_SOURCE_CODE.equalsIgnoreCase("ON") || AUTO_BACKUP_SOURCE_CODE.equalsIgnoreCase("YES")) {
		
			Auto_Backup.main();
		
		}
		//+++END OF AUTO BACKUP SOURCE CODE CONDITION+++//
		
		//++++++++++++++++++++++++//
		//+++END OF AUTO BACKUP+++//
		//++++++++++++++++++++++++//
		
	
	
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	
	
		
		
		
	//+++FORMAT WORK MINUTE TO PREVENT ERROR+++//
	if (WORK_SHIFT_START_MINUTE>=0 && WORK_SHIFT_START_MINUTE<=9) {
	IMPROVE_VISUALS_1_STRING="0"+WORK_SHIFT_START_MINUTE;
	}
	//+++END OF CONDITION+++//
	
	else {IMPROVE_VISUALS_1_STRING=String.valueOf(WORK_SHIFT_START_MINUTE);}
		
		
		
		
		
		
		
		
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
		
		
		
		
		
	
	//+++TURN SWITCH ON+++//
	SWITCH="ON";
	
	
	//+++++++++++++++++++//
	//+++INFINITE LOOP+++//
	//+++++++++++++++++++//
	while (SWITCH.equals("ON")) {
		
		
		
		
		
		
		Calendar calendar=Calendar.getInstance();
		
		
		//++++++++++++++++++++++++++++++++++++++//
		//+++DETERMINE IF TODAY IS A WORK DAY+++//
		//++++++++++++++++++++++++++++++++++++++//
		
				
		if (WORK_MODE.equalsIgnoreCase("ON")) {
		
		
		//+++GET THE DAY OF THE WEEK+++//
		//Calendar calendar=Calendar.getInstance();
		DAY=calendar.get(Calendar.DAY_OF_WEEK);
		if (DAY==1) {DAY_OF_THE_WEEK="SUNDAY";} 
		if (DAY==2) {DAY_OF_THE_WEEK="MONDAY";}
		if (DAY==3) {DAY_OF_THE_WEEK="TUESDAY";}
		if (DAY==4) {DAY_OF_THE_WEEK="WEDNESDAY";}
		if (DAY==5) {DAY_OF_THE_WEEK="THURSDAY";}
		if (DAY==6) {DAY_OF_THE_WEEK="FRIDAY";}
		if (DAY==7) {DAY_OF_THE_WEEK="SATURDAY";}
		//-----------------------------//
				
				
				
		if (DAYS_TO_WORK_UPPERCASE.contains(DAY_OF_THE_WEEK)) {
			IS_TODAY_A_WORK_DAY="YES";	
		}
		//+++END OF CONDITION+++//
		
		
		
		
		}
		//+++END OF IS WORK MODE ON CONDITION+++//
				
				
		//+++++++++++++++++++++++++++++++++++++++++++++++//
		//+++END OF DETERMINING IF TODAY IS A WORK DAY+++//
		//+++++++++++++++++++++++++++++++++++++++++++++++//
		
		
		
		
		
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
		
		
		
		
		
		//++++++++++++++++++++++++++++++++++//
		//+++TIME AND DATE INITIALIZATION+++//
		//++++++++++++++++++++++++++++++++++//
		
		LocalTime TIME=LocalTime.now();
		LocalDate DATE=LocalDate.now();
		
		//+++GET AM OR PM+++//
		TIME_TYPE=DateTimeFormatter.ofPattern("a").format(LocalTime.now());
		
		//+++++++++++++++++++++++++++++++++++++++++//
		//+++END OF TIME AND DATE INITIALIZATION+++//
		//+++++++++++++++++++++++++++++++++++++++++//
		
		
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		
		//++++++++++++++++++++++//
		//+++TIME PROGRAMMING+++//
		//++++++++++++++++++++++//
		
		TIME_STRING=String.valueOf(TIME);
		
		try {
			TIME_HOUR_STRING=TIME_STRING.substring(0,2);
		} catch (StringIndexOutOfBoundsException e) {}
		
		
		try {
			TIME_MINUTE_STRING=TIME_STRING.substring(3,5);
		} catch (StringIndexOutOfBoundsException e) {}
		
		
		TIME_HOUR_NUMBER=Integer.valueOf(TIME_HOUR_STRING);
		TIME_MINUTE_NUMBER=Integer.valueOf(TIME_MINUTE_STRING);
		
		//+++++++++++++++++++++++++++++//
		//+++END OF TIME PROGRAMMING+++//
		//+++++++++++++++++++++++++++++//
		
		
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		
		
		
		//+++++++++++++++++++++++++++++++++++++++++//
		//+++DETERMINE IF I SHOULD START WORKING+++//
		//+++++++++++++++++++++++++++++++++++++++++//
		
						//+++DETERMINE IF I SHOULD START WORKING+++//
					
						if (TIME_HOUR_NUMBER==WORK_SHIFT_START_HOUR && TIME_MINUTE_NUMBER>=WORK_SHIFT_START_MINUTE || TIME_HOUR_NUMBER>WORK_SHIFT_START_HOUR && TIME_HOUR_NUMBER<WORK_SHIFT_END_HOUR) {
							AM_I_AUTHORIZED_TO_BEGIN_WORK="YES";
						}
						//+++END OF CONDIITON+++//
						
					//+++++++++++++++++++++++++++++++++++++++++//
			
		//++++++++++++++++++++++++++++++++++++++++++++++++++//
		//+++END OF DETERMINING IF I SHOULD START WORKING+++//
		//++++++++++++++++++++++++++++++++++++++++++++++++++//
				
			



		//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		//++++++++++++++++++++++++++++++++++++++++//
		//+++DETERMINE IF I SHOULD STOP WORKING+++//
		//++++++++++++++++++++++++++++++++++++++++//
		
						
					//+++DETERMINE WHEN I SHOULD STOP WORKING+++//
						if (TIME_HOUR_NUMBER==WORK_SHIFT_END_HOUR && TIME_MINUTE_NUMBER>=WORK_SHIFT_END_MINUTE || TIME_HOUR_NUMBER>WORK_SHIFT_END_HOUR) {
							AM_I_AUTHORIZED_TO_BEGIN_WORK="NO";
						}
						//+++END OF CONDITION+++//
						
					//++++++++++++++++++++++++++++++++++++++++++//
	
	
	
		//+++++++++++++++++++++++++++++++++++++++++++++++++//
		//+++END OF DETERMINING IF I SHOULD STOP WORKING+++//
		//+++++++++++++++++++++++++++++++++++++++++++++++++//
					
					
				
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		//+++++++++++++++++++//
		//+++START WORKING+++//
		//+++++++++++++++++++//
		
		if (AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("yes") && WORKING_ACTIVATION_KEY_1==0 && IS_TODAY_A_WORK_DAY.equalsIgnoreCase("YES")) {
			
			
			System.out.println("ON CLOCK!!!");
			WORKING_ACTIVATION_KEY_1=1;
			
			//+++IMPORT THE AI CAREER, OR JOB HERE+++//
			Career_Database.career();
			
			
			
		}
		//+++END OF CONDITION FOR AUTHORIZATION TO WORK+++//
		
		//+++++++++++++++++++++++//
		//+++END OF WORK LOGIC+++//
		//+++++++++++++++++++++++//
		
		
		
		
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		
		
		
		//++++++++++++++++++++++//
		//+++NOT WORKING LOGIC++//
		//++++++++++++++++++++++//
		
		if (WORK_MODE.equalsIgnoreCase("ON") && AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("NO") && WORKING_ACTIVATION_KEY_2==0) {
			System.out.println("I am not working. My next working shift begins at "+WORK_SHIFT_START_HOUR+":"+IMPROVE_VISUALS_1_STRING+".");
			WORKING_ACTIVATION_KEY_2=1;
		}
		//+++END OF CONDITION+++//
		
		
		if (WORK_MODE.equalsIgnoreCase("ON") && AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("") && WORKING_ACTIVATION_KEY_2==0) {
			System.out.println("I am not working. My next working shift begins at "+WORK_SHIFT_START_HOUR+":"+IMPROVE_VISUALS_1_STRING+".");
			WORKING_ACTIVATION_KEY_2=1;
		}
		//+++END OF CONDITION+++//
		
		
		
		
		if (AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("NO") && WORKING_ACTIVATION_KEY_1==1 && ACTIVATION_KEY_1==0) {
			System.out.println("My working shift has ended.");
			ACTIVATION_KEY_1=1;
			IS_TODAY_A_WORK_DAY="";
			WORKING_ACTIVATION_KEY_1=0;
		}
		
		
		
		
		//++++++++++++++++++++++++++++++//
		//+++END OF NOT WORKING LOGIC+++//
		//++++++++++++++++++++++++++++++//
		
		
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		
		
		
		
		
		
		
	}
	//++++++++++++++++++++++++++//
	//+++END OF INFINITE LOOP+++//
	//++++++++++++++++++++++++++//
		
	
	
	
				
		
		
		
		
		//++++++++++++++++++++++++++++++++++++++++++//
		//+++END OF USABLE PROGRAM DATA FOR CLASS+++//
		//++++++++++++++++++++++++++++++++++++++++++//
	}
}
//++++++++++++++++++++//
//+++END OF PROGRAM+++//
//++++++++++++++++++++//