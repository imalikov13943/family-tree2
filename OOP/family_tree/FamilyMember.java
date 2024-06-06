package familytree2.OOP.family_tree;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public interface FamilyMember<T extends FamilyMember<T>> extends Serializable {
    String getName();
    LocalDate getBirthDate();
    List<T> getChildren();
}
