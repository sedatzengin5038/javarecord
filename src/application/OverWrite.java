package application;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
public class OverWrite {
   public static void overWrite(String filePath,String newLine,int lineToModify) throws Exception {
	     
       
   try {
       Path path = Paths.get(filePath);
       List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
 
       lines.set(lineToModify, newLine);
       Files.write(path, lines, StandardCharsets.UTF_8);
   } catch (IOException ex) {
       ex.printStackTrace();
   }

   }
	}



