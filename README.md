# Hazelcast Bug

This example is to demonstrate an [Hazelcast bug](https://github.com/hazelcast/hazelcast/issues/2217)!

Usage:

```sh
mvn clean compile assembly:single
HZ_IP=8.8.8.8 java -jar target/ec2-1.0-SNAPSHOT-jar-with-dependencies.jar
```

Hazelcast will stop in the "STARTED" log and will never exit.

If it happens inside an app server (like jBoss), this is very likely to rollback
the deploy due to timeout.

