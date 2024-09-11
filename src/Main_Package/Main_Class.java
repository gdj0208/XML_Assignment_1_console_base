package Main_Package;
import Main_Package.File_Manager;
import java.io.*;
import java.util.List;
import java.util.Scanner;


public class Main_Class {
	private static Scanner my_scanner = new Scanner(System.in);
	private static int operation = -1;
	public static List<String> file_data;
	private static File_Manager fManager;
	
	public static void main(String[] args) {
		Main_Class main_class = new Main_Class();
		fManager = new File_Manager(main_class);
		
		fManager.request_load_or_make_file();
		while(operation != 0) {
			print_operation_list();
			get_operation();
			operate();
		}
	}
	
	private static void print_operation_list() {
		System.out.println("\nChoose your operation.");
		System.out.println("1. Find");
		System.out.println("2. Save");
		System.out.println("3. Print");
		System.out.println("4. Exit");
	}
	
	private static void get_operation() {
		while(true) {
			operation = my_scanner.nextInt();
			
			if(0 < operation && operation < 6) { break; }
			System.out.println("Choose right operation");
		}
	}
	
	private static void operate() {
		switch(operation) {
		case 1:		// 특정 문자열 검색 
			System.out.println("미구현 상태입니다.");
			break;
		case 2:		// 파일 저장 
			System.out.println("미구현 상태입니다.");
			break;
		case 3:		// 파일 출력 
			print();
			break;
		case 4:		// 종료
			operation = 0;
			break;
		}
	}
	
	private static void print() { file_data.forEach(System.out::println); }
}
