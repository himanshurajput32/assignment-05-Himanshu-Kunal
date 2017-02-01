package edu.knoldus
import org.scalatest.FunSuite
/**
  * Created by knoldus on 31/1/17.
  */
class CurdAssignmentTest extends FunSuite{
val cal=new CurdAssignment
  test("Insert"){
    assert(cal.insertion()==1)
  }
  test("Delete"){
    assert(cal.deletion()==1)
  }
  test("retrieval"){
    assert(cal.retrieval()==1)
  }
}
