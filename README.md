# RESTful microPoS 

### 本次作业主要是对上次作业的一次重构，在代码的逻辑方面并没有很大的改变

1、使用OpenAPI定义了product服务的接口并进行了相应实现，同时定义了Carts的相关接口给出了相关实现

2、使用echcache对从京东抓取锅过来的数据进行了缓存，并将通过id查询的product进行了缓存

3、对pos-carts模块提供了断路器机制
