package airline.model.entity;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@Setter
@Getter


public class Airplane {
    private  int id;
    private String name;
    private String model;

    @Override
    public String toString() {
        return  new Gson().toJson(this);}
}
