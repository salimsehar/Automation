package run;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Testnj {
	//third executed Annotation
  @Test
  public void f() {
	  System.out.println("Annotation is  test ");
	  
  }
 // second  executed annotation
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Annotation is before method");
  }
//fourth executed after method
  @AfterMethod
 public void afterMethod() {
	 System.out.println("Annotation is after method");
	  
 }
//first execution annotation
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Annotation before is classe");
	  
  }
//fifth executed Annotation
  @AfterClass
  public void afterClass() {
	  System.out.println("Annotation is after class");
	 
  }
  @Test
  public void f6() {
	  System.out.println("annotation is test");
  }
}
