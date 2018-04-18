package womensCodeSprint;

import java.util.HashMap;
//import java.util.HashSet;
import java.util.Scanner;

public class Solution5 {
	
	 public static void main(String args[] ) throws Exception {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		 	Scanner sc = new Scanner(System.in);
		 	int n = Integer.parseInt(sc.nextLine().trim());
		 	
		 	
//		 	Island[] republicIsles = new Island[n];
		 	HashMap<Integer, Island> republicIsles = new HashMap<Integer, Island>(n);
		 	
		 	for(int i = 0; i < n ; i++) {	 		
	            String[] scan = sc.nextLine().split(" ");
	            int p = Integer.parseInt(scan[0].trim());
	            int h = Integer.parseInt(scan[1].trim());	            
	            republicIsles.put(i,new Island(p, h));
		 	}
		 	
		 	int q = Integer.parseInt(sc.nextLine().trim());
	
		 	
		 	Situation[] situations= new Situation[q];
		 	
		 	for(int i = 0; i < q ; i++) {	 		
	            String[] scan = sc.nextLine().split(" ");
	            char c = scan[0].trim().charAt(0);
	            int l = Integer.parseInt(scan[1].trim());	            
	            situations[i] = new Situation(c, l);
		 	}
		 	sc.close();
		 	
		 	
		 	for (int i = 0; i < q; i++) {
		 		System.out.println("--------------------------------------");
		 		System.out.println("i = "+ i);
		 		
		 		//wyspa tonie
		 		if (situations[i].getSit() == 'd') {
		 			
		 			for(Integer key: republicIsles.keySet()) {
		 				if(republicIsles.containsKey(key)) {
		 					if(republicIsles.get(key).getPosition() == situations[i].getLoc()) {
		 						republicIsles.remove(key);
		 						System.out.println("usuniêto wyspê id" + key);
		 						break;
		 					}
		 				}
		 			}
		 		}
		 			
 		
		 		
		 		if (situations[i].getSit() == 'e') {
//		 			Island tmpIsland = republicIsles.get(situations[i].getLoc()-1);
		 			int index = situations[i].getLoc()-1;
		 			// tej wyspy juz nie ma bo juz wczesniej zosta³a utopieona/usuniêta z mapy wiec nie mozna jej ewakuowac
		 			 if(!republicIsles.containsKey(index)){
			 				System.out.println("DROWNED");
			 			}
		 			
		 			// mamy wyspê któr¹ trzeba ewakuowaæ i nie jest ona utopiona
		 			if(republicIsles.containsKey(index)) {
	 				
		 				// maksymalna odleg³oœæ jaka mo¿e byæ uzyskana
		 				int maxDistance =(int) Math.pow(10, 9);
		 				// tymczasowa odleg³oœæ
		 				int actualDistance;
		 				// pierwsza wy¿sza wyspa po prawej( tymczasowo dajemy pozycjê wymagaj¹cej ewakuacji wyspy)
		 				int firstHigherIslandPosition = republicIsles.get(index).getPosition();
		 				
		 				for(Integer key: republicIsles.keySet()) {
		 					// rozpatrywana wyspa nie mo¿e byæ nullem ani nasz¹ wysp¹
		 					
		 					// jeœli pozycja naszej jest mniejsza i wysokosc naszej jest mniejsza to	
		 					if((republicIsles.get(index).getPosition() < republicIsles.get(key).getPosition()) 
		 							&& (republicIsles.get(index).getHight() < republicIsles.get(key).getHight())) {
		 						//liczymy odleg³oœæ
		 						
		 						actualDistance = republicIsles.get(key).getPosition() - republicIsles.get(index).getPosition();	
		 						
		 						if(actualDistance < maxDistance) {
		 						maxDistance = actualDistance;	
		 						// podstawiamy now¹ wartoœæ zamiast starej
		 						firstHigherIslandPosition = republicIsles.get(key).getPosition();

		 						}
		 						
		 				}
		 					
		 				}
		 				
		 				if(firstHigherIslandPosition != republicIsles.get(index).getPosition()) {
		 					System.out.println(firstHigherIslandPosition);

		 				} else {
		 					System.out.println("IMPOSSIBLE");

		 					
		 				}		
		 			}
		 		}	
		 	}
		 			 	
	    }
	
}


class Island {

	 int position;
	 int hight;
	 
	 Island( int p, int h){
		 this.position = p;
		 this.hight = h;
	 }
	 

	public int getPosition() {
		return position;
	}


	public int getHight() {
		return hight;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hight;
		result = prime * result + position;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Island other = (Island) obj;
		if (hight != other.hight)
			return false;
		if (position != other.position)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Island [position=" + position + ", hight=" + hight + "]";
	}
	
}

 class Situation{
	char sit;
	int loc;
	
	Situation(char sit, int loc){
		this.sit = sit;
		this.loc = loc;
	}

	public char getSit() {
		return sit;
	}

	public void setSit(char sit) {
		this.sit = sit;
	}

	public int getLoc() {
		return loc;
	}

	public void setLoc(int loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Situation [sit=" + sit + ", loc=" + loc + "]";
	}
	
}