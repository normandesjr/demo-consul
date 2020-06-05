# Demo Consul

## Creating key/value

After start up consul via docker-compose access http://localhost:8500 

At menu Key/Value click on "Create" and for "Key or folder" type:

config/application/data and for "Value" add your properties.

This configuration is available for all application that connect to Consul.

To create properties specific to your application, click on "Create" again and type:

config/<your-application-name>/data

This file will have your specific properties and has precedence.

## bootstrap.properties

````
spring.application.name=demo-consul

spring.cloud.config.enabled=true
spring.cloud.consul.config.enabled=true

management.health.consul.enabled=true

spring.cloud.consul.port=8500
spring.cloud.consul.config.fail-fast=true
spring.cloud.consul.config.format=properties
````

## Development environment

Disable consul during development, and in production use environment variables to enable it again. To disable it, just set to false the properties:

````
spring.cloud.config.enabled=false
spring.cloud.consul.config.enabled=false

management.health.consul.enabled=false
````
