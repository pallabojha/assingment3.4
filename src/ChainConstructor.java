/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class ChainConstructor {
    public ChainConstructor(){
		System.out.println("in default constructor");
	}
	public ChainConstructor(int i){
		this();
		System.out.println("in single parameter constructor");
	}
	public ChainConstructor(int i,int j){
		this();
		System.out.println("in double parameter constructor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainConstructor ch=new ChainConstructor(10);
		ChainConstructor ch1=new ChainConstructor(10,20);

	}
}
