## 商城后端API达达利亚商城

<img src="https://img.shields.io/badge/vue-2.6.11-brightgreen.svg" ><img src="https://img.shields.io/badge/element--ui-2.15.6-brightgreen.svg"> <img src="https://img.shields.io/github/license/mashape/apistatus.svg" alt="license"><img src="https://img.shields.io/github/release/lin-xin/vue-manage-system.svg">支持作者:<a href="https://bcn.135editor.com/files/users/541/5419088/202112/62xGK52Q_TrSp.png" ><img src="https://img.shields.io/badge/%24-donate-ff69b4.svg" ></a>



##### 项目下载后需要对配置文件更改：包括数据库连接端口、密码等（数据库版本不用改，有对应driver默认即可）

```java
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/shop?useSSL=true&useUnicode=true&characterEncoding=UTF-8
spring.datasource.username=root
spring.datasource.password=root
```

###### 数据库文件是固定的，需要运行指定的sql文件，系统才能使用，否则需要更改大量的字段！！！

数据库名称为：shop

#### 配套的前端项目同样需要更改vue.config.js里的服务端口地址：需要全部指定成localhost

