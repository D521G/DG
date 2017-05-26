class Car{
	//
	public int quantity;//序号
	public String onenumber;//车名
	public int twonumber;//载客数
	public int threenumber;//载货量
	public int day;//日租金（元/天）

	//构造器

	public Car(int quantity,int onenumber,int twonumber,int threenumber,int day){
		this.quantity = quantity;
		this.onenumber = onenumber;
		this.twonumber = twonumber;
		this.threenumber = threenumber;
		this.day = day;
	}


	public void MangUng(){
		String bnxh() = "不许卸货";
		System.out.println(quantity,onenumber,twonumber,threenumber==0?bnxh:threenumber,day);
	} 



	public Car(){};

	//接着输出
	public int Wquantity(){
		return quantity;
	}
	public void setQuantity(int quantity){
	 this.quantity = quantity;
	}
	public int Wonenumber(){
		return onenumber;
	}
	public void setOnenumber(int onenumber){
	 this.twonumber = twonumber;
	}
	public int Wthreenumber(){
		return threenumber;
	}
	public void setThreenumber(int threenumber){
	 this.threenumber = threenumber;
	}
	public int Wday(){
		return day;
	} 
	public void setDay(){
	 this.day = day;
	}

}