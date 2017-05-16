package methods;

public class UserLogin {

	public static void main(String[] args)
	{
		OrgMaster om=new OrgMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("QEdgeTech1234", "QEdgeTech1234");
		System.out.println("Application Login "+res);
		
		res=om.org_Logout();
		System.out.println("Appliation Logout "+res);
		
		om.org_Close();
		System.out.println("Application Close successfull");

	}

}
