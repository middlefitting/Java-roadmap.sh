## 개요

Variable(변수)란 자바 프로그래밍에서 데이터 값을 저장하는 컨테이너를 말합니다. 
모든 변수는 데이터 타입을 할당 받당받습니다.
자바에서 변수는 생명주기 관점에서는 로컬, 인스턴스, 정적 변수가 존재합니다. 데이터 유형 관점에서는 값 타입과, 참조 타입이 존재합니다.

## 변수의 선언
변수의 선언은 타입을 제공하고, 유니크한 이름을 제공하는 것으로 선언됩니다.

~~~java
int a;
int b;
int c;

double e, f, g;

String s;
~~~

이렇게 변수들을 선언할 수 있습니다. float 선언과 같이 여러 변수를 한번에 선언하는 것도 가능합니다.

## 변수 초기화

~~~java
int a;

a = 1;

int b = 1;
~~~

변수 초기화는 다음과 같이 수행할 수 있습니다. 선언과 동시에 초기화도 가능합니다.

## 생명주기 관점에서 변수의 종류

### Local Variables
로컬 변수는 메소드의 body에 선언되는 변수를 말합니다.

~~~java
class Main {
	public void test() {
		int a = 1;
    }
}
~~~


### Instance Variables
인스턴스 변수는 클래스에서 static 키워드 없이 선언되는 변수들을 말합니다. 객체별로 가지고 있는 상태로 생각하실 수 있습니다.


### Static Variables
정적 변수는 클래스에서 static 키워드로 선언되는 변수들을 말합니다. 해당 변수들의 주인은 클래스이며, 객체보다 먼저 초기화가 이루어지게 됩니다.

## Data types in Java
자바의 데이터 타입은 크게 2가지로 구분됩니다.
- 원시(Primitive) 데이터 타입
- 참조(Non-primitive data types) 데이터 타입

### 원시 데이터 타입
- boolean
- char
- byte
- short
- int
- long
- float
- double

### 참조 데이터 타입
참조 데이터 타입은 원시 데이터 타입을 제외한 모든 친구들입니다. 원시 데이터 타입은 데이터 그 자체를 포함하는 것이고, 참조 데이터 타입은 데이터가 존재하는 주소를 보관하는 것입니다.

대표적으로 String, Array와 같은 친구들이 참조 데이터 타입입니다.

### Enum 데이터 타입
Enum 데이터 타입은 크게 보면 참조 데이터 타입에 속하지만 좀 특별하게, 사전 정의된 상수들을 간결하고 안정성 높게 사용할 수 있는 데이터 타입입니다.

범주형 데이터를 제공하고자 할 떄 유용하게 사용할 수 있습니다.

이것이 얼마나 편리하고 안정성이 있는지는 아래의 코드를 보면 알 수 있습니다. Enum을 사용했을때와 사용하지 않았을 때에 범주형 값을 제공하는 예시입니다.

- [범주형 값을 제공하는 Enum](HelloEnum.java)

### Record 데이터 타입
프로그래밍을 하다 보면 불변 데이터 타입을 전달해야 하는 경우가 많이 있습니다. 자바 14부터는 이를 보일러플레이트 코드를 제거하기 위해 Record가 등장하였습니다.

레코드는 아래와 같은 내용을 자동화하기 때문에 필드에 추가에 따른 equals 재정의와 같은 부분을 자동화할 수 있습니다.

- private, final field for each piece of data
- getter for each field
- public constructor with a corresponding argument for each field
- equals method that returns true for objects of the same class when all fields match
- hashCode method that returns the same value when all fields match
- toString method that includes the name of the class and the name of each field and its corresponding valu

- [불변 클래스의 자동화, Record](HelloRecord.java)

### Record VS Lombok
두 솔루션 모두 자동화 측면에서 강점을 기지는데요, 언제 어떤 기술을 사용해야 하는지는 의도에 따라 정해집니다.

Record는 불변 데이터 전달 매개체가 필요할 경우 사용합니다. 하지만 필드를 캡슐화하고, 그것을 제어할 메서드를 노출하고 싶을 경우 Lombok을 사용하는 것이 맞습니다.

또한, 필드가 지나치게 많아질경우, 생성자만 제공하는 Record는 가독성이 떨어지기 때문에, 빌더 패턴을 제공할 수 있는 Lombok을 선택하는 것이 적절합니다.

마지막으로 Record는 상속을 지원하지 않습니다. 상속이 필요할 경우에는 Lombok을 사용하는 것이 적절합니다.
