package it.segreteria.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.segreteria.model.DummyDb;



@Component
public class DummyDbLoader implements CommandLineRunner {

	@Autowired
	ApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception {
		DummyDb db = ctx.getBean(DummyDb.class);

	}

	
	}

