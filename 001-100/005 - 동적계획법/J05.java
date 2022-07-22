package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class J05 {
	
	// 계산했던 값( 수열 )을 저장하는 배열
	static int[] array;
	
	public static void main( String args[] ) throws Exception {
		
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
		
		StringBuilder output = new StringBuilder();

		int n = Integer.parseInt( in.readLine() );
		
		array = new int[n+1];

		// 배열을 초기화하면 0이 들어가는데 fibo(0) = 0 이 되어야 하므로, -1로 초기화
		Arrays.fill( array, -1 );
		
		array[0] = 0;
		array[1] = 1;
		
		fibo( n );
		
		// 수열 출력
		for( int a: array ) {
			
			output.append( a ).append( " " );
		}
		
		out.write( output.toString() );
		
		out.flush();
		out.close();
		in.close();
	}
	
	static int fibo( int n ) {
		
		// n번째 수열을 계산한적이 없다면 계산
		if( array[n] == -1 ) { array[n] = fibo( n-1 ) + fibo( n - 2 ); }
		
		// n번째 수열을 계산한적이 있다면 바로 return
		return array[n];
	}
}