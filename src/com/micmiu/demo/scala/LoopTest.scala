package com.micmiu.demo.scala

/**
 * Created 
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 5/21/2014
 * Time: 14:40
 */
object LoopTest {

	def main(args: Array[String]) {

		val arrArgs = if(!args.isEmpty) args else Array("Hello", "Michael", "wellcome", "to", "micmiu.com.");

		println("====> Array length = " + arrArgs.length)

		println("====> args.foreach((arg: String) => println(arg))")
		arrArgs.foreach((arg: String) => println(arg))

		println("====> args.foreach(arg => println(arg))")
		arrArgs.foreach(arg => println(arg))

		println("====> args.foreach(println)")
		arrArgs.foreach(println)

		println("====> for (arg <- args) ")
		for (arg <- arrArgs) {
			println(arg)
		}

		println("====> while ")
		var i = 0
		while (i < arrArgs.length) {
			println(arrArgs(i))
			i += 1
		}

	}

}
