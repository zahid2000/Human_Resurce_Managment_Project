package kodlamaio.hrms.core.utilities.activations;

import java.util.UUID;

public class CodeGenerator{
public static String codeGenerator() {
	return UUID.randomUUID().toString();
}
}
