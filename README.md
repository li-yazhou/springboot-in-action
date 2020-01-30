
@SpringBootApplication
    标注在类上，表示这个类是SpringBoot的启动类，通过该类的Main方法启动SpringBoot应用

@SpringBootConfiguration
    标注在类上，表示这个类是SpringBoot的配置类
    层级关系：SpringBootConfiguration——>@Configuration——>@Component

@Configuration
    标注在类上，表示这个类是Spring的配置类，相当于XML配置文件

@EnableAutoConfiguration
    开启自动配置功能，简化了以前繁琐的配置
    SpringBoot在启动时会在/META-INF/spring.factories中EnableAutoConfiguration指定的值，将这些值作为自动配置类添加到容器中，这些自动配置类会帮我们完成很多配置工作。

@ComponentScan
    标注在类上，指定要扫描的包及其子包



SpringBoot的默认全局配置文件有两种：
    application.properties
    application.yml
文件名固定，存放在classpath:/或classpath:/config/目录下
优先级：properties > yml


2.YAML用法

2.1 简介
YAML不是一种标记语言，YAML是专门用来写配置文件的，它以数据为中心，简介强大，比xml和properties更适合做配置文件
YAML文件以.yml或.yaml为后置名

2.2 application.yml
```
server:
  port: 8081	#写法：key: value 冒号后面必须有空格
  servlet:
    context-path: /springboot03/
```

2.3 语法规则
```
大小写敏感
使用缩进表示层级关系
缩进时不允许使用Tab键
缩进的空格数目不重要，但是要与对应的层级的左侧对齐
#表示注释
```

2.4 基本用法
YAML支持的数据结构有三种：

字面量：单个的，不可再分的值（字符串、数字、boolean值）
对象：键值对集合
数组：一组按次序排列的值

三种数据结构的用法：
​	1.字面量：普通的值，如数字、字符串、布尔值
number: 12.5
str: hello
name: 'tom cruise' #如字符串包含空格及特殊字符需要使用 引号 引起来
name: 'tom \n cruise' #不会对特殊字符进行转义 结果为：tom 换行 cruise
name: "tom \n cruise" #对特殊字符进行转义，会作为普通字符输出, 结果为 tom \n cruise

对象，也成为映射Map，包含属性和值
# 写法1：换行写
user:
  name: tom
  age: 20
  sex: male
  
# 写法2：行内写法
user: {name: tom, age: 20, sex: male}
复制代码
数组，如List、Set等

# 写法1: 一组短横线开头的行
names: 
  - tom
  - jack
  - alice
  
# 写法2: 行内写法
name: {tom,jack,alice}

3. 为属性注入值
通过加载配置文件，为类中的属性注入值
3.1 编写application.yml
user:
  username: admin
  age: 21
  status: true
  birthday: 2019/2/14
  address:
    province: 黑龙江省
    city: 哈尔滨市
  lists:
    - list1
    - list2
    - list3
  maps: {k1: v1,k2: v2}
