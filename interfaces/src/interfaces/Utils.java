package interfaces;

//static yapmamýzýn sebebi sýnýf adýyla eriþmek için, customermanager sýnýfýnda newlemiyoruz bu sayede

public class Utils {
	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger: loggers) {
			logger.log(message);
		}
	}
}
