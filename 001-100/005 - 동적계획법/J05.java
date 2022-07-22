package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class J05 {
	
	// ����ߴ� ��( ���� )�� �����ϴ� �迭
	static int[] array;
	
	public static void main( String args[] ) throws Exception {
		
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
		
		StringBuilder output = new StringBuilder();

		int n = Integer.parseInt( in.readLine() );
		
		array = new int[n+1];

		// �迭�� �ʱ�ȭ�ϸ� 0�� ���µ� fibo(0) = 0 �� �Ǿ�� �ϹǷ�, -1�� �ʱ�ȭ
		Arrays.fill( array, -1 );
		
		array[0] = 0;
		array[1] = 1;
		
		fibo( n );
		
		// ���� ���
		for( int a: array ) {
			
			output.append( a ).append( " " );
		}
		
		out.write( output.toString() );
		
		out.flush();
		out.close();
		in.close();
	}
	
	static int fibo( int n ) {
		
		// n��° ������ ��������� ���ٸ� ���
		if( array[n] == -1 ) { array[n] = fibo( n-1 ) + fibo( n - 2 ); }
		
		// n��° ������ ��������� �ִٸ� �ٷ� return
		return array[n];
	}
}