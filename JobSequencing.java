package Dynamic;

import java.util.*;

class Jobs{
	
	char id;
	int profit;
	int deadline;
	
	Jobs(char id,int profit,int deadline){
		
		this.id=id;
		this.profit=profit;
		this.deadline=deadline;
	}
	
}


public class JobSequencing  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jobs j1=new Jobs('a',20,4);
		Jobs j2=new Jobs('b',10,1);
		Jobs j3=new Jobs('c',40,1);
		Jobs j4=new Jobs('d',30,1);
		
		List<Jobs> l=new ArrayList<>();
		l.add(j1);
		l.add(j2);
		l.add(j3);
		l.add(j4);
		
		Collections.sort(l,(new Comparator<Jobs>() {
			 
			@Override
			public int compare(Jobs arg0, Jobs arg1) {
				return arg0.profit-arg1.profit;
			}
		}).reversed());
		
		int n=4;
		boolean[] slot=new boolean[n]; 
		String result="";
		
		for(int i=0;i<n;i++)
			slot[i]=false;
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).id);
		}
		
		for(int i=0;i<n;i++) {
			
			for(int j=Math.min(l.get(i).deadline-1,n);j>=0;j--) {
				
				if(slot[j]==false) {
					
					slot[j]=true;
					result+=l.get(i).id;
					break;
				}
				
			}
		}
	
		
		System.out.println(result);
	}

 

}
