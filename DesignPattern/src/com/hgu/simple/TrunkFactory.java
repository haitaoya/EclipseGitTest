package com.hgu.simple;

//简单工厂的工厂类（业务简单的情况下用）   扩展性差  会违背开闭原则（缺点）
public class TrunkFactory {
	//写成static方法 直接可以调用
	public static Trunk produceTrunk(String message){
		
/*		if("宝马".equals(message)){
			return new BmwTrunk_s();
		}
		else if ("奥迪".equals(message)) {
			return new AodiTrunk_s();
		}else {
			throw new RuntimeException("没有所需求的车，可能在火星"); 
		}*/
		switch (message) {
		case "宝马":
			return new BmwTrunk_s();
		case "奥迪":
			return new AodiTrunk_s();
		case "大众":
			return new DazTrunk();
		default:
			throw new RuntimeException("没有所要的车，可能在火星hhhh"); 
		}
	}
}
