package MOD1.CRUD.Employees;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class EmployeeService {
    public List<Employees> getEmployees() {
    return List.of(
            new Employees(
                    1L,
                    "Steve",
                    "Steve@gmail.com",
                    LocalDate.of(1992, Month.JUNE, 27),
                    30
            )
    );
    }
}
