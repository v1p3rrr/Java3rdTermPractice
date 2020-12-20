public class Person {

    private String surname = null;
    private String name = null;
    private String patronymic = null;

    public Person(String surname){
        this.surname=surname;
    }

    public Person(String surname, String name, String patronymic){
        this.surname=surname;
        this.name=name;
        this.patronymic=patronymic;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Person's full name: ").append(surname);
        if (name != null){
            sb.append(" ").append(name);
        }
        if (patronymic != null){
            sb.append(" ").append(patronymic);
        }

        return sb.toString();
    }

    public void printName(){
        System.out.println(toString());
    }
}
