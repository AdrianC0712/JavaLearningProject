package accesmodifiers.peopleevidence;

public class Person {
    public String nume;
    private String prenume;
    private long  ID;
    public int ani;
    public String anulNasterii;
    public String sex;
    protected String cetatenia;
    public boolean pensionar;

    public Person(String nume, String prenume, long id)
    {
        this.nume = nume;
        this.prenume = prenume;
        ID = id;

        System.out.println("Un obiect de tip Person a fost creat, folosind un constructor cu 3 parametri formali");
    }

    public Person(String nume, String prenume, long id, int ani, String anulNasterii, String sex, String cetatenia, boolean pensionar)
    {
        this.nume = nume;
        this.prenume = prenume;
        ID = id;
        this.ani = ani;
        this.anulNasterii = anulNasterii;
        this.sex = sex;
        this.cetatenia = cetatenia;
        this.pensionar = pensionar;
        System.out.println("Un obiect de tip Person a fost creat, folosind un constructor cu 8 parametri formali");
    }
}
