This Git Repo is about how to invoke the Spring IOC Container & how to inject dependencies into it. 
To invoke or use the Spring Ioc Container we need  ApplicationContext interface.
there are following classes which implements this interface.

A POM.xml file is required to define the bean for the IOC.

Dependencies are inject by two ways: 
Property/setter injection
Constructor injection

There are many ways to provide dependencies to the the bean 
by using Property element or p-schema.
by using constructor element or c-schema.
by autowired tag/attribute.

by using @component @value @Qualifier at classes and <context Component-scan base-package > element in xml 
by using java config file  and @bean


you will see here @ autowired annotation 

inner beans are also disscused here.  

Beans scope and life cycle will be also disscused here.


