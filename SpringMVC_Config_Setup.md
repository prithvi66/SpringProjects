# Steps to configure new Spring MVC project

Create a Maven project with webapp archetype. Archetypes are basically folder structures, so with a webapp archetype you get the WEBINF directory along.
Go to web.xml and update the schema definition. 
```
<web-app version="3.1"
	xmlns="http://xmlns.jcp.org/xml/ns/javaee"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd">
</web-app>
```
Create a servlet, the dispatcher servlet which is the entry point for the application in web.xml and specify the exact location to the configuration file. We specify the configuration file in the `<init-param>`. Here our configuration file is the **servlet-config.xml**
```
<servlet>
	<servlet-name>dispatcherServlet</servlet-name>
	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
	<init-param>
		<param-name>contextConfigLocation</param-name>
		<param-value>/WEB-INF/config/servlet-config.xml</param-value>
	</init-param>
</servlet>
```
The above tag defines our servlet, but we need to also setup a servlet mapping. Servlet mapping is what routes the traffic.
```
<servlet-mapping>
	<servlet-name>dispatcherServlet</servlet-name>
	<url-pattern>*</url-pattern>
</servlet-mapping>
```
`<servlet-name>` should be the same as the dispatcher servlet name.
`<url-pattern>` specifies the file-extensions or what path we are going to accept in the dispatcher servlet.

Next you have to configure the *servlet-config.xml*. From the above mentioned path(/WEB-INF/config/servlet-config.xml), we need to create a config folder in WEB-INF and then create a Spring bean configuration file(*servlet-config.xml*). To do this, we can go to **File->New->Spring Bean Configuration File**. By default this file only contains beans namespace. We can add context and mvc namespace from namespace tab.

We need to add the `<mvc:annotation-driven/>` tag to tell Spring that we are using annotations to configure our application. We also need to add component scanner which will specify where to start looking for annotations. Check the tag below to add component scanner.
```
<context:component-scan base-package="com.customer.profile.controller"/>
```
The base package specifies the package where all controllers are located.

By default Maven webapp archetypes do not have a *src/main/java* folder. We can add *src/main/java* from **File->New->Folder**. If it does not show up as a source directory, right click on **java->Build Path->Use as Source Folder**.