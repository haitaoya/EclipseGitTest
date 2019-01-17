package com.hgu.simple;

//客户  、消费者
public class Customer_s {
	public static void main(String[] args) {
		TrunkFactory.produceTrunk("宝马").run();
		TrunkFactory.produceTrunk("奥迪").run();
		TrunkFactory.produceTrunk("大众").run();
	}
}
