
/*
	풀이 노션 : https://www.notion.so/BufferedWriter-int-325eb44e02e14d7ea92af16ab55a8522
*/

package java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class J01 {
    public static void main(String[] args) throws Exception{

    	BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	
    	int input1 = Integer.parseInt( br.readLine() );
    	
    	for( int i=1; i<=input1; i++ ) {
    		
    		// BufferedWriter 로 int형을 출력하기 위해서는
    		// 1. String.valueOf( i );
    		// 2. StringBuffer sb1; 를 sb1.toString();
    		// 3. int형 + 문자형 = 문자형 을 이용
    		bw.write( i + "\n" );
    	}

		bw.flush();
    	bw.close();
    	br.close();
    }
}
