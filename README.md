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