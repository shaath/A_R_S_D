package methods;

public class EmpReg {

	public static void main(String[] args) 
	{
		OrgMaster om=new OrgMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.org_Empreg("QEdge", "tech");
		System.out.println("Employee Registration "+res);
		
		res=om.org_Logout();
		System.out.println("Appliation Logout "+res);
		
		om.org_Close();
		System.out.println("Application Close successfull");

	}

}
