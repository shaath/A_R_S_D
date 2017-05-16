package methods;

public class TestSuitEg {

	public static void main(String[] args) 
	{
		OrgMaster om=new OrgMaster();
		//Login
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.org_Logout();
		System.out.println("Appliation Logout "+res);
		
		om.org_Close();
		System.out.println("Application Close successfull");
		
		//Empreg
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.org_Empreg("Jithendar", "Neela");
		System.out.println("Employee Registration "+res);
		
		res=om.org_Logout();
		System.out.println("Appliation Logout "+res);
		
		om.org_Close();
		System.out.println("Application Close successfull");
		
		//Userreg
		
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.org_Userreg("Jithendar Neela", "JithendarNeela1234", "JithendarNeela1234", "JithendarNeela1234");
		System.out.println("User Registration "+res);
		
		res=om.org_Logout();
		System.out.println("Appliation Logout "+res);
		
		om.org_Close();
		System.out.println("Application Close successfull");
		
		//UserLogin
		
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("QEdgeTech1234", "QEdgeTech1234");
		System.out.println("Application Login "+res);
		
		res=om.org_Logout();
		System.out.println("Appliation Logout "+res);
		
		om.org_Close();
		System.out.println("Application Close successfull");

	}

}
