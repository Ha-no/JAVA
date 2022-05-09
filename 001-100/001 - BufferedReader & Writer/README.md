
Notion : https://www.notion.so/BufferedWriter-int-325eb44e02e14d7ea92af16ab55a8522

입출력 속도를 향상시키기 위해서  
  
Scanenr가 아닌 BufferedReader() 를 통해 input  
  
System.out.println() 가 아닌 BufferedWriter() 를 통해 output  

<br/>

BufferedReader()를 사용하기 위해서는  
BufferedReader( new InputStream( System.in ) );  

BufferedWriter()를 사용하기 위해서는  
BufferedWriter( new OutputStream( System.out ) );  

<br/>

BufferedWriter()를 사용해서 int형을 출력하기 위해서는  
out.write( String.valueOf( 숫자형 변수명 ) );  
out.write( stringbuffer.toString() );  
out.write( 숫자 + "" );  
