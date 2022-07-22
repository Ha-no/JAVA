***
Notion : [Notion Link](https://west-pineapple-c4d.notion.site/Map-47e3390780c843229f57319eb2157e64)
***

Map은 Collection과는 다른 저장 방식을 가진다.  

Map은 키와 값을 하나의 쌍으로 저장하는 방식을 사용하는데, 키(key)는 실질적인 값(value)을 찾기 위한 이름의 역할을 한다.  
( ex: 주민등록번호(key) - 사람이름(value) )  
  
키는 중복을 허용하지 않지만, 값은 중복을 허용한다.  

대표적인 Map클래스에는 HashMap / TreeMap / LinkedHashMap이 존재한다.  

TreeMap은 입력된 key의 소트순으로 데이터가 출력되는 특징을 가진다.  
LinkedHashMap은 입력된 순서대로 데이터가 출력되는 특징을 가진다.  

HashMap은 해시 알고리즘을 사용하여 많은 양의 데이터를 검색하는데 검색 속도가 매우 빠르다.  
Map 인터페이스를 구현하므로, 중복된 키로는 값을 저장할 수 없으며, value에 null값이 사용가능하다.  
멀티 Thread에서는 HashTable을 사용한다.  

HashMap에서 가장 많이 쓰이는 함수는  
.put() / .get() / .clear() / .remove() / .containsKey() / .containsValue() 등이 존재한다.  
