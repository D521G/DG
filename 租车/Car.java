class Car{
	//
	public int quantity;//���
	public String onenumber;//����
	public int twonumber;//�ؿ���
	public int threenumber;//�ػ���
	public int day;//�����Ԫ/�죩

	//������

	public Car(int quantity,int onenumber,int twonumber,int threenumber,int day){
		this.quantity = quantity;
		this.onenumber = onenumber;
		this.twonumber = twonumber;
		this.threenumber = threenumber;
		this.day = day;
	}


	public void MangUng(){
		String bnxh() = "����ж��";
		System.out.println(quantity,onenumber,twonumber,threenumber==0?bnxh:threenumber,day);
	} 



	public Car(){};

	//�������
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