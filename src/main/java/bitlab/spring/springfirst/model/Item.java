package bitlab.spring.springfirst.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {
    private Long id;
    private String name;
    private String surname;
    private Integer exam;
    private String mark;

    public String getMark(){
        if(this.exam >= 90){
            return "A";
        } else if (this.exam >= 75) {
            return "B";
        } else if (this.exam >= 60) {
            return "C";
        } else if (this.exam >= 50) {
            return "D";
        }else{
            return "F";
        }
    }
}
