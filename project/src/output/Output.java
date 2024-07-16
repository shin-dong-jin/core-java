package output;

import management.Employee;
import management.Employees;

import java.text.DecimalFormat;

public class Output {
	DecimalFormat decimalFormat = new DecimalFormat("#.##");

	private void printHeader() {

	}

	    public void displayEmployeeData(Employees employees) {
	        // Quick Sort로 정렬
//	        quickSort(employees, 0, employees.length - 1);
	        // 출력 화면
	    	DecimalFormat df = new DecimalFormat("#.##");
	        System.out.println("\n===== 사원 급여 정보 =====");
	        System.out.println("<<급여 관리 프로그램>>");
	        System.out.println("-----------------------------------");
	        System.out.printf("%10s\t%10s\t%10s\t%10s\t%10s\t%10s\t%10s\t","사번", "급수", "호", "수당", "지급액", "세금", "차인지급액");
	        System.out.println();
	        System.out.println("-----------------------------------");
	        
	        for (int i = 0; i < employees.getSize(); i++) {
	        	Employee employee = employees.getEmployee(i);
	        	
	        	System.out.printf("%02d\t", employee.getEmpId());
	        	System.out.printf("%d\t", employee.getGrade());
	        	System.out.printf("%d\t", employee.getStep());
	        	System.out.printf("%s\t", df.format(employee.getAllowance()));
	        	System.out.printf("%s\t", df.format(employee.getSalary()));
	        	System.out.printf("%s\t", df.format(employee.getTax()));
	        	System.out.printf("%s\t", df.format(employee.getAdjustedSalary()));
	        	System.out.println();
				
			}
	        
	        System.out.println();
	        
	        
	        System.out.println("입력데이터 출력");
	        for (int i = 0; i < employees.getSize(); i++) {
	        	Employee employee = employees.getEmployee(i);
	        	System.out.printf("%02d\t", employee.getEmpId());
	        	System.out.printf("%d\t", employee.getGrade());
	        	System.out.printf("%d\t", employee.getStep());
	        	System.out.printf("%s\t", df.format(employee.getAllowance()));
	        	System.out.println();
				
			}
	    }
	    // Quick Sort 구현
//	    private static void quickSort(List<Employee> list, int low, int high) {
//	        if (low < high) {
//	            int pi = partition(list, low, high);
//	            quickSort(list, low, pi - 1);
//	            quickSort(list, pi + 1, high);
//	        }
//	    }
//	    private static int partition(List<Employee> list, int low, int high) {
//	        Employee pivot = list.get(high);
//	        int i = (low - 1);
//	        for (int j = low; j < high; j++) {
//	            if (list.get(j).compareTo(pivot) < 0) {
//	                i++;
//	                // swap list[i] and list[j]
//	                Employee temp = list.get(i);
//	                list.set(i, list.get(j));
//	                list.set(j, temp);
//	            }
//	        }
//	        // swap list[i + 1] and list[high] (or pivot)
//	        Employee temp = list.get(i + 1);
//	        list.set(i + 1, list.get(high));
//	        list.set(high, temp);
//	        return i + 1;
//	    }
//	}
}
