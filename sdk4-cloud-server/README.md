# 注册中心

## 编译/运行

项目配置使用 maven 插件 [dockerfile-maven-plugin](https://github.com/spotify/dockerfile-maven) 来生成 docker 镜像。


*调试运行*

    mvn spring-boot:run

*仅编译*

    mvn clean package -Ddockerfile.skip

*运行*

    java -jar target/sdk4-cloud-server-1.0.0.jar

*编译并生成 docker 镜像*

    mvn clean package dockerfile:build -DskipTests

**注：Dockerfile文件只能放在根目录下，否则 dockerfile-maven-plugin 会报错误，why???**

*运行容器*

    docker run -p 9011:9011 -t sdk4/sdk4-cloud-server
