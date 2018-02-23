import com.typesafe.config.ConfigFactory
import java.io.File

object TwitterUtil {
  def setupTwitter(): Unit = {
    val path = getClass.getResource("/twitter.conf").getFile
    val config = ConfigFactory.parseFile(new File(path))
    System.setProperty("twitter4j.oauth.consumerKey", config.getString("consumerKey"))
    System.setProperty("twitter4j.oauth.consumerSecret", config.getString("consumerSecret"))
    System.setProperty("twitter4j.oauth.accessToken", config.getString("accessToken"))
    System.setProperty("twitter4j.oauth.accessTokenSecret", config.getString("accessTokenSecret"))
  }
}
