# **Spring**
A lightweight dependency injection framework that promotes loose
coupling in Java applications.

### Spring Modules
- Core, beans, Context, spEL
- AOP, Aspect, Instrumentation, Messaging
- Data Access / Integration ( JDBC, ORM, JMS, OXM )
- Web ( Web, Portlet, Servlet, WebSocket )

### Spring IOC Container
A component of Spring framework that maintains the whole lifecyle of the objects.
- **Role**: Creates, manages, and injects beans.
- **Needs**: Defined beans and configuration.

### Application Context
It is an interface that represents our IOC container. It has all
the features of the old bean factory. It has mainly 3 classes that
implements the Application Context:
- ClassPathXMLApplicationContext
- AnnotationConfigApplicationContext
- FileSystemXMLApplicationContext

### Ways of Injecting Dependency
- Setter injection
- Constructor injection

### Creating a simple Spring Maven project (Eclipse)
- Create a new Maven project (`maven-archetype-quickstart`).
- Add Spring Context dependency.
- (Optional) Create a dummy class with getter, setters and constructors.
- Set up Spring IOC config:
  - Create a new XML config file `config.xml`.
  - Sample XML file
    ```XML
      <?xml version="1.0" encoding="UTF-8"?>
      <beans  xmlns="http://www.springframework.org/schema/beans"
              xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
              xmlns:context="http://www.springframework.org/schema/context"
              xmlns:p="http://www.springframework.org/schema/p"
              xsi:schemaLocation="http://www.springframework.org/schema/beans
              http://www.springframework.org/schema/beans/spring-beans.xsd
              http://www.springframework.org/schema/context
              http://www.springframework.org/schema/context/spring-context.xsd">

      <!-- Sample bean with setter injection -->
      <bean class="com.jishan.practice.springcore.Student" name="student1">
        <property name="id">
          <value>1920</value>
        </property>
      </bean>
      
      </beans>
      ```
- Instantiate container and inject beans
  ```java
  package com.jishan.practice.springcore;

  import org.springframework.context.ApplicationContext;
  import org.springframework.context.support.ClassPathXmlApplicationContext;
  
  public class App 
  {
      public static void main( String[] args )
      {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("config.xml");
    	
    	Student student1 = (Student) appContext.getBean("student1");
    	System.out.println(student1);
    }
  }

  ```

### Different ways of property injection:
- `config.xml`
  ```XML
  <?xml version="1.0" encoding="UTF-8"?>
  <beans  xmlns="http://www.springframework.org/schema/beans"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xmlns:context="http://www.springframework.org/schema/context"
          xmlns:p="http://www.springframework.org/schema/p"
          xsi:schemaLocation="http://www.springframework.org/schema/beans
          http://www.springframework.org/schema/beans/spring-beans.xsd
          http://www.springframework.org/schema/context
          http://www.springframework.org/schema/context/spring-context.xsd">
		
		<!-- Value as p schema -->
		<bean class="com.jishan.practice.springcore.Student" name="student1"
				p:id="122" p:name="Ram Singh" p:address="Delhi" />
				
		<!-- Value as an attribute -->
		<bean class="com.jishan.practice.springcore.Student" name="student2">
			<property name="id" value="169"/>
			<property name="name" value="Jishan Ahamed"/>
			<property name="address" value="Rabriyawas"/>
		</bean>
		
		<!-- Value as an element -->
		<bean class="com.jishan.practice.springcore.Student" name="student3">
			<property name="id">
				<value>290</value>
			</property>
			<property name="name">
				<value>Rohit Sharma</value>
			</property>
			<property name="address">
				<value>Lucknow</value>
			</property>
		</bean>
  </beans>
  ```
