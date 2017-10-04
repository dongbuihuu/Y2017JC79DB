package JAVACORE_TRAINING.ADVANCED_TOPICs.JDBC_PROVIDERS.MODULES.Module04;

import java.util.UUID;

public class RandomGuiId {
	public static String getGuiId(){
		 UUID uuid = UUID.randomUUID();
	     return uuid.toString();
	}
}
