

public class People {
    private int id;
    private String name;
    private String surname;
    private RelativeType type;

    public People(int id, String name, String surname, RelativeType type) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public RelativeType getType() {
        return type;
    }

    public void setType(RelativeType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", type=" + type +
                '}';
    }


}
