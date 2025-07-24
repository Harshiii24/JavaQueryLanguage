package DB;
import java.util.Scanner;
public class EmployeeDriver {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		EmployeeDB ref = new EmployeeDB("scott","tiger");
		ref.login("scott", "tiger");
		ref.addEmployee("Smith", 7369, 20,7902, "Clerk", "17/12/1980",800.0,0.0);
		ref.addEmployee("Allen", 7499, 30, 7698, "Salesman", "20/02/1981", 1600.0,300.0);
		ref.addEmployee("Ward", 7521, 30, 7698, "Salesman", "22/20/1981", 1250.0,500.0);
		ref.addEmployee("Jones", 7566, 20, 7839, "Manager", "02/04/1981", 2975.0,0.0);
		ref.addEmployee("Martin", 7654, 30, 7698, "Salesman", "28/09/1981", 1250.0,1400.0);
		ref.addEmployee("Blake", 7698, 30, 7839, "Manager", "01/05/1981", 2850.0,0.0);
		ref.addEmployee("Clark", 7782, 10, 7839, "Manager", "09/06/1981", 2450.0,0.0); 
		ref.addEmployee("Scott", 7788, 20, 7566, "Analyst", "19/04/1987", 3000.0,0.0);
		ref.addEmployee("King", 7839, 10, -1, "President", "17/11/1981", 5000.0,0.0);
		ref.addEmployee("Turner", 744, 30, 7698, "Salesman", "08/09/1981", 1500.0,0.0);
		ref.addEmployee("Adams", 7676, 20, 7788, "Clerk", "23/05/1987", 1100.0,0.0);
		ref.addEmployee("James", 7908, 30, 7698, "Clerk", "03/12/1981",950.0,0.0);
		ref.addEmployee("Ford", 7902, 20, 7566, "Analyst", "03/12/1981", 3000.0,0.0);
		ref.addEmployee("Miller", 7934, 10, 7782, "Clerk", "23/01/1982",1300.0,0.0);
		if (!ref.connect) {
            System.out.println("Login failed.");
            sc.close();
            return;
        }

        System.out.println("Login successful!");

        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Show All Employees");
            System.out.println("2. Search by Job");
            System.out.println("3. Search by Department Number");
            System.out.println("4. Search by Salary Condition");
            System.out.println("5. Show Employees Under a Manager");
            System.out.println("6. Show Commissioned Employees");
            System.out.println("7. Check MAX/MIN/SECMAX/SECMIN Salary");
            System.out.println("8. Show President");
            System.out.println("9. ORDERBY ASC (Lazy enough to design ORDERBY DESC)");
            System.out.println("10. Add New Employee");
            System.out.println("11. Remove Employee");
            System.out.println("12. Commit");
            System.out.println("13. Rollback");
            System.out.println("14. Truncate");
            System.out.println("15. Drop");
            System.out.println("16. Purge");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            String input = sc.nextLine().trim();

            switch (input) {
                case "1":
                	System.out.println("------------------------------------------------");
                    ref.showDB();
                    break;
                case "2":
                    System.out.print("Enter job: ");
                    String job = sc.nextLine();
                    System.out.println("------------------------------------------------");
                    ref.searchByJob(job);
                    break;
                case "3":
                    System.out.print("Enter department number: ");
                    int depNo = Integer.parseInt(sc.nextLine());
                    System.out.println("------------------------------------------------");
                    ref.searchByDepNo(depNo);
                    break;
                case "4":
                    System.out.print("Enter salary: ");
                    double sal = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter condition ('>', '<', '='): ");
                    char cond = sc.nextLine().charAt(0);
                    System.out.println("------------------------------------------------");
                    ref.searchBySal(sal, cond);
                    break;
                case "5":
                    System.out.print("Enter manager number: ");
                    int mgr = Integer.parseInt(sc.nextLine());
                    System.out.println("------------------------------------------------");
                    ref.employeeUnderManager(mgr);
                    break;
                case "6":
                	System.out.println("------------------------------------------------");
                    ref.comm();
                    break;
                case "7":
                    System.out.print("Enter option (max, min, secmax, secmin): ");
                    String opt = sc.nextLine();
                    System.out.println("------------------------------------------------");
                    ref.checkMaxMin(opt);
                    break;
                case "8":
                	System.out.println("------------------------------------------------");
                    ref.president();
                    break;
                case "9":
                    System.out.print("Enter attribute to sort by (empid, name, salary, job, depno, managerno, comm): ");
                    String sortAttr = sc.nextLine().trim();
                    System.out.println("------------------------------------------------");
                    ref.SortBy(sortAttr);
                    break;
                case "10":
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter empid: ");
                    int empid = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter depno: ");
                    int depno = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter manager number: ");
                    int managerno = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter job: ");
                    String newJob = sc.nextLine();
                    System.out.print("Enter hire date (dd/MM/yyyy): ");
                    String hireDate = sc.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter commission: ");
                    double comm = Double.parseDouble(sc.nextLine());
                    System.out.println("------------------------------------------------");
                    ref.addNewEmployee(name, empid, depno, managerno, newJob, hireDate, salary, comm);
                    break;
                case "11":
                    System.out.println(" Enter exact details of the employee to remove:");
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    System.out.print("EmpID: ");
                    empid = Integer.parseInt(sc.nextLine());
                    System.out.print("Depno: ");
                    depno = Integer.parseInt(sc.nextLine());
                    System.out.print("Manager No: ");
                    managerno = Integer.parseInt(sc.nextLine());
                    System.out.print("Job: ");
                    newJob = sc.nextLine();
                    System.out.print("Hire Date: ");
                    hireDate = sc.nextLine();
                    System.out.print("Salary: ");
                    salary = Double.parseDouble(sc.nextLine());
                    System.out.print("Commission: ");
                    comm = Double.parseDouble(sc.nextLine());
                    System.out.println("------------------------------------------------");
                    ref.removeEmployee(name, empid, depno, managerno, newJob, hireDate, salary, comm);
                    break;
                case "12":
                	System.out.println("------------------------------------------------");
                    ref.commit();
                    break;
                case "13":
                    if(EmployeeDB.savePointIndex>0 || ref.ifCommit!=0)
                    {
                    	System.out.print("Enter rollback steps: ");
                    	int steps = Integer.parseInt(sc.nextLine());
                    	System.out.println("------------------------------------------------");
                    	ref.rollback(steps);
                    }
                    else {
                    	System.out.println("Already commited can not ROLLBACK");
                    	System.out.println("------------------------------------------------");
                    }
                    break;
                case "14":
                	System.out.println("------------------------------------------------");
                    ref.truncate();
                    break;
                case "15":
                	System.out.println("------------------------------------------------");
                    ref.drop();
                    break;
                case "16":
                	System.out.println("------------------------------------------------");
                    ref.purge();
                    break;
                case "0":
                    System.out.println("Exiting. Goodbye!");
                    sc.close();
                    return;
                default:
                	System.out.println("------------------------------------------------");
                    System.out.println("Invalid option. Try again.");
            }
        }
		
	
		}
}
