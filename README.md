gmapper
=======

Mapping and Converting a Pojo to Another Pojo Using Groovy

GMapper is a simple groovy library that can translate/convert POJOs to other POJOs using groovy closures for custom logic during the conversion. It depends on Groovy and Spring. GMapper achieves this by promoting DRY methodology and self documenting code. The resulting code is easy to maintain and promotes reuse.

Java programmers run into many cases that needs them to convert one POJO to another POJO. These cases include but are not limited to.

1) You need to represent database mapped bean to another bean for the sake of easier usability from frontend technologies such as JSP, JSF.

2) You are writing custom migration code that moves relational data to another representation such as nosql that requires changes in domain schemas.

3) You are using JAX-RS or other custom code to represent your bean to another representation that drives your service oriented architecture.

4) You are using polyglot persistence and you need to represent two beans from separate datasources into a single POJO using different conversion process

There are library such as Apache Commons BeanUtils that maybe used to copy properties from one bean to another bean, but it does not account for cases where you need to inject custom logic during copying.

What you tend to write are tons of lines of getter and setter with some custom logic in your conversion services that are hard to reuse and maintain.

See Wiki
