package com.example.tacocloud;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

@Data
public class Order {

  @NotBlank(message = "podanie imienia jest obowiazkowe")
  private String name;
  @NotBlank(message = "podanie ulicy jest obowiazkowe")
  private String street;
  @NotBlank(message = "podanie miasta jest obowiazkowe")
  private String city;
  @NotBlank(message = "podanie wojewodztwa jest obowiazkowe")
  private String state;
  @NotBlank(message = "podanie kodu pocztowego jest obowiazkowe")
  private String zip;
  @CreditCardNumber(message = "to nie jest prawidlowy numer karty")
  private String ccNumber;
  @Pattern(regexp="^(0[1-9]|1[0-2])([/])([1-9][0-9])$", message = "wartosc musi byc w formacie MM/RR.")
  private String ccExpiration;
  @Digits(integer = 3, fraction = 0, message = "Nieprawidlowy kodCVV.")
  @NotBlank(message = "podanie numeru cvv jest obowiazkowe")
  private String ccCVV;

}
