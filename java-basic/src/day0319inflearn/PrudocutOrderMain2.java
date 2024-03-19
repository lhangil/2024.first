package day0319inflearn;

public class PrudocutOrderMain2 {

	public static void main(String[] args) {
		ProductOrder[] orders= new ProductOrder[3];
		orders[0]= createOrder("�κ�", 2000,2);
		orders[1]= createOrder("��ġ", 5000,1);
		orders[2]= createOrder("�ݶ�", 1500,2);
		
		printOrders(orders); //static void printOrders ȣ��
		int totalAmount=getTotalAmount(orders);
		System.out.println("�� ���� �ݾ�:" + totalAmount);
		
	}
	
	static ProductOrder createOrder(String productName, int price, int quantity) { // �̰ǿ� ���ִ°�?

		ProductOrder order = new ProductOrder(); // �̰� �����ִ°�?
		order.productName = productName;
		order.price = price;
		order.quantity = quantity;
		return order;
	}	
	
	static void printOrders(ProductOrder[] orders) {
		for (ProductOrder order : orders) {
			System.out.println("��ǰ��:" + order. productName + 
					",����:"+ order.price +",����:"+order.quantity);}
		
		}
	
	
	static int getTotalAmount(ProductOrder[] orders) {
		int totalAmount = 0;
		for (ProductOrder order : orders) {
			totalAmount += order.price *order.quantity;
		}
		return totalAmount;
		}
	}

