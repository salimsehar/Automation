package run;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Groups {
	/*i)Smoke
	 *ii)Regression
	 *III)Adhoc 
	 */
  @Test(groups = {"smoke"})
  public void f() {
	 System.out.println("smoke test with f");
  }
  @Test(groups = {"adhok","regression"})
  public void f2() {
	  throw new SkipException("Forcing to skip");
	//  System.out.println("adhok or regression with f2");
  }
  @Test(groups= {"regression"})
  public void f6() {
	  System.out.println("regression with f6");
  }	
  @Test(groups= {"smoke","adhok"})
  public void f9() {
	  System.out.println("smoke or adhok with f9");
  }
  @Test(groups= {"adhok"})
  public void f0() {
	  System.out.println("adhoc with f0");
  }
  @Test(groups= {"regression"})
  public void f666() {
	  System.out.println("reggression with f666");
  }
}
