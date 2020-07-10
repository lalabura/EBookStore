package com.tarena.web.action.cart;

import java.util.List;

import org.apache.struts2.json.annotations.JSON;


import com.tarena.web.action.cart.CartItem;

import com.tarena.web.action.BaseAction;

public class CartAction extends BaseAction{
	private int id;
	private int num;
	private boolean flag;//ҳ�湺��ť����ajax����ֵ��������
	public String execute() throws Exception{
//		System.out.println("CartAction");
		return "success";
	}
	/**
	 * �鿴
	 */
	public String view() throws Exception{
		return "success";
	}
	/**
	 * ����
	 */
	public String buy() throws Exception{
		getCart().buy(id);
		flag=true;
		return "success";
	}
	/**
	 * ɾ��
	 */
	public String delete() throws Exception{
		getCart().delete(id);
		return "success";
	}
	/**
	 * �ָ�
	 */
	public String recovery() throws Exception{
		getCart().recovery(id);
		return "success";
	}
	/**
	 * ��������
	 */
	public String modify() throws Exception{
		getCart().update(id, num);
		return "success";
	}

	/**
	 * ��չ��ﳵ
	 */
	public String clear() throws Exception{
		getCart().clearCart();
		return "success";
	}
	
	//��ȡ�������Ʒ�б�
	@JSON(serialize=false)
	public List<CartItem> getCiBuy() throws Exception {
		return getCart().getItems(false);
	}
	//��ȡɾ������Ʒ�б�
	@JSON(serialize=false)
	public List<CartItem> getCiDel() throws Exception {
		return getCart().getItems(true);
	}
	//��ȡ��Ʒ�ܽ��(��ԭ�ۼ���)
	@JSON(serialize=false)
	public double getTotalFixed() throws Exception{
		return getCart().total(true);
	}
	//��ȡ��Ʒ�ܽ��(�������ۼ���)
	@JSON(serialize=false)
	public double getTotalDang() throws Exception{
		return getCart().total(false);
	}
	@JSON(serialize=false)
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	private CartService getCart(){
		return CartFactory.getCart(CartFactory.SESSION_TYPE);
	}
}
