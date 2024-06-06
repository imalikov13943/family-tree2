package familytree2.OOP.family_tree;

import java.io.*;

public class FileHandler<T extends FamilyMember<T>> implements Serializable {
    private Familytree<T> familyTree;

    public FileHandler(Familytree<T> familyTree) {
        this.familyTree = familyTree;
    }

    public void serialize(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(familyTree);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deserialize(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            familyTree = (Familytree<T>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Familytree<T> getFamilyTree() {
        return familyTree;
    }
}
