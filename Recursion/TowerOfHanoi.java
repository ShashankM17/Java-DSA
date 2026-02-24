public class TowerOfHanoi{
	public static void TranferRings(int n, String source, String helper, String destination){
		if(n > 1){
			System.out.println("tranfering "+n + " "+ "from "+source + " to" +" "+helper);
			TranferRings(n-1, source,helper, destination);
			System.out.println("tranfering "+n + " "+ "from "+helper + " to" +" "+destination);
			return;
		}
		else if (n == 1){
			System.out.println("tranfering "+n + " "+ "from "+source + " to"+ " "+destination);
			return;
		}
	}
	public static void main(String args[]){
		int n = 3;
		TranferRings(n, "source", "helper", "destination");
	}
}