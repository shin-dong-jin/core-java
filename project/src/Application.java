import calc.Calculation;
import input.ConsoleReader;
import input.InputView;
import management.Employees;
import output.Output;

public class Application {

    public static void main(String[] args) {
    	Employees employees = new Employees();
    	
    	
        InputView inputView = new InputView(new ConsoleReader());
        inputView.inputEmployees(employees);
        
        Calculation calculation = new Calculation();
        calculation.calc(employees);
        
        
        Output Output = new Output();
        Output.displayEmployeeData(employees);
        
        System.out.println("Programming is over..");
        inputView.close();
    }
}


