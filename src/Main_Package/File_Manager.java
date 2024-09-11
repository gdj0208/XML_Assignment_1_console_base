package Main_Package;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import Main_Package.Main_Class;

public class File_Manager {
	private Scanner my_scanner = new Scanner(System.in);
	private Main_Class main_Class;
	
	public File_Manager( Main_Class main_Class) { this.main_Class = main_Class; }
	
	public void request_load_or_make_file() {
		int order = 0;
		while(true) { 
			//파일 불러오기 또는 생성 요청 출력 
			System.out.println("\nChoose your operation.");
			System.out.println("1. Load");
			System.out.println("2. Make");
			
			// 파일 불러오기 또는 생성 
			order = my_scanner.nextInt();
			
			// 잘못된 입력시 다시 입력 요구 
			if(order == 1 || order == 2) { break; }
			System.out.println("Choose right operation");
		}
		
		if(order == 1) { load_file(); }
		else { make_file(); }
	}
	
	// 파일 불러오기 
	private void load_file() {
		try { main_Class.file_data = Files.readAllLines(Paths.get("input.txt")); } 
		catch (IOException e) { e.printStackTrace(); }
		System.out.println("File has successfully loaded!");
	}
	
	// 파일 생성 
	private void make_file() {
		System.out.print("\nName your new File : ");
		String title = my_scanner.next();
		
		try { Files.write(Paths.get(title+".txt"), Arrays.asList("")); }
		catch (IOException e) { e.printStackTrace(); }
	}
}
