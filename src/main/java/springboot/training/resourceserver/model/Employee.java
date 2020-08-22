package springboot.training.resourceserver.model;

import lombok.*;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String empId;
    private String empName;


}
