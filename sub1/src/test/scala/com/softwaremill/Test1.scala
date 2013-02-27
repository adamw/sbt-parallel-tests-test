package com.softwaremill

import org.scalatest._

class Test1 extends FlatSpec {
  it should "work" in {
  	println("Starting test 1 ...")
  	Thread.sleep(5000L)
  	println("Test 1 done")
  }
}