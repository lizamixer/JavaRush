package JavaCore.level23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        Pattern pat = Pattern.compile("\\d+|\\+|-|\\*|/");
        while (!(line = reader.readLine()).equals("end")) {
            ArrayList<String> symbols = new ArrayList();
            Matcher matcher = pat.matcher(line);
            while (matcher.find()) {
                symbols.add(matcher.group());
            }

            String lastOperand = "";
            double result = 0;
            //4+5-1

            for (int i = 0; i < symbols.size(); i++) {
                try {
                    int number = Integer.parseInt(symbols.get(i));
                    switch (lastOperand) {
                        case "-":
                            result -= number;
                            break;
                        case "*":
                            result *= number;
                            break;
                        case "/":
                            result /= number;
                            break;
                        default:
                            result += number;
                            break;
                    }
                } catch (NumberFormatException e) {
                    lastOperand = symbols.get(i);
                }
            }

            System.out.println("Result: " + result);


        }

    }
}
