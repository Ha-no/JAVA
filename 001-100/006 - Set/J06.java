package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class J06 {
	
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	
    	Set<String> hash = new HashSet<String>();
    	Set<String> tree = new TreeSet<String>();
    	Set<String> linked = new LinkedHashSet<String>();
    	
    	// 데이터 추가(저장)
    	hash.add( "two" );
    	tree.add( "two" );
    	linked.add( "two" );
    	//
    	hash.add( "one" );
    	tree.add( "one" );
    	linked.add( "one" );
    	//
    	hash.add( "three" );
    	tree.add( "three" );
    	linked.add( "three" );
    	//
    	hash.add( "one" );
    	tree.add( "one" );
    	linked.add( "one" );
    	
    	// 저장된 데이터의 개수
    	out.write( "HashSet Count : " + hash.size() + "\n" );
    	out.write( "TreeSet Count : " + tree.size() + "\n" );
    	out.write( "LinkedHashSet Count : " + linked.size() + "\n" );
    	
    	// Iterator(반복자) 생성
    	Iterator<String> hashiter = hash.iterator();
    	Iterator<String> treeiter = tree.iterator();
    	Iterator<String> linkediter = linked.iterator();
    	
    	out.write( "HashSet : " );
    	
    	// 다음 데이터가 존재하면 true
    	while( hashiter.hasNext() ) {
    		out.write( hashiter.next() + " " );
    	}
    	
    	out.write( "\nTreeSet : " );
    	
    	while( treeiter.hasNext() ) {
    		out.write( treeiter.next() + " " );
    	}
    	
    	out.write( "\nLinkedHashSet : " );
    	
    	while( linkediter.hasNext() ) {
    		out.write( linkediter.next() + " " );
    	}
    	
    	// 데이터 삭제
    	hash.remove( "one" );
    	tree.remove( "one" );
    	linked.remove( "one" );
    	
    	// 위의 while문에서 모든 데이터를 가져왔으니 재 생성해야 사용 가능
    	hashiter = hash.iterator();
    	treeiter = tree.iterator();
    	linkediter = linked.iterator();
    	
    	out.flush();
    	out.close();
    	in.close();
    }
}