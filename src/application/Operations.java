package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;
	
public class Operations extends Person {
	
	public static void writeFile(String filePath,String word1,String word2
			,String word3,String word4,String word5,String word6) throws IOException {
		File file = new File(filePath);
		FileWriter bw = new FileWriter(file,true);
		
		
		
			bw.write("\n");
			bw.write(word1 + "\n");
			bw.write(word2 + "\n");
			bw.write(word3 + "\n");
			bw.write(word4 + "\n");
			bw.write(word5 + "\n");
			bw.write(word6 + "\n");
		
	 
		bw.close();
	}
	public static int counter(String filePath) throws IOException {
		File file = new File(filePath);
		FileReader fr = new FileReader(file);
		try (BufferedReader bf = new BufferedReader(fr)) {
			int counter = 0;
			if(!filePath.isEmpty()) {
			while(bf.readLine() != null)
				
			{
				
				counter++;
				
				
			}
			bf.close();
			}
			return counter;
		}
		catch(IOException e) {
			return 0;
		}
		
	}
	public static int findLineNumber(String word, String file) throws Exception {
	    try (BufferedReader buf = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(file))))) {
			String line;
			int lineNumber = 0;
			while ((line = buf.readLine()) != null)   {
			    lineNumber++;
			    if (word.equals(line)) {
			        return lineNumber;
			    }
			}
		}

	    return 0;
	}
	public static int counterId(String filePath) throws IOException {
		if(!filePath.isBlank() || !filePath.isEmpty()) {
		return counter(filePath)/7;}
		else {
			return 0;
		}
	}
	
	public void add() throws Exception {
		
		
		if(!Main.textfield2.getText().isEmpty() && !Main.textfield3.getText().isEmpty() && !Main.textfield4.getText().isEmpty() 
		&& !Main.textfield5.getText().isEmpty() && !Main.textfield6.getText().isEmpty() ) {
			
			
			super.setName(Main.textfield2.getText());
			super.setStreet(Main.textfield3.getText());
			super.setCity(Main.textfield4.getText());
			super.setGender(Main.textfield5.getText().charAt(0));
			super.setZip(Integer.parseInt(Main.textfield6.getText()));
			
			if(Main.textfield5.getText().equalsIgnoreCase("m") || Main.textfield5.getText().equalsIgnoreCase("f")) {
				super.setId(counterId("record.txt") + 1);
				Main.textfield.setText(String.valueOf(getId()));
				writeFile("record.txt","Id= " + super.getId(),"Name= " + super.getName(),
				"Street= " + super.getStreet(),"City= " + super.getCity(),"Gender= " + super.getGender(),"Zip= " + super.getZip());

				AlertBox.displayInfo("Information Dialog","Record is added successfully");}
			else {
				AlertBox.displayError("Error Dialog","It's not a valid gender");
				}
		}
		else {
			AlertBox.displayError("Error Dialog","Please fill all empty spots");
		}
		
		
	}
	public static String readTheLine(String filePath,int line) throws IOException {
		try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
			String newLine[] = lines.skip(line).findFirst().get().split(" ");
			int len = newLine.length;
			String newOne = null;
			for(int i = 1;i<len;i++) {
				
				newOne +=  newLine[i] + " ";
			}
		    return newOne;
		    
		}
	}
	public static String readTheLineIntChar(String filePath,int line) throws IOException {
		try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
			String newLine[] = lines.skip(line).findFirst().get().split(" ");
			
		    return newLine[1];
		    
		}
	}
	public void first(Person[] newLines) {
		Main.textfield.setText(String.valueOf(newLines[0].getId()));
		Main.textfield2.setText(newLines[0].getName());
		Main.textfield3.setText(newLines[0].getStreet());
		Main.textfield4.setText(newLines[0].getCity());
		Main.textfield5.setText(String.valueOf(newLines[0].getGender()));
		Main.textfield6.setText(String.valueOf(newLines[0].getZip()));
		
		
		
	}
	public void last(Person[] newLines,int size) {
		Main.textfield.setText(String.valueOf(newLines[size].getId()));
		Main.textfield2.setText(newLines[size].getName());
		Main.textfield3.setText(newLines[size].getStreet());
		Main.textfield4.setText(newLines[size].getCity());
		Main.textfield5.setText(String.valueOf(newLines[size].getGender()));
		Main.textfield6.setText(String.valueOf(newLines[size].getZip()));
		
		
		
	}
	public void nextPrevious(Person[] newLines,int size) {
		Main.textfield.setText(String.valueOf(newLines[size].getId()));
		Main.textfield2.setText(newLines[size].getName());
		Main.textfield3.setText(newLines[size].getStreet());
		Main.textfield4.setText(newLines[size].getCity());
		Main.textfield5.setText(String.valueOf(newLines[size].getGender()));
		Main.textfield6.setText(String.valueOf(newLines[size].getZip()));
	}
	public void updateById(int id,Person[] newLines) throws Exception {
		newLines[id - 1].setName(Main.textfield2.getText());
		newLines[id - 1].setStreet(Main.textfield3.getText());
		newLines[id - 1].setCity(Main.textfield4.getText());
		newLines[id - 1].setGender(Main.textfield5.getText().charAt(0));
		newLines[id - 1].setZip(Integer.valueOf(Main.textfield6.getText()));
		if(counterId("record.txt") >= id ) {
			if(Main.textfield5.getText().equalsIgnoreCase("m") || Main.textfield5.getText().equalsIgnoreCase("f")) {
			
			OverWrite.overWrite("record.txt", "Name= " + Main.textfield2.getText(),findLineNumber("Id= " + id,"record.txt"));
			OverWrite.overWrite("record.txt", "Street= " + Main.textfield3.getText(),findLineNumber("Id= " + id,"record.txt")+1);
			OverWrite.overWrite("record.txt", "City= " + Main.textfield4.getText(),findLineNumber("Id= " + id,"record.txt")+2);
			OverWrite.overWrite("record.txt", "Gender= " + Main.textfield5.getText(),findLineNumber("Id= " + id,"record.txt")+3);
			OverWrite.overWrite("record.txt", "Zip= " + Main.textfield6.getText(),findLineNumber("Id= " + id,"record.txt")+4);
			
			
			}
			else {AlertBox.displayError("Information Dialog","It's not a valid gender");}
		}
		else {AlertBox.displayError("Information Dialog","It's not a valid gender");}
	}
	
	public void searchById(Person[] newLines) throws NumberFormatException, IOException {
		if(Integer.parseInt(Main.textfield1.getText()) <= counterId("record.txt")) {
		Main.textfield.setText(Main.textfield1.getText());
		Main.textfield2.setText(newLines[Integer.parseInt(Main.textfield.getText())- 1].getName());
		Main.textfield3.setText(newLines[Integer.parseInt(Main.textfield.getText())- 1].getStreet());
		Main.textfield4.setText(newLines[Integer.parseInt(Main.textfield.getText())- 1].getCity());
		Main.textfield5.setText(String.valueOf(newLines[Integer.parseInt(Main.textfield.getText())- 1].getGender()));
		Main.textfield6.setText(String.valueOf(newLines[Integer.parseInt(Main.textfield.getText()) - 1].getZip()));}
		else {
			AlertBox.displayError("Display the Info", "There is no address info for this id");
			
		}
		
	}

}
