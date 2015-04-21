package com.micmiu.demo.scala

/**
 * Created 
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 5/21/2014
 * Time: 16:23
 */
object ArrayTest {

	def main(args: Array[String]) {

		println("-------------");
		val arr1 = new Array[String](3);
		arr1(0) = "Hello";
		arr1(1) = ", ";
		arr1(2) = "micmiu.com\n";
		for (i <- 0 to 2)
			print(arr1(i))

		println("-------------");
		val arr2 = Array("Hello", ", ", "micmiu.com\n");
		for (i <- 0 to 2)
			print(arr2(i))



	}

}
