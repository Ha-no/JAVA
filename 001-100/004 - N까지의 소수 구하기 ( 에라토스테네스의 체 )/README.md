***
Notion : [Notion Link](https://west-pineapple-c4d.notion.site/N-6a5a47dd000c4beebe81a8d2972bfe6a)
***

2 ~ N 까지의 수 중에서 모든 소수 찾기  

<br/>
 
 에라토스테네스의 체  
 
우선, N개의 공간이 있는 배열을 생성하여 각각 자리수의 Index가 ( ex. a[1] - 1, a[2] - 2 )  
소수이면 False or 1, 소수가 아니면 True or 2와 같이 구분하여 저장을 해서 사용  

<br/><br/>

각 Index가 소수인지 아닌지 구분하기 위해서는  
반복문을 통해 현재 Index의 배수의 Index를 모두 소수가 아니라고 저장 하며 진행하는데,  
이때  루트 N 까지의 수의 배수로만 계산해도 충분하다  
( ex. N = 25이면, 0부터 5까지의 수의 배수만 계산해도 소수찾기는 충분 )  
