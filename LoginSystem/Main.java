package com.HighLand;

public class Main {

    public static void main(String[] args) {
	IDandPassword iDandPassword = new IDandPassword();

    LoginPage loginPage = new LoginPage(iDandPassword.getLoginInfo());
    }
}
