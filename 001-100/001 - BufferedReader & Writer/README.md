입출력 속도를 향상시키기 위해서  
  
Scanenr가 아닌 BufferedReader() 를 통해 input  
  
System.out.println() 가 아닌 BufferedWriter() 를 통해 output  
  
  
BufferedReader()를 사용하기 위해서는  
BufferedReader( new InputStream( System.in ) );  

BufferedWriter()를 사용하기 위해서는  
BufferedWriter( new OutputStream( System.out ) );  
  
  
BufferedWriter()를 사용해서 int형을 출력하기 위해서는  
out.write( String.valueOf( 숫자형 변수명 ) );  
out.write( stringbuffer.toString() );  
out.write( 숫자 + "" );  
