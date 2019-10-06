package org.tcs;

import org.openqa.selenium.WebDriver;

public class Sample extends Base {
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=getDriver();
		loadUrl("https://adactin.com/HotelApp/");	
		Login p=new Login();
				

		type(p.getTxtUserName(),"Kishore27");
		type(p.getTxtPassword(),"selenium27");

		  btnClick(p.getTxtBtnLogin().get(0));
		  
		  
		  Searchhotel s=new Searchhotel();
		  
		  select(s.getLocation(),1);
		  select(s.getHotels(),2);
		  select(s.getRooms(),4);
		  select(s.getRoom(),3);
		  
		 select(s.getChildroom(),1);
		 btnClick(s.getSubmit().get(0));
		 SelectHotel ss=new SelectHotel();
		 
		 btnClick(ss.getRadiobutton());
		 btnClick(ss.getContin());
		 
		 BookHotel h=new BookHotel();
		 
		 type(h.getFirname(),"chandru");
		 
		 type(h.getLname(),"Rajendiran");
		 
		 type(h.getAddress1(),"jdklsfksjfljasfkl");
		 
		 select(h.getCctype(),1);
		 type(h.getCcnum(),"6546787656787656");
		 
		
		 select(h.getCctype(),2);
		 select(h.getMonth(),5);
		 select(h.getYear(),8);
		 
		 type(h.getCvv(),"657");
		 btnClick(h.getBooknow());
		 
		 Bconfirmation bb=new Bconfirmation();
		 Thread.sleep(7000);
		 getAttribute(bb.getOrdernumber(),"value");
		  
		  
		
	}

}
