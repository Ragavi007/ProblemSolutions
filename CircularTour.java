package Difficulty;

class PetrolPump
{
	int petrol,distance;
	public PetrolPump(int petrol, int distance) {
		super();
		this.petrol = petrol;
		this.distance = distance;
	}
	 
}

public class CircularTour {

	static int isPossible(PetrolPump[] pp)
	{

		int start=0,end=1,currentPetrol=pp[0].petrol-pp[0].distance,n=3;
		
		//	end!=start || currentPetrol<0
		
		while(!(end==start && currentPetrol>0))
		{
			while(end!=start && currentPetrol<0)
			{
				currentPetrol-=pp[start].petrol-pp[start].distance;
				start=(start+1)%n;
				
				if(start==0)
					return -1;
			}
			currentPetrol+=pp[end].petrol-pp[end].distance;
			end=(end+1)%n;
		}

		System.out.println(start);
		return start;
	}
	
	public static void main(String[] args) { 
		
		PetrolPump pp[]=  {new PetrolPump(6, 4), 
                new PetrolPump(3, 6), 
                new PetrolPump(7, 3)};
		
		PetrolPump pp1[]= {
				new PetrolPump(4,6),new PetrolPump(6,5),new PetrolPump(7,3),new PetrolPump(4,5)
		};
		
		
		 isPossible(pp1);
	
	}

}
