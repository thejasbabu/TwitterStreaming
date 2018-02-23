import org.apache.spark.streaming.twitter.TwitterUtils
import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.{SparkConf, SparkContext}
import twitter4j.auth.OAuthAuthorization
import twitter4j.conf.ConfigurationBuilder

object TwitterPoller {
  val conf = new SparkConf()
    .setAppName("TwitterPoller")
    .setMaster("local")

  val sc = new SparkContext(conf)
  val ssc = new StreamingContext(sc, Seconds(5))

  def main(args: Array[String]): Unit = {
    TwitterUtil.setupTwitter()
    val auth = Some(new OAuthAuthorization(new ConfigurationBuilder().build()))
    val filters = Seq("#Spark")
    val twitterStream = TwitterUtils.createStream(ssc, auth, filters)
    twitterStream.map(tweet => tweet.getText.toLowerCase).saveAsTextFiles("~/tweets/")
    ssc.start()
    ssc.awaitTermination()
  }
}