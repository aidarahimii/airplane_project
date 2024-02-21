package airline.model.entity;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@SuperBuilder
@NoArgsConstructor
@Setter
@Getter

public class Flight {
    private int id;
    private LocalDate date;
    private String origin;
    private String destination;

    @Override
    public String toString() {
        return  new Gson().toJson(this);}
}
