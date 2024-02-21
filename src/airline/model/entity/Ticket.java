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

public class Ticket {
    private int id;
    private String serial;
    private Passenger passenger;
    private Flight flight;

    @Override
    public String toString() {
        return  new Gson().toJson(this);}
}
