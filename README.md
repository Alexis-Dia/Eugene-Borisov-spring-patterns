# Eugene-Borisov-spring-patterns
Евгений Борисов — Spring Patterns для взрослых https://www.youtube.com/watch?v=GL1txFxswHA

 	1. Lazy-initialixation.  Смысл в том, что если юзать @Lazy над самим классом - то ничего не сработает. Типо ставить 
 	    надо над когда мы автоварим бин, т к на самом деле при поднятии контекста создается прокся, которая когда понадобится, дернет настоящий бин.
	2. Chain of the responibility(тут типо как инжектить не просто все бины подходящие под интерфес, а только которые будут
	    проставлены в кастомной аннотации)
	3. Integration Spring with alternative frameworks.
	4. Как написать собственный BeanDefinitionReader для построения контекста из сторонних либ и т д.
	5. Реализация паттернов Strategy и Command вместо юзания конструкции switch-case. Или как работает @Autowired над коллекицией Map HashMap.
	6. Как подлить бин на лету в Spring (реализация паттерна Registry)
	
For testing use query:
http://localhost:8080/corona/treat
{
    "name": "Bob",
    "age": "18",
    "method": "traditional"
}