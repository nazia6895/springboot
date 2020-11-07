Steps to create a Spring Boot web application (MVC)

STEP 1:
Spring Tool Suite 4
File -> New -> Spring Starter Project
Include Spring Web while choosing "New Spring Starter Project Dependencies"

STEP 2:
Once the project is created. Add these dependencies to pom.xml
-> spring-boot-starter-tomcat
	<!-- Added for Tomcat embedded container -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-tomcat</artifactId>
        <scope>provided</scope>
    </dependency>

-> tomcat-ember-jasper
	<!-- Added for JSP -->
	<dependency>
	    <groupId>org.apache.tomcat.embed</groupId>
	    <artifactId>tomcat-embed-jasper</artifactId>
	    <scope>provided</scope>
	</dependency>
		
STEP 3:
use "extends SpringServletContainerInitializer"

@SpringBootApplication
public class Springrest1Application extends SpringServletContainerInitializer{


STEP 4:
In src -> main, create a folder "webapp" which contains the "WEB-INF" folder
WEB-INF folder will contain the JSPs
In application.properties,add the location for the JSPs prefix and suffix so that you don't have to write the whle path every time
	
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp




OTHER DEPENDENCIES
-> jstl
	<!-- Added for JSTL -->
	<dependency>
    		<groupId>javax.servlet</groupId>
    		<artifactId>jstl</artifactId>
	</dependency>
	    
-> taglibs-standard-impl
	<!-- Added for Taglib -->
	<dependency>
		<groupId>org.apache.taglibs</groupId>
		<artifactId>taglibs-standard-impl</artifactId>
		<version>1.2.5</version>
		<scope>runtime</scope>
	</dependency>