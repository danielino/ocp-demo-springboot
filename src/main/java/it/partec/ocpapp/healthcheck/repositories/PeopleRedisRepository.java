package it.partec.ocpapp.healthcheck.repositories;

import it.partec.ocpapp.healthcheck.models.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Map;

@Repository
public class PeopleRedisRepository implements RedisRepository<People> {

    private static final String KEY = "People";

    @Autowired
    RedisTemplate redisTemplate;

    private HashOperations hashOperations;

    @PostConstruct
    public void init() {
        hashOperations = redisTemplate.opsForHash();
    }

    public void add(People people) {
        hashOperations.put(KEY, people.getId(), people.getName());
    }

    public void delete(People people) {
        hashOperations.delete(people.getId());
    }

    public People findPeople(final String id) {
        return (People) hashOperations.get(KEY, id);
    }

    public Map<Object, Object> findAllPeoples() {
        return hashOperations.entries(KEY);
    }
}
