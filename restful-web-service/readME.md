«Այս controller-ը կարճ ու պարզ է, բայց “ներսում” շատ բան է տեղի ունենում։ Մենք այն քայքայում ենք քայլ առ քայլ։

@GetMapping անոտացիան ապահովում է, որ /greeting ուղիով HTTP GET հարցումները նշմարվեն greeting() մեթոդին։

Կան զուգահեռ անոտացիաներ այլ HTTP գործոլների (օր. @PostMappingPOST-ի համար)։ Կա նաև@RequestMapping անոտացիա, որի հիմքից էլ դրանք առաջացել են և
 որը կարող է ծառայել որպես հոմանիշ (օր. @RequestMapping(method=GET))։
@RequestParam-ը կապում է query string-ի name պարամետրի արժեքը greeting() մեթոդի name պարամետրին։
Եթե հարցման մեջ name-ը բացակայում է, օգտագործվում է defaultValue-ը՝ World։

Մեթոդի իրականացումը ստեղծում և վերադարձնում է նոր Greeting օբյեկտ՝ id և content հատկություններով՝
հիմնվելով counter-ի հաջորդ արժեքի վրա և ձևաչափելով տրված անունը greeting template-ով։

Կանխորդ MVC controller-ի և վերևում ցուցադրված RESTful web service controller-ի միջև հիմնական տարբերությունն այն է,
թե ինչպես է ձևավորվում HTTP response body-ն։ Greeting տվյալները server-side render անելու և HTML վերադարձնելու փոխարեն,
այս REST controller-ը լրացնում և վերադարձնում է Greeting օբյեկտ։ Օբյեկտի տվյալները կգրվեն HTTP response-ում որպես JSON։

Այս կոդը օգտագործում է Spring-ի @RestController անոտացիան, որը նշում է դասը որպես controller, որտեղ յուրաքանչյուր մեթոդ
view-ի փոխարեն վերադարձնում է domain object։ Դա կարճ գրություն է՝ միաժամանակ ընդգրկելու @Controller և @ResponseBody։

Greeting օբյեկտը պետք է վերածվի JSON-ի։ Շնորհիվ Spring-ի HTTP message converter-ների, այս փոխակերպումը ձեռքով անել պետք չէ։
Քանի որ classpath-ում կա Jackson 2, Spring-ը ավտոմատ ընտրում է MappingJackson2HttpMessageConverter-ը՝ Greeting ինստանսը JSON-ի վերածելու համար»։

Հայերեն թարգմանություն

@SpringBootApplication ― հարմարավետ անոտացիա է, որը միավորում է հետևյալը․

@Configuration – նշում է դասը որպես application context-ի bean-երի սահմանման աղբյուր։

@EnableAutoConfiguration – ասում է Spring Boot-ին ավտոմատ ավելացնել bean-եր classpath-ի, մյուս bean-երի և property-ների հիման վրա։ Օրինակ՝ եթե spring-webmvc կա classpath-ում, այս անոտացիան ծրագրին նշում է որպես web հավելված և ակտիվացնում է հիմնական հնարավորությունները, ինչպիսիք են DispatcherServlet-ի կազմավորումը։

@ComponentScan – ասում է Spring-ին փնտրել component-ներ, configuration-ներ և service-ներ com/example փաթեթում, որպեսզի գտնեն controller-ները։

main() մեթոդը օգտագործում է Spring Boot-ի SpringApplication.run() մեթոդը ծրագիրը գործարկելու համար։ Տեսնում ենք, որ այստեղ ոչ մի XML չկա։ Նույնիսկ web.xml-ը բացակայում է։ Այս web հավելվածը ամբողջությամբ մաքուր Java է, և developer-ը չի զբաղվում «plumbing» կամ ինֆրաստրուկտուրայի ձեռքով կարգավորումներով։

Executable JAR կառուցում
Ծրագիրը կարելի է աշխատեցնել command line-ից՝ օգտագործելով Gradle կամ Maven։ Կարելի է նաև կառուցել մեկ executable JAR, որը պարունակում է բոլոր անհրաժեշտ dependency-ները, class-երը և resource-ները և անմիջապես աշխատեցնել։ Executable JAR կառուցելը հեշտացնում է ծառայության փոխանցումը, version-ավորումը և deploy-ը տարբեր միջավայրերում։

Եթե օգտագործվում է Gradle, ապա հավելվածը կարելի է աշխատեցնել․

./gradlew bootRun

Կամ կառուցել JAR ֆայլ՝ ./gradlew build և հետո աշխատեցնել․ java -jar ...։