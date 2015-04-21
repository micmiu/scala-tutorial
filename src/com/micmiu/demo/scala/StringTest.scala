package com.micmiu.demo.scala

/**
 * Created 
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 5/19/2014
 * Time: 16:59
 */
object StringTest {

  def main(args: Array[String]){
    val name = "micmiu.com"
    println(s"Hello, $name")  // Hello, micmiu.com
    println(StringContext("Hello, ", "").s(name))
  }

}
