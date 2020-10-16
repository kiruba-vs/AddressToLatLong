package Address.to.Geo.Code.Converter;

import Address.to.Geo.Code.Converter.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressToLatLongApplication implements CommandLineRunner {

	@Autowired
	AddressToLatLongService addressToLatLongService;

	@Autowired
	Properties properties;

	public static void main(String[] args) {
		SpringApplication.run(AddressToLatLongApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String address = args.length == 0 ? properties.getAddress() : args[0];
		System.out.println(addressToLatLongService.getLatLong(address));
	}
}
