
### WebMvcConfigurer Formatter

https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/servlet/config/annotation/WebMvcConfigurer.html#addFormatters-org.springframework.format.FormatterRegistry-

Formatter
- Printer: 해당 객체를 (Locale 정보를 참고하여) 문자열로 어떻게 출력할 것인가
- Parser: 어떤 문자열을 (Locale 정보를 참고하여) 객체로 어떻게 변환할 것인가

https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/format/Formatter.html

포매터 추가하는 방법 1
- WebMvcConfigurer의 addFormatters(FormatterRegistry) 메소드 정의

포매터 추가하는 방법 2 (스프링 부트 사용시에만 가능 함)
- 해당 포매터를 빈으로 등록 

WebMvcConfigurer 설정으로 Formatter를 등록하고 @WebMvcTest로 테스트시에 잘 됨.
but, 빈(@Componenet)로 Formatter를 등록하면 @WebMvcTest 테스트가 실패함.
why. @WebMvcTest는 웹 관련 빈만 띄워서 테스트하는데, @Component로 등록하게 되면 웹관련 빈이 아니라고 판단하여,
빈이 뜨지 않아 실패하게 되는 것.
이럴 경우에는 @SpringBootTest로 테스트한다. 
이 때, @WebMvcTest 일때 자동 주입되던 MockMvc는 @AutoConfigurerMockMvc도 추가하여 주입받는다. 
