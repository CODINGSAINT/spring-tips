### Tip 3 / 100
#### Override Configurations o application.yml/properties before start
- One of the easiest way to override application. properties or yaml is to provide argument to run jar
- the format will be
  ```--<propertyname>=<propertyvalue>```
    - ```server.port=8082```
    - ```anyproperty.vaue=TheRealValueOfTheProperty```
- You can override application properties /yml properties in many ways (around 11)
- They override each other based on priority set by spring
- This is called externalization of configuration
- To know more on this topic
  https://docs.spring.io/spring-boot/docs/1.2.3.RELEASE/reference/html/boot-features-external-config.html