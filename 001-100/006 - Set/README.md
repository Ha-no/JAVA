***
Notion : [Notion Link](https://west-pineapple-c4d.notion.site/Set-3d4ea39409e341f58fefce35e67f76ad)
***

Set은 List와는 다르게 객체(데이터)를 중복해서 저장할 수 없다.  
또한 저장된 객체(데이터)를 인덱스로 관리하지 않기 때문에 저장순서가 보장되지 않지만, 100%보장하지 않을 뿐 대부분의 경우에는 넣은 값의 hashCode값에 따라 순서가 정해져 나오게 된다.  

Set의 대표적인 클래스들은 HashSet / TreeSet / LinkedHashSet 이 있다.  

Set은 인덱스로 객체를 관리하지 않기 때문에 데이터를 검색하기 위해서는 iterator() 함수로 Iterator를 생성하고 데이터를 가져와야 한다.  

- HashSet  
Set<E> 객체명 = new HashSet<E>();  

- TreeSet  
Set<E> 객체명 = new TreeSet<E>();  
데이터를 오름차순으로 데이터를 정렬한다.  
다른 set보다 대량의 데이터 검색이 빠르다.  

- LinkedHashSet  
Set<E> 객체명 = new LinkedHashSet<E>();  
데이터를 입력된 순서대로 데이터를 관리한다.  
