package example.view;

import java.io.Serializable;
import java.util.*;

import example.model.Dog;
import example.repository.DogRepository;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="DogsView")
@SessionScoped
public class DogsView implements Serializable {

  private static final long serialVersionUID = 1L;

  public static List<Dog> getDogs() {
    return new ArrayList<Dog>() {{
      add(new Dog(1, "Am Bulldog", "White"));
      add(new Dog(2, "Blue Tick", "Grey"));
      add(new Dog(3, "Labrador", "Black"));
      add(new Dog(4, "Gr Shepard", "Brown"));
    }};
  }
}
