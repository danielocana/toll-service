docker run --name mysql -e MYSQL_ROOT_PASSWORD=daniel -e MYSQL_DATABASE=scdf -p 3306:3306 -d mysql:latest

docker run --name redis -p 6379:6379 -d redis


java -jar spring-cloud-dataflow-server-local-1.2.3.RELEASE.jar --spring.datasource.url=jdbc:mysql://192.168.99.100:3306/scdf --spring.datasource.username=root --spring.datasource.password=daniel --spring.datasource.driver-class-name=org.mariadb.jdbc.Driver --spring.rabbitmq.host=192.168.99.100 --spring.rabbitmq.port=5672 --spring.rabbitmq.username=guest --spring.rabbitmq.password=guest
http://localhost:9393/dashboard/index.html#/apps/apps