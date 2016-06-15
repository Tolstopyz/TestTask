package Tests;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import testTaskArtefact.ArithmeticOperation;
import testTaskArtefact.GetTestValues;

@RunWith(Parameterized.class)
public final class TestArithmeticOperations {
	private int operand1;
    private int operand2;
    private String operation;
	private int result;
	private final static String pathToFile = "C:\\1.txt";

    public TestArithmeticOperations(String operand1, String operand2, String operation, String result) {
    this.operand1 = Integer.parseInt(operand1);
    this.operand2 = Integer.parseInt(operand2);
    this.operation = operation;
    this.result = Integer.parseInt(result);
    }
    
    @Parameters
    public static List<String[]> testData() {
    	List<String[]> testData = GetTestValues.readTestFile(pathToFile);
    	return testData;
    	}
    
    @Test
    public void test() {
    	Assert.assertEquals(ArithmeticOperation.resultOperation(operand1, operand2, operation),result);
	}
}
