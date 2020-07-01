package it.partec.ocpapp.healthcheck.repositories;


public interface RedisRepository<T> {


    void add(T t);

    void delete(T t);
}
