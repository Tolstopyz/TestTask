package testTaskArtefact;

import java.util.logging.Logger;

import ru.yandex.qatools.allure.annotations.Step;

public class ArithmeticOperation {
	
private static Logger log = Logger.getLogger(ArithmeticOperation.class.getName());

	@Step
	public static int resultOperation(int operand1, int operand2, String operation)
	   {
	      int result = 0;
	      switch (operation)
	      {	      
	      case "-":
	    	  log.info("Operation subtraction");
	    	  log.info("Operand1 = " + operand1);
	    	  log.info("Operand2 = " + operand2);
	    	  result = operand1 - operand2;
	    	  log.info("Current results = " + result);
	    	  break;
	      case "+":
	    	  log.info("Operation addition");
	    	  log.info("Operand1 = " + operand1);
	    	  log.info("Operand2 = " + operand2);
	    	  result = operand1 + operand2;
	    	  log.info("Current results = " + result);
	    	  break;
	      case "*":
	    	  log.info("Operation multiplication");
	    	  log.info("Operand1 = " + operand1);
	    	  log.info("Operand2 = " + operand2);
	    	  result = operand1 * operand2;
	    	  log.info("Current results = " + result);
	    	  break;
	      case "/":
	    	  log.info("Operation division");
	    	  if (operand2 == 0)
	    	  {
	        	 log.warning("Divide by 0");
	        	 log.info("Operand1 = " + operand1);
		    	 log.info("Operand2 = " + operand2);
		         throw new ArithmeticException("Divide by 0");
	         }
	         result = operand1/operand2;
	         log.info("Current results = " + result);
	         break;
	      default:
	    	  log.warning("Unexpected character");
	         throw new IllegalArgumentException(); 
	      }
	      return result;
	      }
	}

