import static org.junit.Assert.*;
import org.junit.Test;

public class MapTest {

	int N=100;
	//The size of output array = the size of input array +1.
	@Test
	public void testpro1() {
		for(int i=0;i<N;i++){
			int size=(int)(Math.random()*100)+1;
			int[] input=new int[size];
			for(int j=0; j<size; j++ ){
				input[j]=(int)(Math.random()*100+1);
			}
			int[] output= Map.billify(input);
			assertEquals(input.length+1, output.length);
		}
	}
	
	//The last output value is the sum of others.
	@Test
	public void testpro2() {
		for(int i=0;i<N;i++){
			int size=(int)(Math.random()*100)+1;
			int[] input=new int[size];
			int sum=0;
			for(int j=0; j<size; j++ ){
				input[j]=(int)(Math.random()*100+1);
				sum+=input[j]*input[j];
			}
			int[] output= Map.billify(input);
			assertEquals(sum, output[output.length-1]);
		}
	}
	//The output value of each first (size-1) elements 
	//is the square of the value of input elements corresponding to their position
	@Test
	public void testpro3() {
		for(int i=0;i<N;i++){
			int size=(int)(Math.random()*100)+1;
			int[] input=new int[size];
			
			for(int j=0; j<size; j++ ){
				input[j]=(int)(Math.random()*100+1);
			}
			int[] output= Map.billify(input);
			
			for(int k=0; k<input.length; k++){
				assertEquals(input[k]*input[k], output[k]);
			}
		}
	}
}