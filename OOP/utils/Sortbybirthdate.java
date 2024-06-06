package familytree2.OOP.utils;

import java.util.Comparator;

import familytree2.OOP.family_tree.FamilyMember;

public class Sortbybirthdate<T extends FamilyMember> implements Comparator<T> {
    @Override
    public int compare(T a, T b) {
        return a.getBirthDate().compareTo(b.getBirthDate());
    }
}
