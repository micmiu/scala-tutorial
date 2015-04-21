package com.micmiu.demo.scala

/**
 * Created 
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 4/21/2015
 * Time: 16:00
 */
object ListTest {

	def main(args: Array[String]) {
		val oneTwo = List(1, 2)
		val threeFour = List(3, 4)
		val oneTwoThreeFour = oneTwo ::: threeFour
		println("====> List(1, 2) ::: List(3, 4)");
		println("   |_ "+oneTwoThreeFour)

		val twoThree = List(2, 3)
		val oneTwoThree = 1 :: twoThree
		println("====> 1 :: List(2,3)");
		println("   |_ "+oneTwoThree)

		val oneTwoThree2 = 1 :: 2 :: 3 :: Nil
		println("====> 1 :: 2 :: 3 :: Nil");
		println("   |_ "+oneTwoThree2)

	}
}
