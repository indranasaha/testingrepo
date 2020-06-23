FROM alpine:3.8

WORKDIR /app/bin

ADD target/SelTestin-0.0.1-SANPSHOT.jar SelTestin-0.0.1-SANPSHOT.jar
ADD target/SelTestin-0.0.1-SANPSHOT-tests.jar SelTestin-0.0.1-SANPSHOT-tests.jar
ADD target/libs libs
ADD target/testng.xml testng.xml

ENTRYPOINT java -cp SelTestin-0.0.1-SANPSHOT.jar:SelTestin-0.0.1-SANPSHOT-tests.jar:libs/* org.testng.TestNG testng.xml