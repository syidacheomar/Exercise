import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessor {

    // Method to read integers from a file
    public List<Integer> readFile(String fileName) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    numbers.add(Integer.parseInt(line));
                } catch (NumberFormatException e) {
                    numbers.add(null); 
                }
            }
        }
        return numbers;
    }


    // Method to divide the numbers by a given divisor
    public List<String> divideNumbers(List<Integer> numbers, int divisor) {
        List<String> results = new ArrayList<>();
        for (Integer number : numbers) {
            if(number == null){
                results.add("Invalid number format");
            } else{
            try {
                if(number == 0){
                    results.add("Division by zero error for number " + number);
                }else{
                int result = number / divisor;
                results.add(String.valueOf(result));
                }
            }catch (ArithmeticException e) {
                // Handle division by zero
                results.add("Division by zero error for number " + number);
            }
        }
    }
        return results;
    }

    // Method to write the results to a file
    public void writeFile(String fileName, List<String> results) throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(fileName));
            for (String result : results) {
                bw.write(result);
                bw.newLine();
            }
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
    }

    // Main method to read, process, and write files
    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();
        Scanner scanner = new Scanner(System.in);

        try {
            // Read integers from input.txt
            List<Integer> numbers = processor.readFile("input.txt");

            // Get divisor from user
            System.out.print("Enter a divisor: ");
            int divisor = scanner.nextInt();

            // Perform division on the numbers
            List<String> results = processor.divideNumbers(numbers, divisor);

            // Write the results to output.txt
            processor.writeFile("output.txt", results);

            System.out.println("Results written to output.txt");
        } catch (IOException e) {
            System.out.println("File operation error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}