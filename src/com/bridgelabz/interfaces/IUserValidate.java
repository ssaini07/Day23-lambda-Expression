package com.bridgelabz.interfaces;

public interface IUserValidate {
  public boolean fnameValidate(String firstName);
  public boolean lNameValidate(String lName);
  public boolean emailValidate(String email);
  public boolean passwordValidate(String password);
  public boolean mobileNumberValidate(String mobileNumber);
}
