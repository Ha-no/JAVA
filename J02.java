
/*
	Ǯ�� ��� : https://www.notion.so/charAt-8d26f12ccf544a05b6b292115964438f
*/

package java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class J02{
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	
    	int n = Integer.parseInt( in.readLine() );
    	int array[] = new int[n];
    	int count = 0;
    	String input = null;
    	
    	for( int a=0; a<n; a++ ) {
    		
    		input = in.readLine();

    		// �о�� String�� �ѱ��ھ� ������ �Լ� charAt()�� ����ؼ� �ѱ��� �� ��
    		// 0���� input ���� ���̸�ŭ
    		for( int b=0; b<input.length(); b++ ) {
    			
    			if( input.charAt(b) == 'O' ) {
    				count++;
    				array[a] += count;
    			}else {
    				count = 0;
    			}
    		}
    		count = 0;
    	}
    	
    	for( int a=0; a<n; a++ ) {
    		out.write( array[a] + "\n" );
    	}
    	
    	out.flush();
    	out.close();
    	in.close();
    }
}