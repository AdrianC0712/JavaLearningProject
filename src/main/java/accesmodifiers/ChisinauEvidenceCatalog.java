package accesmodifiers;

import accesmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog
{
    public static void main (String[] args)
    {
        Person ionPerson = new Person("Ion", "Burlacu", 2012022002);
        ionPerson.pensionar = false;

        if (ionPerson.pensionar)
        {
            System.out.println( ionPerson.nume + " ests pensionar!");
        }
        else
        {
            System.out.println(ionPerson.nume + " nu este pensionar!");
        }

        Person daraiPerson = new Person("Daria", "Bulacu", 2012058406, 68, "24.01.1956", "Feminin", "Moldoveanca", true);
        if (daraiPerson.pensionar)
        {
            System.out.println( daraiPerson.nume + " ests pensionar!");
        }
        else
        {
            System.out.println(daraiPerson.nume + " nu este pensionar!");
        }
    }
}
