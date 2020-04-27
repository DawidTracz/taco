package com.example.tacocloud;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {

  @NotNull
  @Size(min=5, message = "nazwa musi skladac sie z przynajmniej 5 znakow.")
  private String name;
  @Size(min=1, message = "Musisz wybrac co najmniej jeden skladnik.")
  List<String> ingredients;
}
