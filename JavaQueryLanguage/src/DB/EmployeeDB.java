package DB;

public class EmployeeDB {
	private String user;
	private String pass;
	private boolean connect;
	private Employee[] db = new Employee[10];
	private int count = 0;
	private int index = 0;
	
	private EmployeeDB(){}

	public EmployeeDB(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
		System.out.println("DB created!");
	}
	
	public void login(String user, String pass)
	{
		if(this.user.equals(user) && this.pass.equals(pass))
		{
			connect = true;
			System.out.println("Databse connected");
		}
		else {
			System.out.println("Could not resolve the connect identifier specifid");
		}
	}
	
	public boolean addEmployee(String name,int empid,int depno,int managerno,String job,
			String hireDate
			,double sal,double comm)
	{
		if(connect && count< 0.75*db.length)
		{
			db[index] = new Employee(name,empid,depno,managerno,job,hireDate,sal,comm);
			
			count++;
			index++;
			return true;
		}
		else if(connect)
		{
			Employee[]temp = new Employee[db.length*2];
			for(int i = 0;i<count;i++)
			{
				temp[i]=db[i];
			}
			db = temp;
			
			db[index] = new Employee(name,empid,depno,managerno,job,hireDate,sal,comm);
			count++;
			index++;
			return true;
		}
		else
		{
			System.out.println("Could not resolve the connect identifier specifid");
			return false;
		}
	}
	
	public void showDB()
	{
		if(connect)
		{
			for(int i =0; i<count; i++)
			{
				System.out.println(db[i]);
			}
		}
		else
		{
			System.out.println("Could not resolve the connect identifier specifid");
		}
	}
	public void searchByJob(String job)
	{
		if(connect)
		{
			for(int i = 0;i<count;i++)
			{
				if(db[i].job.equalsIgnoreCase(job))
					System.out.println(db[i]);
			}
			System.out.println("Above mentioned are the Employee with job : "+job);
			System.out.println("------------------------------------------------");
		}
		else
			System.out.println("Could not resolve the connect identifier specifid");
	}
	public void searchByDepNo(int depno)
	{
		if(connect) {
			for(int i= 0 ; i<count;i++)
			{
				if(db[i].depno==depno)
					System.out.println(db[i]);
			}
			System.out.println("Above mentioned are the Employee with Dept No. : "+depno);
			System.out.println("------------------------------------------------");
		}
		else
			System.out.println("Could not resolve the connect identifier specifid");
	}
	
	public void comm()
	{
		if(connect)
		{
			int mem  = 0;
			for(int i = 0; i<count ;i++)
			{
				if(db[i].comm>0.0)
				{
					System.out.println(db[i]);
					mem++;
				}
			}
			if(mem == 0)
				System.out.println("[null]");
			System.out.println("Above mentioned are the Employee under commission!!! ");
			System.out.println("------------------------------------------------");
		}
		else
			 System.out.println("Could not resolve the connect identifier specifid");
	}
	
	public void searchBySal(double sal, char ch)
	{
		if(connect)
		{
			switch(ch)
			{
				case '=':
				{
					int mem = 0;
					for(int i = 0; i<count;i++)
					{
						if(db[i].sal==sal)
						{
							System.out.println(db[i]);
							mem++;
						}
					}
					if(mem == 0)
						System.out.println("[null]");
					System.out.println("Above mentioned are the Employee with salary equals to "+sal);
					System.out.println("------------------------------------------------");
					break;
				}
				case '<':
				{
					int mem = 0;
					for(int i = 0; i<count;i++)
					{
						if(db[i].sal<sal)
						{
							System.out.println(db[i]);
							mem++;
						}
					}
					if(mem == 0)
						System.out.println("[null]");
					System.out.println("Above mentioned are the Employee with salary less than "+sal);
					System.out.println("------------------------------------------------");
					break;
				}
				case '>':
				{
					int mem = 0;
					for(int i = 0; i<count;i++)
					{
						if(db[i].sal>sal)
						{
							System.out.println(db[i]);
							mem++;
						}
					}
					if(mem == 0)
						System.out.println("[null]");
					System.out.println("Above mentioned are the Employee with salary greater than "+sal);
					System.out.println("------------------------------------------------");
					break;
				}
				default:
				{
					System.out.println("Could not resolve the connect identifier specifid");
					System.out.println("------------------------------------------------");
				}
			}
		}
		else
		 System.out.println("Could not resolve the connect identifier specifid");
	}
	
	public void president()
	{
		if(connect)
		{
			for(int i = 0;i<count;i++)
			{
				if(db[i].managerno == -1)
					System.out.println(db[i]);
			}
			System.out.println("Above mentioned are the President.");
			System.out.println("------------------------------------------------");
		}
		else
			System.out.println("Could not resolve the connect identifier specifid");
	}
	
	String manName;
		public int manager(int empid)
		{ 
			for(int i = 0;i<count;i++)
			{
				if(db[i].empid==empid)
				{
					if(db[i].job.equalsIgnoreCase("MANAGER")||db[i].job.equalsIgnoreCase("President"))
					{
						manName = db[i].name;
						return db[i].empid;
					}
				}
			}
			return Integer.MIN_VALUE;
		}
		
		public void employeeUnderManager(int empid)
		{
			if(connect)
			{
				boolean check = false;
				for(int i = 0; i<count;i++)
				{
					if(db[i].managerno==manager(empid))
					{
						System.out.println(db[i]);
						check = true;
					}
				}
				if(!check)
					System.out.println("[null]");
				System.out.println("Above mentioned are the Employee under Manager : "+manName);
				System.out.println("------------------------------------------------");
			}
			else
				System.out.println("Could not resolve the connect identifier specifid");
		}
		
		
		public void checkMaxMin(String function)
		{
			if(connect)
			{
			String fun = function.toLowerCase();
			switch(fun)
			{
			case "max":
			{
				double max = 0;
				for(int i = 0;i<count;i++)
				{
					if(db[i].sal>max)
					{
						max = db[i].sal;
					}
				}
				System.out.println("Maximum Salalry : "+max);
				break;
			}
			case "min":
			{
				double min = Double.MAX_VALUE;
				for(int i = 0;i<count;i++)
				{
					if(db[i].sal<min)
					{
						min = db[i].sal;
					}
				}
				System.out.println("Minimum Salalry : "+min);
				break;
			}
			case "secmax":
			{
				double max = 0;
				double secMax = 0;
				for(int i = 0;i<count;i++)
				{
					if(db[i].sal>max)
					{
						secMax = max;
						max = db[i].sal;
					}
					else if(db[i].sal>secMax && db[i].sal!=max)
					{
						secMax = db[i].sal;
					}
				}
				System.out.println("Second Maximum Salalry : "+secMax);
				break;
			}
			case "secmin":
			{
				double min = Double.MAX_VALUE;
				double secMin = Double.MAX_VALUE;
				for(int i = 0;i<count;i++)
				{
					if(db[i].sal<min)
					{
						secMin = min;
						min = db[i].sal;
					}
					else if(db[i].sal<secMin && db[i].sal!=min)
					{
						secMin = db[i].sal;
					}
				}
				System.out.println("Second Maximum Salalry : "+secMin);
				break;
			}
			default:
				System.out.println("Please provide input as max, min, secmax, secmin (irrespective of case)");
				break;
			}
			}
			else
			{
				System.out.println("Could not resolve the connect identifier specifid");
			}
		}
		
}


