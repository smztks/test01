
/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 11/11/04
 * Time: 11:27
 * To change this template use File | Settings | File Templates.
 */

import org.scalatest.FunSuite

class ElementSuite extends FunSuite {
  test("elem result should have passed") {
    val elem = 1
    assert(elem == 1)
  }
}

object sample01 {
  def main(args: Array[String]) {
    println("sample01f")

    val es = new ElementSuite
    es.execute()
  }
}