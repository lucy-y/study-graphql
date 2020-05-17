package lucy.study.graphql;

import lombok.Data;

@Data
public class Coffee {
    private String id;
    private String name;
    private int price;

    public Coffee(String id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

