package coding_problems;

public class Singleton {
	
	static Singleton obj;
	 private  Singleton(){
	 }
	 
	 public static Singleton getInstance(){
	  if(obj!=null){
	   return  obj;
	  }
	  else{
	   obj=new Singleton();
	  return obj;
	  }
	 }
	 
	public static void main(String[] args) {
		 Singleton obj=Singleton.getInstance();
		  Singleton obj1=Singleton.getInstance();
		  
		  if(obj==obj1){
		  System.out.println("indhu"); 
		  }
		  else{
		   System.out.println("Sindhu");
		  }
		               System.out.println(obj==obj1);
	}

}
