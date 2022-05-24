# Overview
Sample project with Spark,Scala and Cassandra DB.

#Set-up

1. Create topic in Kafka using

`kafka-topics --create  --broker-list localhost:9092 --replication-factor 1 --partitions 1 --topic messages`

2.Send json message to topic in kafka using

`kafka-console-producer --broker-list localhost:9092 --topic messages`

4. Create schema and table in cassandra

`CREATE KEYSPACE kafkamessage
     WITH REPLICATION = {
         'class' : 'SimpleStrategy',
         'replication_factor' : 1
     };`

`CREATE TABLE pubsubmessage (id text PRIMARY KEY, message text);
`

#Test

1. Send sample message in Kafka topic

`{"message":"ffff","id":"1"}`


2. Data should be saved in cassandra.

id | message

----+---------

1 |    ffff
