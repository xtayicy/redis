package harry.redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;

/**
 * 
 * @author harry
 *
 */
public class JedisTest {
	@Test
	public void testConnection() {
		/**
		 * If you meet java.net.Connection,please check your firewall or redis.conf
		 */
		try (Jedis jedis = new Jedis("192.168.0.128", 6379);) {
			// jedis.set("name", "jim");
			String name = jedis.get("name");
			System.out.println(name);
		}
	}
}
