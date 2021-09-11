package overlopading;

public class OverloadingWithDiffParameter {
		//for employee
		void getScore(String Empname,int empid,int emprating) {
			System.out.println("Name : "+Empname+"\nEmployee Id : "+empid+"\nEmployee Rating : "+emprating+"\n");
		}
		
		//For student 
		void getScore(String stuname,int rollnum,int percent, String grade) {
			System.out.println("Student Name : "+stuname+"\nStudent Roll Number : "+rollnum+"\nPercentage : "+percent+"%\nGrade : "+grade);
			
		}

		public static void main(String args[]) {
			OverloadingWithDiffParameter overloadingWithDifferentParameter=new OverloadingWithDiffParameter();
			overloadingWithDifferentParameter.getScore("Roshan", 111, 4);
			overloadingWithDifferentParameter.getScore("Nitish", 1654, 76, "A");
			
		}
	}


