package mygini.model.profiles;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import mygini.model.Address;
import mygini.model.Aitima;
import mygini.model.IstorikoEntry;
import mygini.model.Phone;
import mygini.model.Person;
import mygini.model.readers.AddressReader;
import mygini.model.readers.PersonReader;
import mygini.model.readers.PhoneReader;

/**
 *
 * @author urbanspieces
 */
public class PersonProfile {
    Person person;
    List<Phone> phones;
    List<Address> addresses;
    List<IstorikoEntry> istoriko;
    List<Aitima> endiaferomenos;
    List<Aitima> aiton;
    List<Aitima> mesolabon;
    List<Aitima> ipefthinos;
    
    public PersonProfile(Connection c, long id) throws SQLException{
        this.person = PersonReader.getPersonById(c, id);
        this.phones = PhoneReader.readPersonPhones(c, id);
        this.addresses = AddressReader.getPersonAddress(c, id);
    }
}
