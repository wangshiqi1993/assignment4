
public class Map {
	
	public static int[] mapsquare(int[] foo){
		int l=foo.length;
		int[] mapfoo=new int[l];
		for(int i=0;i<l;i++){
			mapfoo[i]=foo[i]*foo[i];
		}
		return mapfoo;
	}
	
	public static int arraysum(int[] x){
		int sum=0;
		int[] square=mapsquare(x);
		for(int i=0;i<x.length;i++){
			sum+=square[i];
		}
		return sum;
	}
	
	public static int[] billify(int[] x){
		int[] result=new int[x.length+1];
		int[] square=mapsquare(x);
		for(int i=0;i<square.length;i++){
			result[i]=square[i];
		}
		result[square.length]=arraysum(x);
		return result;
	}
	
}
