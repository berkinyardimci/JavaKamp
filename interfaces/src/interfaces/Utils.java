package interfaces;

//static yapmam�z�n sebebi s�n�f ad�yla eri�mek i�in, customermanager s�n�f�nda newlemiyoruz bu sayede

public class Utils {
	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger: loggers) {
			logger.log(message);
		}
	}
}
