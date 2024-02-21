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


public class Passenger {
    private int id;
    private String  name;
    private  String family;
    private  String address;
    private int national_code;
    private  int phone_number;


    @Override
    public String toString() {
        return  new Gson().toJson(this);
    }
}
