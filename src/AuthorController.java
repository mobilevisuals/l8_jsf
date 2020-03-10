import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Admin
 */
@Named(value = "authorController")
@Dependent
public class AuthorController implements Serializable{

    private String firstname;
    private String lastname;
    private String name;
    private List<Author> authorList = null;

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }


    /**
     * Creates a new instance of AuthorController
     */
    public AuthorController() {
        authorList = new ArrayList<>();
        authorList.add(new Author("Josh", "Juneau"));
        authorList.add(new Author("Carl", "Dea"));
        authorList.add(new Author("Ced", "Dee"));
        authorList.add(new Author("Cc", "Derr"));
        authorList.add(new Author("Carl", "Deffer"));
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}