
package com.aysidisi.plainspringwebapp.config;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@Configuration
public class SpringMongoConfig extends AbstractMongoConfiguration
{

	@Override
	@Bean
	public MongoClient mongo() throws Exception
	{
		List<ServerAddress> serverAdresses = new LinkedList<ServerAddress>();
		ServerAddress address = new ServerAddress("127.0.0.1", 27017);
		serverAdresses.add(address);
		List<MongoCredential> credentials = new LinkedList<MongoCredential>();
		MongoCredential credential = MongoCredential.createMongoCRCredential("dayum", "dayumdb",
				"1234".toCharArray());
		credentials.add(credential);
		MongoClient mongoClient = new MongoClient(address, credentials);
		return mongoClient;
	}

	@Override
	@Bean
	public MongoTemplate mongoTemplate() throws Exception
	{
		return new MongoTemplate(this.mongo(), this.getDatabaseName());
	}
	
	@Override
	protected String getDatabaseName()
	{
		return "dayumdb";
	}
}