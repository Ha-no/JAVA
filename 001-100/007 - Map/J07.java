package Java;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class J07 {
	
    public static void main(String[] args) throws Exception{

    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	
    	HashMap<Integer,String> map = new HashMap<Integer,String>();
    	
    	map.put( 1, "test1" );
    	map.put( 2, "test2" );
    	map.put( 3, "test3" );

    	out.write( "\n*** Original ***\n" );
    	out.write( "1 : " + map.get( 1 ) + "\n" );
    	out.write( "2 : " + map.get( 2 ) + "\n" );
    	// null값이 나옴
    	out.write( "4 : " + map.get( 4 ) + "\n" );
    	out.write( "size : " + map.size() + "\n" );

    	out.write( "\n*** ContainsKey ***\n" );
    	out.write( "2 : " + map.containsKey( 2 ) + "\n" );
    	out.write( "4 : " + map.containsKey( 4 ) + "\n" );
    	
    	out.write( "\n*** before remove ***\n" );
    	out.write( "2 : " + map.get( 2 ) + "\n" );
    	map.remove( 2 );
    	out.write( "\n*** after remove ***\n" );
    	out.write( "2 : " + map.get( 2 ) + "\n" );

    	map.clear();
    	
    	out.write( "\n*** After Clear ***\n" );
    	out.write( "1 : " + map.get( 1 ) + "\n" );
    	out.write( "2 : " + map.get( 2 ) + "\n" );
    	out.write( "4 : " + map.get( 4 ) + "\n" );
    	out.write( "size : " + map.size() + "\n" );

    	map.put( 1, "test1" );
    	map.put( 2, "test2" );
    	map.put( 3, "test3" );
    	
    	out.write( "\n*** Use Set ***\n" );
    	
    	Set<Integer> set = map.keySet();
    	
    	for( Integer key : set ) {
    		
    		out.write( key + " : " + map.get( key ) + "\n" );
    	}
    	
    	out.write( "\n*** Value로 key찾기 ***\n" );
    	
    	Set<Entry<Integer,String>> entryset = map.entrySet();

		int check = 0;
		
    	for( Entry<Integer,String> entry : entryset ) {
    		
    		String txt = "test" + ++check;
    		
    		if( entry.getValue().equals( txt ) ) { out.write( txt + " key : " + entry.getKey() + "\n" ); }
    		else { out.write( txt + " not find\n" ); }
    		
    	}
    	
    	out.flush();
    	out.close();
    }
}


