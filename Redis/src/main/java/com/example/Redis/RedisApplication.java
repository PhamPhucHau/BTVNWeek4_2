package com.example.Redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RedisApplication {
	@Autowired
	private RedisTemplate<Object,Object> redisTemplate;

	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner()
	{
		return args -> {
			listExample();

		};
	}
	public void listExample()
	{
		List<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("Redis");
		redisTemplate.opsForList().rightPushAll("likelion_list",list);
		System.out.println("Size of key likelion"+redisTemplate.opsForList().size("likelion_list"));
		System.out.println("Value of key likelion:"+redisTemplate.opsForList().leftPop ("likelion_list"));
	}
}
