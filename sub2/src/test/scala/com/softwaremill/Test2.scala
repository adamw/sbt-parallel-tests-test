package com.softwaremill

import org.scalatest._

class Test2 extends FlatSpec {
  it should "work" in {
  	println("Starting test 2 ...")
  	Thread.sleep(5000L)
  	println("Test 2 done")
  }
}