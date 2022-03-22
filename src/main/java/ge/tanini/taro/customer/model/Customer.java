package ge.tanini.taro.customer.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "customers")
@SequenceGenerator(name = "customer_sequence",sequenceName = "customers_id_seq",allocationSize = 1)
public class Customer {
    Customer(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.fullName=firstName+" "+lastName;

    }
    @Id
    @GeneratedValue(generator = "customer_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "personal_number")
    private String personalNumber;
    @Column(name ="gender")
    private Gender gender;
    @Column(name ="mobile")
    private String mobile;
    @Column(name ="phone")
    private String phone;
    @Column(name ="mail")
    private String mail;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "factual_address")
    private String factualAddress;
    @Column(name = "juridical_address")
    private String juridicalAddress;
    @Column(name ="status")
    private Boolean status;
    //0 is not active, 1 is active
    @Column(name ="juridical")
    private Boolean juridical;
    //0 is physical customer, 1 is juridical customer
    @Column(name ="create_user")
    Integer createUser;
    @Column(name ="create_location")
    Integer createLocation;
    @Column(name ="create_date")
    LocalDateTime createDate;
    @Column(name ="last_modified_user")
    Integer lastModifiedUser;
    @Column(name ="last_modified_location")
    Integer lastModifiedLocation;
    @Column(name ="last_modified_date")
    LocalDateTime lastModifiedDate;
    @Column(name ="comment")
    private String comment;



    public enum Gender{
        MALE, FEMALE, OTHER
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Customer customer = (Customer) o;
        return id != null && Objects.equals(id, customer.id);
    }
    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
