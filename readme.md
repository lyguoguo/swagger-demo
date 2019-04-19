Swagger 是一个规范和完整的框架，用于生成、描述、调用和可视化 RESTful 风格的 Web 服务。总体目标是使客户端和文件系统作为服务器以同样的速度来更新。文件的方法，参数和模型紧密集成到服务器端的代码，允许API来始终保持同步。

 作用：

    1. 接口的文档在线自动生成。

    2. 功能测试。

 Swagger是一组开源项目，其中主要要项目如下：

1.   Swagger-tools:提供各种与Swagger进行集成和交互的工具。例如模式检验、Swagger 1.2文档转换成Swagger 2.0文档等功能。

2.   Swagger-core: 用于Java/Scala的的Swagger实现。与JAX-RS(Jersey、Resteasy、CXF...)、Servlets和Play框架进行集成。

3.   Swagger-js: 用于JavaScript的Swagger实现。

4.   Swagger-node-express: Swagger模块，用于node.js的Express web应用框架。

5.   Swagger-ui：一个无依赖的HTML、JS和CSS集合，可以为Swagger兼容API动态生成优雅文档。

6.   Swagger-codegen：一个模板驱动引擎，通过分析用户Swagger资源声明以各种语言生成客户端代码。


********************************************
在Application.java同级创建Swagger2的配置类Swagger2




*******************************************
Swagger使用的注解及其说明：

@Api：用在类上，说明该类的作用。

@ApiOperation：注解来给API增加方法说明。

@ApiImplicitParams : 用在方法上包含一组参数说明。

@ApiImplicitParam：用来注解来给方法入参增加说明。

@ApiResponses：用于表示一组响应

@ApiResponse：用在@ApiResponses中，一般用于表达一个错误的响应信息

    l   code：数字，例如400

    l   message：信息，例如"请求参数没填好"

    l   response：抛出异常的类   

@ApiModel：描述一个Model的信息（一般用在请求参数无法使用@ApiImplicitParam注解进行描述的时候）

    l   @ApiModelProperty：描述一个model的属性

 

注意：@ApiImplicitParam的参数说明：

paramType：指定参数放在哪个地方

header：请求参数放置于Request Header，使用@RequestHeader获取

query：请求参数放置于请求地址，使用@RequestParam获取

path：（用于restful接口）-->请求参数的获取：@PathVariable

body：（不常用）

form（不常用）

name：参数名

 

dataType：参数类型

 

required：参数是否必须传

true | false

value：说明参数的意思

 

defaultValue：参数的默认值

 
 
 
 ********************************************************
页面请求url: http://localhost:8089/swagger-ui.html