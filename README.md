# TwitterStreaming

A Simple Spark Streaming Application which streams data from Twitter. 

## Set-up

Install Sbt  
`brew install sbt`

## Tasks
1. Clean  
`sbt clean`  
2. Compile  
`sbt compile`
3. Package  
`sbt package`

## Config
Before running the application, the authentication configuration for Twitter should be present in `resources/Twitter.conf` file. Go to [Twitter Apps](https://apps.twitter.com/) and register the application.

## Run
Run the `main` method of `TwitterPoller` from the IDE or spark-submit the jar which is produced after package step.
