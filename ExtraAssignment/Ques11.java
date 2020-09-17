/*"Hotel serves delicious Menus to its Customers. It maintains list of Orders given on daily basis. 
 * Order list is maintained as ArrayList<Order>. Each Order contains orderid, MenuName, price,  qtyOrdered. 
 * (Price of same Menu may vary according hours).
From ArrayList of Orders create a map <String,Float> where Menu Name is key and total sale in a day 
for theMenu as Value. (sale for the menu is Price*qty ordered).Eg. Order List for a day is :

[(80,”Pav Bhajee”,120.00,5), (90,”Grilled Sandwitch”,72.00,10),   (92,”Hakka Noodles”,220.00,2), (96,”Pav Bhajee”,125.00,8),        (101,”Grilled Sandwitch”,70.00,2)]

Then Map would be like this :
{{“Pav Bhajee”,(120*5)+(125*8) ie.1600},   {“Hakka Noodles”, 440}, {“Grilled Sandwitch”,860}}
"
*/
package ExtraAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Order
{
	private int orderid;
	private String menuName;
	private float price;
	private int qtyOrdered;
	
	public Order() {
	}

	public Order(int orderid, String menuName, float price, int qtyOrdered) {
		super();
		this.orderid = orderid;
		this.menuName = menuName;
		this.price = price;
		this.qtyOrdered = qtyOrdered;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", menuName=" + menuName + ", price=" + price + ", qtyOrdered="
				+ qtyOrdered + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((menuName == null) ? 0 : menuName.hashCode());
		result = prime * result + orderid;
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + qtyOrdered;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (menuName == null) {
			if (other.menuName != null)
				return false;
		} else if (!menuName.equals(other.menuName))
			return false;
		if (orderid != other.orderid)
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (qtyOrdered != other.qtyOrdered)
			return false;
		return true;
	}
	
	
}
public class Ques11 {

	public static void main(String[] args) {
		
		ArrayList<Order> order=new ArrayList<>();
		order.add(new Order(80, "Pav Bhaji", 120.00f, 5));
		order.add(new Order(90, "Grilled Sandwitch", 72.00f, 10));
		order.add(new Order(92, "Hakka Noodles", 220.00f, 2));
		order.add(new Order(96, "Pav Bhaji", 125.00f, 8));
		order.add(new Order(90, "Grilled Sandwitch", 70.00f, 2));
		
		Map<String, Float> m=new HashMap<String, Float>();
		
		Float total=0.0f;
		for(Order o:order)
		{
			total=0.0f;
			if(m.containsKey(o.getMenuName()))
			{
				total=m.get(o.getMenuName());
				m.put(o.getMenuName(), total+(o.getPrice()*o.getQtyOrdered()));
			}
			else
			{
				total=o.getPrice()*o.getQtyOrdered();
				m.put(o.getMenuName(), total);
			}
		}
		
		for(Map.Entry<String, Float> e:m.entrySet())
		{
			System.out.println(e);
		}
	}
}
