package org.tcs;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base{
	
	

public Login() {
	// TODO Auto-generated constructor stub
	
	
	PageFactory.initElements(driver,this);
}

@FindBy(id="username")

private WebElement txtUserName;

@FindBy(id="password")

private WebElement txtPassword;

@FindBy(id="login")

private List<WebElement> txtBtnLogin;

public WebElement getTxtUserName() {
	return txtUserName;
}

public WebElement getTxtPassword() {
	return txtPassword;
}

public List<WebElement> getTxtBtnLogin() {
	return txtBtnLogin;
}
}
