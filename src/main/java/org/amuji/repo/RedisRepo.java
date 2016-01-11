package org.amuji.repo;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.util.Map;

/**
 * Roy Yang
 * 1/11/16
 */
@Component
public class RedisRepo {
    private Jedis jedis = new Jedis("127.0.0.1");

    public String create(String key, Map<String, String> data) {
        return jedis.hmset(key, data);
    }

    public Map<String, String> get(String key) {
        return jedis.hgetAll(key);
    }
}
