package application

server:
port: 8761
spring:
application:
name: eserver


eureka:
client:
register-with-eureka: false
fetch-registry: false
service-url:
defaultZone: http://localhost:8761/eureka