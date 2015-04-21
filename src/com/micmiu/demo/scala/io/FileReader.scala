package com.micmiu.demo.scala.io

import scala.io.Source

/**
 * Created 
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 5/19/2014
 * Time: 16:55
 */
object FileReader {
	def main(args: Array[String]) {
		val handler = new FileReadTxt();
		handler.read();
		println("------------");
		handler.readLineNo();
		println("------------");
	}
}

class FileReadTxt {
	val filepath = "README.md";

	def read() = {
		(Source.fromFile(filepath).getLines()).foreach(line => println("[" + line + "]"))
	}

	def readLineNo() = {
		var no = 0;
		(Source.fromFile(filepath).getLines()).foreach(
			line => {
				println("No:" + no + " > " + line)
				no += 1
			}
		)
	}
}
