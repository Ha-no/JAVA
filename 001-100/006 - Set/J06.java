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
    	
    	// ������ �߰�(����)
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
    	
    	// ����� �������� ����
    	out.write( "HashSet Count : " + hash.size() + "\n" );
    	out.write( "TreeSet Count : " + tree.size() + "\n" );
    	out.write( "LinkedHashSet Count : " + linked.size() + "\n" );
    	
    	// Iterator(�ݺ���) ����
    	Iterator<String> hashiter = hash.iterator();
    	Iterator<String> treeiter = tree.iterator();
    	Iterator<String> linkediter = linked.iterator();
    	
    	out.write( "HashSet : " );
    	
    	// ���� �����Ͱ� �����ϸ� true
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
    	
    	// ������ ����
    	hash.remove( "one" );
    	tree.remove( "one" );
    	linked.remove( "one" );
    	
    	// ���� while������ ��� �����͸� ���������� �� �����ؾ� ��� ����
    	hashiter = hash.iterator();
    	treeiter = tree.iterator();
    	linkediter = linked.iterator();
    	
    	out.flush();
    	out.close();
    	in.close();
    }
}