package br.com.garitano.fipetable;

import br.com.garitano.fipetable.model.BrandData;
import br.com.garitano.fipetable.service.ApiHttp;
import br.com.garitano.fipetable.service.ConvertData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class FipetableApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FipetableApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var api = new ApiHttp();
		var json = api.urlData("https://parallelum.com.br/fipe/api/v1/carros/marcas");

		System.out.println(json);

		ConvertData convert = new ConvertData();
		BrandData[] brand = convert.jsonToJava(json, BrandData[].class);

		System.out.println(Arrays.toString(brand));

	}
}
